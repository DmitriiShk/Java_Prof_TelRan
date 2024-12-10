package Homework.October.HW2_011024_AnimalHouse;

public abstract class Creature {

    private String name;
    private int age;

    public Creature(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void introduce();

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

    @Override
    public String toString(){
        return "Creature: " + "name = " + name + ", age=" + age;
    }

}
