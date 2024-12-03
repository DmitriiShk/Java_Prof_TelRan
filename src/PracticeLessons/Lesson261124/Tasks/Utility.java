package PracticeLessons.Lesson261124.Tasks;

/*
В не обобщенном классе Utility реализуйте статический обобщенный
метод printArray, который может выводить элементы любого массива.
 */

import java.util.Arrays;

public class Utility {

    public static void main(String[] args) {

    }

    public static <T> void printArray(T[] array){
        System.out.println(Arrays.toString(array));
    }


}
