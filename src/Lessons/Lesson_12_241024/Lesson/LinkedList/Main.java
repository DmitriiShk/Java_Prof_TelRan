package Lessons.Lesson_12_241024.Lesson.LinkedList;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        List<String> list = new LinkedList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");

        System.out.println("First output: " + list);

        LinkedList<String> list1 = new LinkedList<>(list);
        list1.addFirst("first");
        list1.addLast("last");

        System.out.println("Second output: " + list1);

        list1.removeFirst();
        list1.removeLast();

        System.out.println("Third output: " + list1);

        //1. Iterator

        for (String s : list){
            System.out.print(s + " ");
        }
        System.out.println();

        Iterator x = list1.descendingIterator();

        while(x.hasNext()){
            System.out.print(x.next() + " ");
        }


    }

}
