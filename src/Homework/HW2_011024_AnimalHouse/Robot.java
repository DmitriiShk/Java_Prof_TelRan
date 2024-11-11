package Homework.HW2_011024_AnimalHouse;

import java.util.Date;

public class Robot extends Creature implements Walkable, Playable, CatchingSkill{

    private String id;
    private String version;

    Date date = new Date();
    int year = date.getYear()+1900;
    int yearOfManufacture = year - getAge();

    public Robot(String name, int age, String id, String version){
        super(name, age);
        this.id = id;
        this.version = version;
    }

    @Override
    public void introduce() {
        System.out.println("Hello! Let me introduce myself. I am a robot. My name is " + getName() + ", my ID is " + id + " and version "
                           + version + ". I was made " + getAge() + " years ago.");
    }

    @Override
    public String toString() {
        return "Robot \n" + "Name: " + getName() + "\nVersion: " + version + "\nID: " + id + "\nYear of manufacture: " + yearOfManufacture;
    }

    @Override
    public void walkAnAnimal(Animal animal){
        System.out.println("I need to walk " + animal.getName());
        animal.setHungry(true);
        System.out.println("Now, that I walked " + animal.getName() + ", it is hungry. I need to feed it.");
    }

    @Override
    public void play(Creature another) {
        if (another instanceof Human) System.out.println("I am playing with " + another.getName() + ". We, robots, like to play games with men. "
                                                          + "Especially chess!");
        if (another instanceof Cat) System.out.println("I am playing with " + another.getName() + " now. We, robots, like playing with cats.");
        else if (another instanceof Dog) System.out.println("I am playing with " + another.getName() + " now. We, robots, like playing with dogs.");
        else if (another instanceof Mouse) System.out.println("I am playing with " + another.getName() + " now. We, robots, like playing with mice.");
        else if (another instanceof Robot) System.out.println("I'm playing with another robot named " + another.getName() + " now. We, robots, like" +
                                                               " to play with other robots.");
    }

    @Override
    public void catchMouse(Mouse mouse){
        System.out.println("I have just caught a mouse. I will let it go. It is just a game.");
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setVersion(String version){
        this.version = version;
    }

    public String getVersion(){
        return version;
    }

}
