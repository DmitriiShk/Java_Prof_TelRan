package Homework.HW2_011024_AnimalHouse;

public class Animal extends Creature {

    private boolean isHungry;

    public Animal(String name, int age, boolean isHungry) {
        super(name, age);
        this.isHungry = isHungry;
    }

    public String hungerStatus(){
        if (getHungry() == true) return "hungry";
        else return "not hungry";
    }

    @Override
    public void introduce(){
        System.out.println("Hello! Let me introduce myself. I'm animal. My name is: " + getName() + ". I am " + getAge() + " years old." + " Currently I am "+ hungerStatus() + ".");
    }

    @Override
    public String toString() {
        return "Animal\n" + "Name: " + getName() + "\nAge: " + getName() + "\nIs hungry?: " + isHungry;
    }

    public void setHungry(boolean isHungry){
        this.isHungry = isHungry;
    }

    public boolean getHungry(){
        return isHungry;
    }

}
