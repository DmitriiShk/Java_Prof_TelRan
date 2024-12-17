package Lessons.Lesson_12_241024.Lesson.CycleExamples;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> data = List.of("A", "B", "C", "D", "E", "F");
        List<String> list1 = new ArrayList<>(data);
        List<String> list2 = new LinkedList<>(data);

        for (int i = 0; i < list1.size(); i++) { //O(n)
            System.out.println(list1.get(i));
        }

        for (int i = 0; i < list2.size(); i++) { //O(n2)
            System.out.println(list2.get(i));
        }

        for (String s : list1){     //O(n)
            System.out.println(s);
        }

        for (String s : list2){     //O(n) since iterator has indices, which makes for each O(n) more effective than for i.
            System.out.println(s);
        }

        Iterator<String> iterator = list2.iterator(); // O(n) is identical to for each cycle but offers more methods.
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }



}
