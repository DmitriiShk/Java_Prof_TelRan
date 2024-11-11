package Homework.HW_291024.Task_1_StudentClass;

import java.util.Comparator;

public class CompareBySurname implements Comparator<Student> {
    @Override
    public int compare(Student student, Student another) {
        return student.getSurname().compareTo(another.getSurname());
    }
}
