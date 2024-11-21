package Lessons.Lesson_19_191124.Stream.StreamTasks;

import java.util.List;

public class Task2_Integer_To_String {

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(integerList);

        List<String> stringList = integerList.stream().map(String::valueOf).toList();
        System.out.println("stringList = " + stringList);

    }

}
