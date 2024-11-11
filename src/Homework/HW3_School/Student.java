package Homework.HW3_School;

import java.util.Arrays;
import java.util.Objects;

public class Student implements Cloneable{

    private String name;
    private String grade;
    private Subject[] subjects;

    public Student(String name, String grade){
        this.name=name;
        this.grade=grade;
        subjects = new Subject[Subject.values().length];
    }

    public void learnt(Subject subject){
       subjects[subject.ordinal()] = subject;
       System.out.println("Student " + name + " learns " + subject + ".");
    }

    public boolean knows(Subject subject){
        Subject subjectFromArray = subjects[subject.ordinal()];
        return subjectFromArray == subject;
    }

    public void empty (){
        name = null;
        grade = null;
        //subjects = null;
    }

    public Student shallowCopy() {
        return new Student (name, grade);
    }

    //Yevgen's version of shallow copy method:
    public Student makeCopy(){
        Student student = new Student(this.name, this.grade);
        student.subjects = this.subjects;
        return student;
    }

    //Yevgen's version of deep copy method:  
    public Student deepCopy() {
        Student student = new Student(this.name, this.grade);
        student.subjects = Arrays.copyOf(this.subjects, this.subjects.length);
        return student;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setGrade(String grade){
        this.grade=grade;
    }

    public String getGrade(){
        return grade;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString(){
        return "Student:\n    Name: " + name + "\n    Grade: " + grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(grade, student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }
}
