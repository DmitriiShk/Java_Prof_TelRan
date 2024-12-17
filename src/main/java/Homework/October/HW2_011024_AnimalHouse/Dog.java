package Homework.October.HW2_011024_AnimalHouse;

public class Dog extends Animal implements Playable{

    public Dog(String name, int age, boolean isHungry){
        super(name, age, isHungry);
    }

    public void gav(){
        System.out.println("Gav, gav!");
    }

    @Override
    public void introduce(){
        System.out.println("Gav, gav! Let me introduce myself. I'm a dog. My name is " + getName() + ". I am " + getAge() + " years old. "
                           + "Currently I am " + hungerStatus() + ".");
    }

    @Override
    public String toString(){
        return "Dog\n" + "Name: " + getName() + "\nAge: " + getAge() + "\nIs hungry?: " + getHungry();
    }

    @Override
    public void play(Creature another){
        if (another instanceof Cat) System.out.println("Oh, it's a cat! Dogs don't like cats. Gav, Gav! I gonna catcha! Bye, bye!");
        else if (another instanceof Dog) System.out.println("I am playing with " + another.getName() + ". We, dogs, love playing with other dogs.");
        else if (another instanceof Mouse) System.out.println("I am playing with " + another.getName() + " now. We, dogs, usually don't play with mice.");
        else if (another instanceof Human) System.out.println("I'm playing with a man named " + another.getName() + " now. We, dogs, love playing with men the most.");
        else System.out.println("I am playing with " + another.getName() + ". We, dogs, like to play with robots.");
    }

}
