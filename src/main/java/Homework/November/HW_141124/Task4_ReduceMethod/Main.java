package Homework.November.HW_141124.Task4_ReduceMethod;

import java.util.List;
import java.util.function.BinaryOperator;

public class Main {

    public static Integer reduce(List<Integer> list, BinaryOperator<Integer> operator, Integer basicValue) {
        Integer result = basicValue;
        for (Integer value : list) {
            result = operator.apply(result, value);
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5);

        // Сумма всех чисел
        Integer sum = reduce(list, Integer::sum, 0);
        System.out.println("Sum: " + sum);

        // Произведение всех чисел
        Integer product = reduce(list, (i, j) -> i * j, 1);
        System.out.println("Product: " + product);

    }

}
