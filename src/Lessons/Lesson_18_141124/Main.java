package Lessons.Lesson_18_141124;

import java.util.List;

public class Main {

    public static void main(String[] args) {

    List<String> list = List.of("A", "B", "C", "D", "E");
    String delimiter = " | ";
    list.forEach(element-> System.out.print(element + delimiter));

    }

}
