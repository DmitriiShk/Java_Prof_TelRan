package Lessons.Lesson_21_211124;

import java.util.List;
import java.util.stream.IntStream;

public class Tasks1_3 {

    public static void main(String[] args) {

        /*
        1. Посчитать количество чисел от 1 до 1000, которые делятся на 7.
        */

        System.out.println("Sum of all numbers that can be divided by 7 = " +
                           IntStream.range(1, 1000).filter(n -> n % 7 == 0).sum());
        System.out.println();

        //2. Посчитать сумму квадратов чисел от 1 до 100

        System.out.println("Sum of squares = " + IntStream.range(1, 100).map(n -> n * n).sum());
        System.out.println();

        /*3.
             Дан список слов "Specific" "Measurable" "Achievable" "Relevant" "Time-bound".
             С помощью стримов вывести его аббревиатуру в виде S.M.A.R.T.
        */

        List<String> list = List.of("Specific", "Measurable", "Achievable", "Relevant", "Time-bound");

        String abbreviation = list.stream().map(word -> word.substring(0,1).toUpperCase())
                              .reduce((acc, letter) -> acc + "." + letter).orElse("");

        System.out.println(abbreviation + ".");

    }

}
