package Lessons.Lesson_22_261124.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToList {

    public static void main(String[] args) {

        String[] stringArray = {"apple", "banana", "cherry", "pineapple", "kiwi", "peach"};
        List<String> stringList = arrayToList(stringArray);
        System.out.println("String list: " + stringList);

        Integer[] intArray = {1, 2, 3, 4};
        List<Integer> intList = arrayToList(intArray);
        System.out.println("Integer list: " + intList);
    }

    public static <T> List<T> arrayToList(T[] array) {
    // Должна быть проверка массива на null типа:
    // if (array == null) {
    // throw какое-то исключение (не знаю какое)("Массив пустой");
    //        }
        return Arrays.stream(array).toList();
    }
}

