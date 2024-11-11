package Lessons.Lesson_9_171024.Iterator;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        //1.
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            System.out.println("element = " + element);
        }
        System.out.println();
        //2.
        for(String s: list){
            String element = s;
            System.out.println("element = " + element);
        }
        System.out.println();
        //2.1
        for(String s: list){
            System.out.print(s + " ");
        }
        System.out.println();
        //2.2
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        iterator.hasNext(); //boolean есть ли следующий элемент?
        iterator.next(); //Переход к следующему элементу.

        System.out.println();

        Iterator<String> iterator1 = list.iterator();

        while(iterator1.hasNext()){
            String element = iterator1.next();
            System.out.print(element + " ");
        }




    }

}
