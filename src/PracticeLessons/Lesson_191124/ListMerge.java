package PracticeLessons.Lesson_191124;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListMerge {

    // Задача 15: Объединение двух списков в один

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

        //Объединяем списки, переведенные в стримы, собираем из них один список.
        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream())
                                   .collect(Collectors.toList());

        System.out.println(mergedList);


    }



}
