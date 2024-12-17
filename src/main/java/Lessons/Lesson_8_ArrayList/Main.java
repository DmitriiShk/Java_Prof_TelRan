package Lessons.Lesson_8_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        list.add("E");
//
//        System.out.println(list.get(4));
//        System.out.println(list.get(3));
//        System.out.println(list.get(2));
//        System.out.println(list.get(1));
//        System.out.println(list.get(0));
//
//        System.out.println(list);
//
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(3);
//        list1.add(4);
//        list1.add(5);
//
//        for(Integer i : list1){
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        System.out.println("List 1: " + list1);
//
//        System.out.println();
//
//        for (int i = 0; i < list.size(); i++) { //Вместо array.length(), используется arrayList.size().
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        list.set(3, "New value"); //Устанавливается новое значение "New value" с индексом 3.
//        System.out.println("List: " + list);
//
//        list.add(0, "Added Element");
//        System.out.println(list);

        //1. String list in upper case:
        List<String> listTask1 = new ArrayList<>();
        listTask1.add("One");
        listTask1.add("Two");
        listTask1.add("Three");
        listTask1.add("Four");
        listTask1.add("Five");

        for(String s : listTask1){
            String element = s;
            System.out.println(element.toUpperCase());
        }

        System.out.println();

        //2. Integer list multiplied by 2:
        List<Integer> listTask2 = new ArrayList<>();
        listTask2.add(1);
        listTask2.add(2);
        listTask2.add(3);
        listTask2.add(4);
        listTask2.add(5);
        listTask2.add(6);

        for(Integer i : listTask2){
            int element = i;
            System.out.println(element*2);
        }

        System.out.println();

        //3.
        List<String> listTask3 = new ArrayList<>();
        listTask3.add("Каждый");
        listTask3.add("охотник");
        listTask3.add("желает");
        listTask3.add("знать");
        listTask3.add("где");
        listTask3.add("сидит");
        listTask3.add("фазан");

        System.out.println(listTask3);

        for(String s : listTask3){
            String element = s;
            if(s.length() == 1) System.out.println("Длинна элемента " + s.toLowerCase() + ": " + element.length() + " символ.");
            else if(s.length() == 3 || s.length() == 4) System.out.println("Длинна элемента " + s.toLowerCase() + ": " + element.length() + " символа.");
            else System.out.println("Длинна элемента " + s.toLowerCase() + ": " + element.length() + " символов.");
        }



    }


}
