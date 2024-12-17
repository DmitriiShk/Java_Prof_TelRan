package Lessons.Lesson_8_ArrayList.Tasks.Task2;

import java.util.ArrayList;
import java.util.List;

public class Task2_3 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("To");
        list.add("be");
        list.add("or");
        list.add("not");
        list.add("to");
        list.add("be");
        list.add("that");
        list.add("is");
        list.add("the");
        list.add("question");
        System.out.println("Initial list: " + list);

        System.out.println();

        List<String> noDuplicatesList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String current = list.get(i).toLowerCase();
            for(int j = 1; j<list.size(); j++){
                if (!noDuplicatesList.contains(current)) {
                     noDuplicatesList.add(current);
                }
            }
        }
        System.out.println("New list with unique elements: " + noDuplicatesList);

//        for (String s : list){
//            if(!noDuplicatesList.contains(s)) noDuplicatesList.add(s);
//        }
//
//        System.out.println("New list with unique elements: " + noDuplicatesList);

    }

}
