package Lessons.Lesson_6_101024_ClassRelation.Task;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] data = {"One", "Two", "Three"};
        System.out.println("Initial array: " + Arrays.toString(data));
        System.out.println("Array length: " + data.length);
        reverseArray(data);
        System.out.println();

        String[] rainbow = {"Каждый", "Охотник", "Желает", "Знать", "Где", "Сидит", "Фазан"};
        System.out.println(Arrays.toString(rainbow));
        System.out.println("Array length: " + rainbow.length);
        reverseArray(rainbow);

    }

    private static void reverseArray (String[] array) {
        int n = array.length; //Переменная, которая будет использоваться при обмене элементов
        String temp;

        for (int i = 0; i < n/2; i++) {
            temp = array[n-i-1];
            array[n-i-1] = array[i];
            array[i] = temp;

//      1.
//            temp = array[3-0-1];            //array[3-0-1] = array[2] - последний элемент массива / перемещаем в temp.
//            array[3-0-1] = array[0];        //array[2] = array[0] - делаем последний элемент первым.
//            array[0] = temp;                //первый перемещаем в темп.

//      2.
//            temp = array[3-1-1];            //array[1] - второй элемент массива / перемещаем в temp.
//            array[3-1-1] = array[1];        //array[1] = array[1] - второй элемент остается на месте.
//            array[0] = temp;                //первый перемещаем в темп.

//      3.    Первый элемент массива становится последним.

        }
        //Вывод конечного массива в консоль
        System.out.println("Resultant array: " + Arrays.toString(array));
    }


}
