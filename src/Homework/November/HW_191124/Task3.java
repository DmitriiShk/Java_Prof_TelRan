package Homework.November.HW_191124;

import java.util.Arrays;

import java.util.*;

public class Task3 {

    public static void main(String[] args) {

        List<String> fullNames = Arrays.asList(
                "Tom Hardy", "Jerry Jones", "Tom Cruise",
                "Alice Cooper", "Bob Marley", "Tom Edison",
                "John Bon Jovi", "Kirk Hammett", "Tom Sawyer"
        );

        List<String> sortedNames = fullNames.stream().sorted().toList();

        //Первые 3 имени по алфавиту
        List<String> firstThree = sortedNames.stream().limit(3).toList();

        //Предпоследнее имя по алфавиту
        // String secondToLast = fullNames.stream().sorted().skip(fullNames.size() - 2)
        // .findFirst().toString();

        //Чтобы убрать Optional в выводе.
        String secondToLast = sortedNames.stream().sorted().skip(fullNames.size() - 2)
                .findFirst().orElse("Not Found");

        //Или такой вариант:
        //String secondToLast = sortedNames.get(sortedNames.size() - 2);

        System.out.println("Первые три по алфавиту: " + firstThree);
        System.out.println("Предпоследнее имя по алфавиту: " + secondToLast);


    }

}
