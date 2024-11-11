package Lessons.Lesson_2.AbstractClasses;

public class Cat extends Animal{

    public Cat(String name, int age){
       super(name, age);
    }

    public void introduce(){
        System.out.println("Miau");
    }
}
