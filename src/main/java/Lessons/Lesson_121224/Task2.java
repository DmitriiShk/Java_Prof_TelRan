package Lessons.Lesson_121224;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        int[] array = {0,3,-2,4,3,2};

        int[] uniqueArray = removeDuplicates(array);
        System.out.println(Arrays.toString(uniqueArray));

    }

    public static int[] removeDuplicates(int[] array) {
        if (array == null) {
            return new int[0];
        }

        return Arrays.stream(array).distinct().toArray();
    }

}
