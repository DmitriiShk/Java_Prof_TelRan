package Lessons.Lesson_18_141124;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FuncInterfaceExamples {

    public static void main(String[] args) {

        //void -> void
        System.out.println("Hello Java!");

        Supplier<String> supplier = () -> {
            process();
            return null;
        };

        supplier.get();

        Consumer<String> consumer = data -> process();
        consumer.accept(null);


    }

    public static void process() {
        System.out.println("Hello, World!");
    }


}
