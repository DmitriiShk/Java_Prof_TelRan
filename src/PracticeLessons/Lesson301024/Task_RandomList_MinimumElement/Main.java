package PracticeLessons.Lesson301024.Task_RandomList_MinimumElement;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> list1 = listGenerator(22, 51);
        System.out.println("Generated list: " + list1);

        //System.out.println("Minimum element of the list: " + getMin(list1));
        System.out.println("Minimum element of the list: " + getMin1(list1));

    }

    public static List<Integer> listGenerator(int listSize, int bound){

        Random random = new Random();
        List<Integer> list = new ArrayList<>(listSize);

        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(bound));
        }
        return list;
    }

    public static int getMin(List<Integer> list){
        int min = list.getFirst();
        for (int i = 0; i < list.size()-1; i++) {
            if(min> list.get(i+1)) min = list.get(i+1);
        }
        return min;
    }

    public static int getMin1(List<Integer> list){
        int min = list.getFirst();
        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            if(min> current) min = current;
        }
        System.out.println("Index of minimum element: " + list.indexOf(min));
        return min;
    }

}
