package Lessons.Lesson_8_ArrayList.Tasks.Task1;

import java.util.*;


public class Task1_2 {

    // 2. У вас есть список значений Integer, вы должны вернуть список, каждое значение которого умножается на 2

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        List<Integer> result2 = new ArrayList<>();
        for (Integer i : integerList) {
            result2.add(i * 2);
        }
        System.out.println(result2);

    }
}
