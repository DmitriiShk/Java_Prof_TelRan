package Homework.October.HW_241024.Task_1_MinLength;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //     1. Перебрать LinkedList и найти самую короткую строку.
        LinkedList<String> list = new LinkedList<>();
        list.add("Deep");
        list.add("into");
        list.add("that");
        list.add("darkness");
        list.add("peering");
        list.add("long");
        list.add("I");
        list.add("stood");
        list.add("there");
        list.add("wondering");
        list.add("fearing");

        System.out.println(list);
        System.out.println();

        System.out.println("Task No.1");

        String min = list.getFirst();
        for(String s : list){
            if(s.length()<min.length()){
                min = s;
            }
        }
        System.out.println("The element of the minimum length in the list is " + "'" + min + "'.");
        System.out.println();

    }

}
