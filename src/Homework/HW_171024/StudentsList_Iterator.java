package Homework.HW_171024;

import java.util.*;

public class StudentsList_Iterator {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Mary", "Jane", "Tom", "Tim", "Ann", null, ""));

        System.out.println(nullRemoval(names));
        System.out.println(nameByLength(names, 4));

    }

    private static List<String> nullRemoval(List<String> list) {

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            if(element == null || element.isEmpty()){
                iterator.remove();
            }
        }
        return list;
    }

    private static List<String> nameByLength(List<String> list, int elementLength) {

        List<String> newList = new ArrayList<>();

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            if(element.length() != 4){
                iterator.remove();
            }
            if(element.length() == elementLength){
                newList.add(element);
            }
        }
         return newList;
    }

}
