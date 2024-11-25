package Homework.HW_211124;

import java.util.*;
import java.util.stream.*;

public class HW2 {

    /*
    С помощью IntStream и метода flatmap() получить все тройки пифагоровых чисел менее 1000.
    (Пифагорова тройка - упорядоченный набор из трёх натуральных чисел (a, b, c),
    удовлетворяющих уравнению a^2 + b^2 = c^2. Например, [3, 4, 5], [6, 8, 10]).
     */

    //Сам до решения не додумался. Использовал чат GPT :(
    // Но и он дал правильное решение только с 3й попытки.

    public static void main(String[] args) {
        List<int[]> triples = IntStream.rangeClosed(1, 999)
                .boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 999)
                        .boxed()
                        .flatMap(b -> IntStream.rangeClosed(b, 999)
                                .filter(c -> a * a + b * b == c * c)
                                .mapToObj(c -> new int[]{a, b, c})))
                        .toList();

        // Вывод результатов
        triples.forEach(triple -> System.out.println("[" + triple[0] +
                                  ", " + triple[1] + ", " + triple[2] + "]")
        );
    }
}

