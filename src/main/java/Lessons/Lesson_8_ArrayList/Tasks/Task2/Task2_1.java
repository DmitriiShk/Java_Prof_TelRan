package Lessons.Lesson_8_ArrayList.Tasks.Task2;

import java.util.*;

public class Task2_1 {

    //1. Есть список значений String, вернуь список со значениями более 3 символов:
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("is");
        list.add("the");
        list.add("best");
        list.add("programming");
        list.add("language");
        list.add("in");
        list.add("the");
        list.add("world");
        list.add("?");


        ArrayList<String> newList = new ArrayList<>();
        for(String s : list){
            if(s.length()>3) newList.add(s);;
        }
        System.out.println("New list: " + newList);
    }

}
