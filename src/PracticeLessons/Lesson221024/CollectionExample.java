package PracticeLessons.Lesson221024;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {

        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
             list[i] = i+1;
        }

        System.out.println(Arrays.toString(list));

        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }

        System.out.println(sum);

        List<Integer> list1 = new ArrayList<>();

        int sum1 = 0;
        for (int i = 0; i < 15; i++) {            //Мы можем здесь задавать размер массива
            list1.add((int)(Math.random()*30));   //Заполняем массив случайными числами
            sum1 += list1.get(i);                 //Сразу прибавляем число к сумме
        }                                         //Все можно сделать в одном цикле
        System.out.println(list1);
        System.out.println(sum1);

    }

}
