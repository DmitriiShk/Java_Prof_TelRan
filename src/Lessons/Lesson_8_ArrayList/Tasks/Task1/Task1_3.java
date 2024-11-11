package Lessons.Lesson_8_ArrayList.Tasks.Task1;

import java.util.*;

public class Task1_3 {

    // 3. У вас есть список значений String, вы должны вернуть список количества символов этих String

    public static void main(String[] args) {

        List<String> stringList2 = new ArrayList<>(List.of("One", "Two", "Three", "Four", "Five"));
        List<Integer> result3 = new ArrayList<>();
        for (String s : stringList2) {
            result3.add(s.length());
        }
        System.out.println(result3);

    }

}
