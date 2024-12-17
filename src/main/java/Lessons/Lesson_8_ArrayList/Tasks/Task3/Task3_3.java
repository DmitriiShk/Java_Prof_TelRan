package Lessons.Lesson_8_ArrayList.Tasks.Task3;

import java.util.ArrayList;
import java.util.List;

public class Task3_3 {

    //Есть список интовых значений, вернуть максимальное значение:

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        int max = list.getFirst();

        for (Integer i : list) {
            if (i > max) max = i;
        }
        System.out.println("Maximum element of the array list is: " + max);
    }
}


