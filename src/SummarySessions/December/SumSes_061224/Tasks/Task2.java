package SummarySessions.December.SumSes_061224.Tasks;

import java.util.Arrays;
import java.util.List;

public class Task2 {

    /*
    2) Разбить текст на список отдельных строк этого текста.
     */

    public static void main(String[] args) {

        String text = "Первая строка, вторая строка, третья строка, четвертая строка";

        String[] lines = text.split(",\\s*");

        List<String> linesList = Arrays.asList(lines);

        linesList.forEach(System.out::println);
    }

}
