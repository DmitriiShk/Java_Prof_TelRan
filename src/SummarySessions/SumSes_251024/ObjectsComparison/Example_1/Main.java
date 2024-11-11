package SummarySessions.SumSes_251024.ObjectsComparison.Example_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

// Strings
//        System.out.println("string1".equals("string2")); //this method is used if we are sure that there are no nulls
//        System.out.println(Objects.equals("string1", "string2")); //This method is used if there may be nulls
//        System.out.println(((Integer) "str1".length()).compareTo("str2".length()));
//        System.out.println("abc".compareTo("abd"));//-1
//        System.out.println("abc".compareTo("abcd"));//-1

// Integers
//        int a = 10;
//        int b = 11;
//
//        System.out.println(a <= b);

//  Characters
        char c1 = 'a';
        char c2 = 'b';
        char c3 = 'A';
        System.out.println(c1 < c2);
        System.out.println(c3 < c1);
        Character c4 = 'a';
        Character c5 = 'A';
        System.out.println(c4.compareTo(c5)); //Since the result - 32 is positive value, it means that c4 is greater than c5

        //Comparison is based on the following method:
        //public static int compare(char x, char y){return x - y}

//        boolean b1 = true;
//        boolean b2 = false;
//        //System.out.println(b1<b2);//Impossible
//
//        //Here comparision is possible since now we compare objects.
//        Boolean b3 = true;//1
//        Boolean b4 = false;//0
//        System.out.println();
//        System.out.println(b3.compareTo(b4));//Since 1>0, the result will be 1.
//
//        Integer i1 = 10;
//        Integer i2 = 20;
//        System.out.println(i1<i2);
        //System.out.println(i1.compareTo(i2));

        List<String> list = new ArrayList<>(List.of("hello", "world", "hi", "bye", "123", "Hello"));
        Collections.sort(list);
        System.out.println(list);//First - numbers, then strings starting with Capital letter, then other strings in alphabetical order






    }

}
