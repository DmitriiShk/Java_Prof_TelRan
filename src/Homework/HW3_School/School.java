package Homework.HW3_School;

import Lessons.Lesson_5_ENUM.Lesson.Season;

import java.util.Arrays;

public class School {

    public static void main(String[] args) throws CloneNotSupportedException{
//        System.out.println();
//        var student = new Student("John Smith", "10A"); //Создан ученик
//        System.out.println(student);
//        System.out.println();
//
//        var teacher = new Teacher("Jack Rayan", Subject.ASTRONOMY);
//        var teacher_1 = new Teacher("Michael Bolton", Subject.CHEMISTRY);
//        System.out.println(teacher);
//        System.out.println();
//        teacher.teach(student);
//
//        System.out.println(teacher_1);
//        teacher_1.teach(student);
//        System.out.println();
//
//        student.learnt(Subject.ASTRONOMY);
//        student.learnt(Subject.MATH);
//        System.out.println(student.knows(Subject.MATH));


//        Teacher teacher1 = new Teacher("John Black", Subject.MATH);
//        Teacher teacher2 = new Teacher("John Smith", Subject.ASTRONOMY);

        //An example of shallow copying
        Student student1 = new Student("Tom", "10A");
//        Student shallowCopyStudent = student1;  //Here we don't create a new object since there is no 'new'
//        shallowCopyStudent.setName("Jim");      //We just create another link to the same object in heap
//        shallowCopyStudent.setGrade("10B");
//        System.out.println(student1);
//        System.out.println("Shallow copy student = student 1? " + (student1==shallowCopyStudent));

        Student shallowCopyStudent = student1.shallowCopy();
        System.out.println("First student " + student1);
        System.out.println("New student copied from the first one: " + shallowCopyStudent);
        System.out.println("Students identical? " + student1.equals(shallowCopyStudent));
        Student shallowCopyStudent1 = (Student) student1.clone();
        System.out.println("shallowCopyStudent1 = " + shallowCopyStudent1);
        System.out.println(student1.equals(shallowCopyStudent1));
        System.out.println(student1==shallowCopyStudent1);


//        System.out.println();
//        student1.setGrade("10B");
//        System.out.println("First student " + student1);
//        System.out.println("New student copied from the first one: " + shallowCopyStudent);
//        System.out.println();
//
//        Student clonedStudent = (Student) student1.clone();
//        System.out.println("New student cloned from student 1 " + clonedStudent);
//        System.out.println("Student identical? " + (student1==clonedStudent));





//        Student student2 = new Student("Lucy", "10A");
//        Student student3 = new Student("James", "10A");



//        Student[] group = {student1, student2, student3};
//
//        teacher1.teach(student1);
//        teacher2.teach(group);
//
//        System.out.println((Arrays.toString(group)));
//
//        System.out.println(student1.knows(Subject.BIOLOGY));
//        System.out.println(student1.knows(Subject.MATH));
//        System.out.println(student1.knows(Subject.ASTRONOMY));

    }

}
