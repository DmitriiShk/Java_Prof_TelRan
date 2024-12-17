package Homework.HW1_260924_CanInABox;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat(null, 1);
        Cat cat2 = new Cat(null, 1);
        Box box1 = new Box(cat1);
        Box box2 = new Box(cat2);
        System.out.println(box1.equals(box2));

    }

}
