package Lessons.Lesson_8_ArrayList.Tasks.Task3;

import java.util.ArrayList;
import java.util.List;

public class Task3_2 {
    //Есть список интовых значений, вернуть их сумму:

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        int sum = 0;
        for (Integer i : list) {
           sum +=i;
        }
        System.out.println("Sum of array list elements: " + sum);



    }


}
