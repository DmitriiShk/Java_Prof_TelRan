package Lessons.Lesson_9_171024.CustomIterator;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    MyArrayList myArrayList = new MyArrayList(new String[]{"A", "B", "C", "D", "E"});

//    Iterator<String> iterator = myArrayList.iterator();
//        System.out.println("iterator.next() = " + iterator.next());
//
//        System.out.println();

    Iterator<String> iterator1 = myArrayList.iterator();

    while(iterator1.hasNext()){
        String s = iterator1.next();
        System.out.print(s + " ");
    }

//    for(String s : myArrayList){
//        String element = s;
//        System.out.println(element);
//    }
//
//        System.out.println();
//
//    Iterator<String> iterator = myArrayList.iterator();
//        System.out.println(iterator.next());
//
//        System.out.println();
//
//    Iterator<String> iterator1 = myArrayList.iterator();
//
//    while(iterator1.hasNext()){
//        String element = iterator1.next();
//        System.out.print(element + " ");
//    }







    }

}
