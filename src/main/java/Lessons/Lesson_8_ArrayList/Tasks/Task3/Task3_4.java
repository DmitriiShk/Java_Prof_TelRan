package Lessons.Lesson_8_ArrayList.Tasks.Task3;

import java.util.ArrayList;
import java.util.List;

public class Task3_4 {

    //Список значений String вернуть максимальную длину строки.

    public static void main(String[] args) {

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

        int max = list.getFirst().length();
        for(String s : list){
            if (s.length() > max) max = s.length();
        }
        System.out.println("Maximum string length is: " + max);




    }

}
