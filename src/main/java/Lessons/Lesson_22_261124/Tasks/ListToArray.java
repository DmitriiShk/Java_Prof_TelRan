package Lessons.Lesson_22_261124.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToArray {

    public static void main(String[] args) {

        List<String> stringList = List.of("apple", "banana", "cherry", "pineapple", "kiwi", "peach");
        String[] stringArray = listToArray(stringList);
        System.out.println("String array: " + String.join(", ", stringArray));


        List<Integer> intList = List.of(1, 2, 9, 4, 7, 5, 10, 8, 3);
        Integer[] intArray = listToArray(intList);
        System.out.println("Integer array: " + Arrays.toString(intArray));
    }

    public static <T> T[] listToArray(List<T> list) {
        return (T[]) list.toArray();
    }

}

