package Lessons.Lesson_4;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
//        Cat cat1 = new Cat(null, 1);
//        Cat cat2 = new Cat(null, 1);
//        Box box1 = new Box(cat1);
//        Box box2 = new Box(cat2);
//        System.out.println(box1.equals(box2));


        Cat cat1 = new Cat("Cat", 1);
        Cat cat2 = new Cat("Cat", 1);
        Cat cat3 = new BlackCat("Cat", 1, "Black");

        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(cat3));
        System.out.println(Objects.equals(cat2, cat3));

    }

}
