package Homework.November.HW_281124;

import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceMethod {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, -7, 1, 9, 6);
        System.out.println(reduce(list, Integer::sum, 0)); // sum of numbers
        System.out.println(reduce(list, (accumulator, data) -> accumulator * data, 1)); // multiply
        System.out.println(reduce(list, (accumulator, data) -> accumulator + data * data, 0)); // sum of squares
        System.out.println(reduce(list, Integer::max, list.iterator().next())); // max of numbers
    }

    public static <T> T reduce(List<T> list, BinaryOperator<T> operator, T basicValue) {
        T result = basicValue;
        for (T element : list) {
            result = operator.apply(result, element);
        }
        return result;
    }

}
