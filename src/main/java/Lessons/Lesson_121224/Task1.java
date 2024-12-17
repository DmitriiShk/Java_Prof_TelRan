package Lessons.Lesson_121224;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        List<Integer> result = findCommonElements(array1, array2);

        System.out.println("Общие элементы: " + result);

    }

    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        return Arrays.stream(array1).distinct().filter(num -> Arrays.stream(array2)
                     .anyMatch(n -> n == num)).boxed().collect(Collectors.toList());
    }

}
