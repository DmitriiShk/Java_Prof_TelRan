package PracticeLessons.Lesson_191124;

import java.util.Arrays;
import java.util.List;

public class ListLimit {

    public static void main(String[] args) {

        // Задача 14: Сокращение списка до указанного размера (например 5)
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> limitedList = numbers.stream().limit(5).toList();
        System.out.println(limitedList);


    }

}
