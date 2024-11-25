package SummarySessions.SumSes_221124.Tasks.Task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        //    1. Имеется два списка элементов.
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

//    С помощью flatMap():
//    a). Получить все возможные значения сумм чисел из обоих списков
        List<Integer> sums = list1.stream().flatMap(num1 -> list2.stream().map(num2 -> num1 + num2)).toList();
        System.out.println("Task 1 - sum: " + sums);
        System.out.println();


//    b). Получить все возможные комбинации пар чисел из обоих списков [1, 4] [2, 6]
        List<int[]> pairs = list1.stream().flatMap(num1 -> list2.stream().map(num2 -> new int[]{num1, num2})).toList();
        pairs.forEach(pair -> System.out.println(Arrays.toString(pair)));

//    с). Найти все пары чисел, сумма которых будет равна заданному значению sum




    }

}
