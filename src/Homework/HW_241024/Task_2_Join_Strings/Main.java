package Homework.HW_241024.Task_2_Join_Strings;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

//    2. Перебрать LinkedList и объединить все строки в одну с использованием разделителя "|".
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

        String singleStr = String.join(" | ", list);
        System.out.println(singleStr + " |");

    }
}
