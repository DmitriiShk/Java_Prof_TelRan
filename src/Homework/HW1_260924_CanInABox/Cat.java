package Homework.HW1_260924_CanInABox;

import java.util.Objects;

public class Cat {

    private String name;
    private int age;

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Cat: Name: " + name + ", Age: " + age;
    }

    @Override
    public boolean equals(Object another){
        if(another == null || another.getClass() != this.getClass()) return false;

        Cat anotherCat = (Cat) another;

        return this.age == anotherCat.age && Objects.equals(this.name, anotherCat.name);

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

}
