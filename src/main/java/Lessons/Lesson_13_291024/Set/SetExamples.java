package Lessons.Lesson_13_291024.Set;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExamples {

    public static void main(String[] args) {
        //Set<String> set = new TreeSet<>();
        Set<String> set = new TreeSet<>(Comparator.reverseOrder()); //При добавлении компаратора, возможна сортировка в обратном порядке.
        set.add("A");
        set.add("B");
        set.add("G");       //Порядок добавления элементов неважен. Они хранятся в отсортированном виде
        set.add("Z");       //Дубликаты элементов не добавляются
        set.add("K");
        set.add("Y");

        System.out.println(set);

        TreeSet<String> treeSet = (TreeSet<String>) set;
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet("K")); //К не включается.
        System.out.println(treeSet.tailSet("G"));//G включается.

    }



}
