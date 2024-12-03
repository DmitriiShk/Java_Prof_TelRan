package Lessons.Lesson_22_261124;

import java.util.List;

public class Main {

    public static void main(String[] args) {

    GenericClass<String> genericClass = new GenericClass<>("Generics");
    GenericClass<Integer> genericClass1 = new GenericClass<>(15);

    genericClass.nonStaticMethod();
    genericClass1.nonStaticMethod();

    }

}
