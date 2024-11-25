package SummarySessions.SumSes_221124.Tasks.Task1;

import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        int sum = 7;
        //1.Выводим значения list1 в поток, добавляем значения со значениями list2
        List<int[]> pairs = list1.stream().flatMap(num1 -> list2.stream()
        //2.вводим правило фильтрации, где сумма элементов должна быть равна sum
                            .filter(num2 -> num1 + num2 == sum)
        //3.объединяем полученные значения в массив int
                            .map(num2 -> new int[]{num1, num2}))
        //4.получаем список
                            .toList();

        //5.Выводим результат
        pairs.forEach(pair -> System.out.println(Arrays.toString(pair)));

    }

}
