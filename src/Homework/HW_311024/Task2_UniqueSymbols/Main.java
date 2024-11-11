package Homework.HW_311024.Task2_UniqueSymbols;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        String s = "Hello world!!!";

        Set<Character> uniqueCharacter = new TreeSet<>();

        for (char c : s.toCharArray()){
            uniqueCharacter.add(c);
        }

        System.out.println(uniqueCharacter);

    }

}
