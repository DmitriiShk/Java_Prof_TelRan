package Homework.HW_171024;

import java.util.*;

public class StudentsList {

    public static void main(String[] args) {

        List<String> grade1 = new ArrayList<>(List.of("Ira Ivanova", "Sergey Alexeev", "Alexey Sergeyev", "Masha Pavlova"));
        List<String> grade2 = new ArrayList<>(List.of("Anna Vasilieva", "Vasiliy Petrov", "Katya Semenova", "Petr Vasiliev"));
        List<String> grade3 = new ArrayList<>(List.of("Vera Mikheeva", "Pavel Ilyin", "Natasha Zaitseva", "Igor Lavrov"));

        List<List<String>> elementarySchool = new ArrayList<>(List.of(grade1, grade2, grade3));

        System.out.println();

        System.out.println(elementarySchool);
        System.out.println();
        numberOfStudents(elementarySchool);
        System.out.println();
        numberOfStudentsByName(elementarySchool, "Vera");


    }

    private static void numberOfStudents(List<List<String>> listOfLists) {
        int sum = 0;
        for(List<String> list : listOfLists){
            sum += list.size();
     }
        System.out.println("Number of students in the elementary school: " + sum);
    }

    private static void numberOfStudentsByName(List<List<String>> listOfLists, String name) {
        int sum = 0;
        for(List<String> list : listOfLists){
            if (list.contains(name))
                    sum += 1;
        }
        System.out.println("Number of students with " + "\"" + name + "\"" + " name in the elementary school: " + sum);
    }

//    private static void numberOfStudentsByFirstAndLastName(List<List<String>> listOfLists, String name) {
//        int sum = 0;
//        String[] fullName = name.split(" ");
//        String firstName = fullName[0];
//        String lastName = fullName[1];
//        for(List<String> list : listOfLists){
//            for (int i = 0; i < list.size(); i++) {
//                if(list.get(i).contains(firstName))
//                    sum += sum;
//            }
//        }
//        System.out.println("Number of students with " + firstName + " name in the elementary school: " + sum);
//
//
//    }

}
