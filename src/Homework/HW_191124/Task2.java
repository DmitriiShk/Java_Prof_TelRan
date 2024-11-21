package Homework.HW_191124;

import java.util.Arrays;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        /*
        С помощью стримов посчитать количество людей с именем "Tom" в списке имен
         */

        List<String> names = List.of("Tom", "Jerry", "Tom", "Alice", "Bob", "Tom");

        int count = (int) names.stream().filter("Tom"::equals).count();

        System.out.println("Количество людей с именем 'Tom': " + count);
        System.out.println();

        //или
        List<String> fullNames = Arrays.asList("Tom Hardy", "Jerry Jones", "Tom Cruise",
                                               "Alice Cooper", "Bob Marley",
                                               "Tom Edison", "John Bon Jovi", "Kirk Hammet",
                                               "Tom Sowyer");


        int count1 = (int) fullNames.stream().filter(name -> name.startsWith("Tom")).count();

        System.out.println("Количество людей с именем 'Tom': " + count1);

    }

}
