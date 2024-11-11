package Lessons.Lesson_8_ArrayList.Tasks.Task2;

import java.util.ArrayList;
import java.util.List;

public class Task2_2 {

    //2. Есть список значений int, вернуь список, содержащий только нечетные числа:
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        ArrayList<Integer> newList = new ArrayList<>();
        for(Integer i : list){
            if(i%2 !=0) newList.add(i);;
        }
        System.out.println("New list: " + newList);
    }

}
