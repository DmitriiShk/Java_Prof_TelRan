package Lessons.Lesson_18_141124.LamdaVsAnonymClass;

import org.w3c.dom.ls.LSOutput;

public class UseA {

    public static void main(String[] args) {
    //Интерфейс можно переопределить как через анонимный класс и
    //через лябда-выражения.

        A a = new A() {

            public void method(){
                System.out.println("Method of anonymous class");
            }
        };

        a.method();

        //Лябда выражения могут переопределять только интерфейсы, а не классы
        A a2 = () -> System.out.println("Method of Lambda");

    }

}
