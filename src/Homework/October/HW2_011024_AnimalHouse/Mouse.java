package Homework.October.HW2_011024_AnimalHouse;

public class Mouse extends Animal implements Playable{

    public Mouse(String name, int age, boolean isHungry){
        super(name, age, isHungry);
    }

    public void squeak(){
        System.out.println("Squeak, squeak!");
    }

    @Override
    public void introduce() {
        System.out.println("Squeak! Let me introduce myself. I'm a mouse. My name is " + getName() + ". I am " + getAge()
                            + " years old. Currently I am " + hungerStatus() + ".");
    }

    @Override
    public String toString() {
        return "Mouse\n" + "Name: " + getName() + "\nAge: " + getAge() + "\nIs hungry?: " + getHungry();
    }

    @Override
    public void play(Creature another) {
        if (another instanceof Cat) System.out.println("Ups, it's a Cat! I gotta go! See you later!");
        else if (another instanceof Dog) System.out.println("I am playing with " + another.getName() + ". We, mice love it to play with dogs.");
        else if (another instanceof Mouse) System.out.println("I am playing with " + another.getName() + " now. Mice like to play with other mice.");
        else if (another instanceof Human) System.out.println("That's a human. Mice usually don't play with men.");
        else System.out.println("I am playing with " + another.getName() + ". We, mice, like to play with robots.");
    }

}
