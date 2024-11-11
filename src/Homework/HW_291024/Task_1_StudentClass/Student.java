package Homework.HW_291024.Task_1_StudentClass;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private String surname;
    private int age;
    private int course;

    public Student(String name, String surname, int age, int course) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge(){
        return age;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, course);
    }

    @Override
    public String toString() {
        return "Student {" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age +
                ", course = " + course +
                '}';
    }

    @Override
    public int compareTo(Student another) {
        int result = this.name.compareTo(another.name);
        if(result == 0) result = this.surname.compareTo(another.surname);
        if(result == 0) result = this.age - another.age;
        if(result == 0) result = this.course - another.course;
        return result;
    }
}
