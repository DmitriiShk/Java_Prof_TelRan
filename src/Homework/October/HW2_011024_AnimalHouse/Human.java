package Homework.October.HW2_011024_AnimalHouse;

public class Human extends Creature implements Walkable, Playable{

    public Human(String name, int age){
        super(name, age);
    }

    @Override
    public void introduce(){
         System.out.println("Hello! Let me introduce myself. I'm a human. My name is " + getName() + ". I am " + getAge() + " years old.");
    }

    @Override
    public String toString(){
        return "Human\n" + "Name: " + getName() + "\nAge: " + getAge();
    }

    @Override
    public void walkAnAnimal(Animal animal){
        System.out.println("I need to walk " + animal.getName());
        animal.setHungry(true);
        System.out.println("Now, that I walked " + animal.getName() + ", it is hungry. I need to feed it.");
    }

    public void walkAnAnimal(Animal...animals) {
        for (Animal a : animals) {
            System.out.println("I need to walk " + a.getName());
            a.setHungry(true);
            System.out.println("Now, that I walked " + a.getName() + ", it is hungry. I need to feed it.");
        }
    }

    @Override
    public void play(Creature another) {
        if (another instanceof Cat) System.out.println("I am playing with " + another.getName() + ". We, humans like playing with cats.");
        else if (another instanceof Dog) System.out.println("I am playing with " + another.getName() + ". We, humans love it to play with dogs.");
        else if (another instanceof Mouse) System.out.println("I am playing with " + another.getName() + " now. But, frankly, we, humans, don't like it to play with mice.");
        else if (another instanceof Human) System.out.println("I'm playing with another man named " + another.getName() + ". We human love to play with other men the most.");
        else System.out.println("I am playing with " + another.getName() + ". We, humans like to play with robots.");
    }

}
