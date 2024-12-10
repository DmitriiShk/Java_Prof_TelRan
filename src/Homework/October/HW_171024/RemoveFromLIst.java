package Homework.October.HW_171024;

import java.util.*;
import java.util.List;

public class RemoveFromLIst {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Mark", "Ann"));


        nameRemovalByLetter(names, "T");
        System.out.println();
        nameReplacement(names, "Ann", "student Ann");

    }

    private static void nameReplacement(List<String> list, String oldName, String newName) {

        System.out.println("List before replacement: " + list);

        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            if(name.contains(oldName)){
                iterator.remove();
                iterator.add(newName);
            }
        }

        System.out.println("List after replacement " + list);
    }


    private static void nameRemovalByLetter(List<String> names, String letter) {

        System.out.println("List before removal: " + names);

        ListIterator<String> iterator = names.listIterator();
        while(iterator.hasNext()){
            String name = iterator.next();
            if(name.contains(letter)){
                iterator.remove();
            }
        }
        System.out.println("List after removal: " + names);
    }

}
