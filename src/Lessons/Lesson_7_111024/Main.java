package Lessons.Lesson_7_111024;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Murka", 3, "Black");
        Cat cat2 = new Cat("Mashka", 2, "White");
        System.out.println(cat1);

        Box box1 = new Box("BigBox", true, cat1);
        Box box2 = new Box("Second Box", true, cat2);

//        System.out.println(box1);
//        System.out.println(box2);
//        box1.emptyBox();
//        System.out.println(box1);
//        System.out.println();
//        box1.shallowCopy();
//        System.out.println(box2);

          System.out.println(box1.equals(box2));
          box1.shallowCopy();
          Box box3 = box1.shallowCopy();
          System.out.println("box3 = " + box3);
        System.out.println("box3.equals(box1) = " + box3.equals(box1));
        System.out.println("box1 = box3 " + (box1 == box3));
        System.out.println(Objects.equals(box1.getCat(), box2.getCat()));


    }

}
