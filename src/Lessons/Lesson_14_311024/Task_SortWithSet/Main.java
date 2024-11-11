package Lessons.Lesson_14_311024.Task_SortWithSet;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(0, 2, 3, -2, 5, 9, 12, 60, -10));

        sortWithSet(list);
        System.out.println(list);

    }

//    public static void sortWithSet(List<Integer> list){
//        Set<Integer> sortedSet = new TreeSet<>(list);
//        List<Integer> sortedList = new ArrayList<>(sortedSet);
//        Collections.sort(sortedList);
//        System.out.println(sortedList);
//    }

    public static void sortWithSet(List<Integer> list){
        //Set<Integer> sortedSet = new TreeSet<>(list);
        Set<Integer> sortedSet = new TreeSet<>();
        for (Integer data : list){ //O(n)
            sortedSet.add(data); //O(lon n)
        }
        int index = 0;
        for (Integer data : sortedSet){//O(n)
            list.set(index++, data);
        }
    }



}
