package Lessons.Lesson_18_141124.Task1;

import java.util.Arrays;
import java.util.function.BinaryOperator;

//Написать метод, который на входе принимает два массива одинакового размера типа Integer и функцию (лямбда выражение).
//Метод возвращает массив, в котором хъранятся результаты попарных вычислений (например: элемент первого массива
// умножается на первый элемент второго массива, итд.) согласно переданной функции.

public class Main {

    public static void main(String[] args) {

        Integer[] data1 = {1, 2, 3, 4, 5};
        Integer[] data2 = {5, 8, 10, 12, 11};

        Integer[] result = applyFunctionToArray(data1, data2, (int1, int2) -> (int1 * int2));

        Integer[] result1 = applyFunctionToArray(data1, data2, (int1, int2) -> (int1 + int2));

        Integer[] result2 = applyFunctionToArray(data1, data2, (int1, int2) -> (int2 - int1));

        Integer[] result3 = applyFunctionToArray(data1, data2, (int1, int2) -> (int2/int1));

//        // Вывод результатов для проверки
//        System.out.println("Результат умножения: ");
//        for (Integer value : result) {
//            System.out.print(value + " ");
//        }
//
//        System.out.println("\nРезультат сложения: ");
//        for (Integer value : result1) {
//            System.out.print(value + " ");
//        }
    }

    public static Integer[] applyFunctionToArray(Integer[] data1, Integer[] data2, BinaryOperator<Integer> operator) {

        if (data1.length != data2.length) {
            throw new IllegalArgumentException("Массивы должны быть одинакового размера.");
        }

        Integer[] result = new Integer[data1.length];

        for (int i = 0; i < data1.length; i++) {
            result[i] = operator.apply(data1[i], data2[i]);
        }

        System.out.println(Arrays.toString(result));

        return result;
    }
}




