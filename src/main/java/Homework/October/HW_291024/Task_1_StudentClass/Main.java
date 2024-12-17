package Homework.October.HW_291024.Task_1_StudentClass;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Irina", "Safronova", 20, 3);
        Student student2 = new Student("Michael", "Yefremov", 21, 4);
        Student student3 = new Student("Sergey", "Ivanov", 19, 2);
        Student student4 = new Student("Vika", "Golubeva", 18, 1);
        Student student5 = new Student("Olga", "Zaikina", 19, 2);

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        System.out.println("List before sorting");

        for (Student st : list) {
            System.out.println(st);
        }
        System.out.println();

        System.out.println("TreeSet from the original list:");
        TreeSet<Student> set = new TreeSet<>(list);
        System.out.println(set);
        System.out.println();

        Collections.sort(list);

        System.out.println("List after natural sorting (by name)");

        for (Student st : list) {
            System.out.println(st);
        }
        System.out.println();

        System.out.println("List after sorting by surname");

        Collections.sort(list, new CompareBySurname());

        for (Student st : list) {
            System.out.println(st);
        }
        System.out.println();

        System.out.println("List after sorting by age");

        Collections.sort(list, new CompareByAge());

        for (Student st : list) {
            System.out.println(st);
        }
        System.out.println();



//        TreeSet<Student> set = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student student, Student another) {
//                int result = student.getAge() - another.getAge();
//                if (result == 0) result = student.getName().compareTo(another.getName());
//                if(result == 0) result = student.getSurname().compareTo(another.getSurname());
//                if(result == 0) result = student.getCourse() - another.getCourse();
//                return result;
//            }
//        });

//        set.add(student1);
//        set.add(student2);
//        set.add(student3);
//        set.add(student4);
//        set.add(student5);
//
//        System.out.println(set);

    }

}
