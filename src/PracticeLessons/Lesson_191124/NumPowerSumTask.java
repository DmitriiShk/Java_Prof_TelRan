package PracticeLessons.Lesson_191124;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumPowerSumTask {

    public static void main(String[] args) {

        // Задача 10: Получение списка квадратов чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Получение списка квадратов чисел
        List<Integer> squares = numbers.stream().map(number -> number * number)
                               .toList();

        // Вывод результата
        System.out.println("List of squares: " + squares);

        // Получение суммы квадратов чисел
        int sumOfSquares = numbers.stream()
                           .mapToInt(number -> number * number)
                           .sum();

        // Вывод результата
        System.out.println("Sum of squares: " + sumOfSquares);

        // Еще один вариант получения квадратов с использованием
        // reduce()
        int sumOfSquares1 = numbers.stream()
                           .map(number -> number * number)
                           .reduce(0, Integer::sum);

        // Вывод результата
        System.out.println("Sum of squares 1: " + sumOfSquares1);

    }

}
