package Lessons.Lesson_8_ArrayList.Tasks.Task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {


    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>(List.of("To", "be", "or", "not", "to", "be"));

        List<String> list2 = new ArrayList<>(List.of("that", "is", "the", "question"));

        System.out.println(joinStringLists(list1, list2));

        //Как вариант :)
        //ArrayList<Object> list3 = new ArrayList<>(List.of(list1, "that", "is", "the", "question"));

    }

    public static List<String> joinStringLists(List<String> arrayA, List<String> arrayB){
        List<String> listC = new ArrayList<>(arrayA);
        listC.addAll(arrayB);
        return listC;
    }

    public static List<Integer> joinIntegerLists(List<Integer> arrayA, List<Integer> arrayB){
        List<Integer> listC = new ArrayList<>(arrayA);
        listC.addAll(arrayB);
        return listC;
    }

}
