package Homework.HW_191124;

import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

/*
 С помощью стримов посчитать количество неповторяющихся слов в списке
*/

    List<String> list = Arrays.asList("Banana", "Apple", "Pear", "Peach",
                             "Plum", "Ananas", "Banana", "Pear", "Peach");

    int uniqueWordCount = (int) list.stream().distinct().count();

    System.out.println("Количество неповторяющихся слов: " + uniqueWordCount);

    }

}
