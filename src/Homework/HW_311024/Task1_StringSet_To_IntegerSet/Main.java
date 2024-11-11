package Homework.HW_311024.Task1_StringSet_To_IntegerSet;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<String> names = new TreeSet<>();
        names.add("John");
        names.add("Mary");
        names.add("Paul");
        names.add("George");
        names.add("Michael");
        names.add("Elisabeth");

        System.out.println("Initial TreeSet:");
        System.out.println(names);

        namesToNameLength(names);

    }

    private static void namesToNameLength(Set<String> names) {

        List<String> nameList = new ArrayList<>(names);

        List<Integer> nameLength = new ArrayList<>();

        for(String name : nameList){
            nameLength.add(name.length());
        }
        System.out.println("Lengths of the names in the set:");
        System.out.println(nameLength);
    }

}
