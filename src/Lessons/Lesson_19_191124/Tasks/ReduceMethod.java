package Lessons.Lesson_19_191124.Tasks;

import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceMethod {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Метод для вычисления суммы квадратов чисел
        int sumOfSquares = sumOfSquares(list);

        // Вывод результата
        System.out.println("Сумма квадратов чисел: " + sumOfSquares);
    }

    public static int sumOfSquares(List<Integer> list) {
        // Инициализируем операцию редуцирования
        BinaryOperator<Integer> sumSquares = (a, b) -> a + b * b;

        // Используем редукцию, начиная с 0
        int result = 0;
        for (Integer number : list) {
            result = sumSquares.apply(result, number);
        }
        return result;
    }
}
