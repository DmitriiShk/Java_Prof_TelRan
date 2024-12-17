package Lessons.Lesson_19_191124.Tasks;

import java.util.List;
import java.util.function.BinaryOperator;

public class MaxElement {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Метод для нахождения максимального элемента
        int maxElement = findMax(list);

        // Вывод результата
        System.out.println("Максимальный элемент: " + maxElement);
    }

    public static int findMax(List<Integer> list) {
        // Создаём BinaryOperator для поиска максимума
        BinaryOperator<Integer> maxOperator = (a, b) -> a > b ? a : b;

        // Используем reduce для нахождения максимального элемента, начальное значение минимально возможное
        return list.stream().reduce(Integer.MIN_VALUE, maxOperator);
    }
}



