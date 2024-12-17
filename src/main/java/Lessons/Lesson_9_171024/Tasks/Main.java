package Lessons.Lesson_9_171024.Tasks;

import java.util.*;

public class Main {

//    1. Дан список из числовых данных. С помощью итератора:
//            - Напечатать только четные числа из списка.
//            - Удалить из списка все числа, заканчивающиеся на 0.
//            - Составить список квадратов чисел.

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(20);
        list.add(8);
        list.add(6);
        list.add(30);

        //1.
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            int element = iterator.next();
            if(element%2 == 0)
                System.out.print(element + " ");
        }
        System.out.println();

        //2.
        System.out.println("Task 2");
        Iterator<Integer> iterator1 = list.iterator();

        while(iterator1.hasNext()){
            int element = iterator1.next();
            if(element%10 == 0) iterator1.remove();;
        }
        System.out.println(list);

        System.out.println();

        //3.
        System.out.println("Task 3");
        Iterator<Integer> iterator2 = list.iterator();
        List<Integer> newList = new ArrayList<>();
        while(iterator2.hasNext()){
            int element = iterator2.next();
            newList.add(element);
        }
        System.out.println(newList);


    }

}
