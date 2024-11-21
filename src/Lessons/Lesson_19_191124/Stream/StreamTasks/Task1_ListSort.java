package Lessons.Lesson_19_191124.Stream.StreamTasks;

import java.util.Comparator;
import java.util.List;

public class Task1_ListSort {

    public static void main(String[] args) {
        List<String> listOfStrings = List.of("One", "Two", "Three", "Four","Five", "Six");

        List<String> sortedList = listOfStrings.stream().sorted().toList();
        System.out.println(sortedList);

        List<String> reverseSortList = listOfStrings.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(reverseSortList);

    }

}
