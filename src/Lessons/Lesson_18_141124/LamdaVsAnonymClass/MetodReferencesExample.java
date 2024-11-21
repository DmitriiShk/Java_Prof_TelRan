package Lessons.Lesson_18_141124.LamdaVsAnonymClass;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class MetodReferencesExample {

    public static void main(String[] args) {

        //В лямбда-выражениях мы не пишем свою собственную логику, но вызываем
        //другие методы.
        Consumer<String> consumer = string -> System.out.println(string);
        consumer.accept("data");
        consumer = string -> staticMethod(string);
        consumer.accept("data");
        consumer = MetodReferencesExample::staticMethod;
        consumer.accept("data");
        MetodReferencesExample mte = new MetodReferencesExample();
        consumer = mte::nonStaticMethod;
        consumer.accept("data");
        System.out.println();

        BiConsumer<String, String> biConsumer = MetodReferencesExample::staticMethod;
        biConsumer.accept("string1", "string2");

        Supplier<Data> dataSupplier = Data::new; //Создается экземпляр класса Data
        //Верхняя строчка идетнична нижней. Газдый
        dataSupplier = () -> new Data();
        //Каждый вызов функции get() будет создавать новый экземпляр класса Data.
        dataSupplier.get();


    }

    static class Data{

    }


    public static void staticMethod(String data){
        System.out.println("Processing of data by static method: " + data);
    }

    public static void staticMethod(String string1, String string2){
        System.out.println("Processing of two arguments by static metohd: " + string1 + " and " + string2);
    }

    public void nonStaticMethod(String data){
        System.out.println("Processing of data by static method: " + data);

        Consumer<String> consumer = this::nonStaticMethod2;
        consumer.accept(data);
    }

    public void nonStaticMethod2(String data){
        System.out.println("Processing of data by static method: " + data);
    }
}
