package Lessons.Lesson_19_191124.Tasks;

import java.util.List;

public class ReduceMethod_w_Stream {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Метод для вычисления суммы квадратов чисел
        int sumOfSquares = sumOfSquares(list);

        // Вывод результата
        System.out.println("Сумма квадратов чисел: " + sumOfSquares);
    }

    public static int sumOfSquares(List<Integer> list) {
        // Используем метод reduce с операцией для вычисления суммы квадратов
        return list.stream()
                .map(x -> x * x) // Преобразуем каждый элемент в его квадрат
                .reduce(0, Integer::sum); // Суммируем все квадраты
    }
}




