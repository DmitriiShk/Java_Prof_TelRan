package Lessons.Lesson_8_ArrayList.Tasks.Task3;

import java.util.ArrayList;
import java.util.List;

public class Task3_1 {

    public static void main(String[] args) {
        //Список значений String вернуть в строку, которая представляет собой конкатенацию всех значений.

        List<String> list = new ArrayList<>();
        list.add("To");
        list.add("be");
        list.add("or");
        list.add("not");
        list.add("to");
        list.add("be");
        list.add("that");
        list.add("is");
        list.add("the");
        list.add("question");
        System.out.println("Initial list: " + list);

        System.out.println();

        String result = String.join(" ", list);
        System.out.println("Result: " + result + ".");

    }

}
