package Lessons.Lesson_8_ArrayList.Tasks.Task1;

import java.util.ArrayList;
import java.util.List;

public class Task1_1 {

//  1. У вас есть список строковых значений, вы должны вернуть список со всеми этими строковыми значениями в верхнем регистре

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(List.of("Value1", "Value2", "Value3"));
        List<String> result = new ArrayList<>();
        for (String s : stringList) {
            result.add(s.toUpperCase());
        }
        System.out.println(result);

    }

}
