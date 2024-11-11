package Extra.Set_Tasks.Two_Sets;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //1. Имеется два набора элементов Set<String>.

        Set<String> set = new TreeSet<>();
        set.add("Ivan");
        set.add("Maria");
        set.add("Petr");
        set.add("Daria");
        set.add("Oleg");
        set.add("0lga");

        System.out.println("First set: " + set);

        Set<String> set1 = new TreeSet<>();
        set1.add("Sergey");
        set1.add("Maria");
        set1.add("Ilia");
        set1.add("Daria");
        set1.add("Oleg");
        set1.add("Anna");

        System.out.println("Second set: " + set1);

        // Создать Set<String>, в котором бы находились все элементы из двух наборов:
        Set<String> union = new TreeSet<>(set);
        union.addAll(set1);
        System.out.println("Resultant set 1: " + union);

        //Создать Set<String>, в котором бы находились только общие для двух наборов элементы
        Set<String> intersect = new TreeSet<>(set);
        intersect.retainAll(set1);
        System.out.println("Resultant set 2: " + intersect);

        //Создать Set<String>, в котором бы находились только элементы, которые присутствуют в
        // первом наборе и отсутствуют во втором
        Set<String> subtract = new TreeSet<>(set);
        subtract.removeAll(set1);
        System.out.println("Resultant set 3: " + subtract);




    }

}
