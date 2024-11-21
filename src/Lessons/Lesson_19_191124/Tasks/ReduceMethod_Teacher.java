package Lessons.Lesson_19_191124.Tasks;

import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceMethod_Teacher {

    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
//        System.out.println(reduce(list, Integer::sum, 0));
//        System.out.println(reduce(list, (x, y) -> x * y, 1));

        System.out.println(reduce(list, (accumulator, data) -> accumulator + data * data, 0));

    }

    public static Integer reduce(List<Integer> list, BinaryOperator<Integer> operator, Integer basicValue) {
        Integer result = basicValue;
        for (Integer number : list) {
            result = operator.apply(result, number);
        }
        return result;
    }
}
