package Lessons.Lesson_12_241024.HW_Review;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Mary", "Jane", "Tom", "Tim", "Ann", null, ""));

        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();
            if (element == null || element.isEmpty()){
                iterator.remove();
            }
        }
        System.out.println(names);

        Iterator<String> iterator1 = names.iterator();

        while(iterator1.hasNext()){
            String element = iterator1.next();
            if (element.length() == 4){
                System.out.print(element + " ");
            }
        }

    }



}
