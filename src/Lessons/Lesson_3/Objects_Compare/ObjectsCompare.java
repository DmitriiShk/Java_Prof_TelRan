package Lessons.Lesson_3.Objects_Compare;

public class ObjectsCompare {

    public static void main(String[] args) {

        Item item1 = new Item("Item");
        Item item2 = new Item("Item");

        System.out.println(item1==item2);
        System.out.println(item1.equals(item2));

        Integer i = 19;
        System.out.println(item1.equals(i)); //We can compare all kinds of objects

        System.out.println(item2.equals(null));

        Item item3 = new Item(null);
        System.out.println(item1.equals(item3));

        Item item4 = new Item(null);
        System.out.println(item3.equals(item4));

    }

}
