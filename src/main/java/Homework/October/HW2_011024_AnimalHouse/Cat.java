package Homework.October.HW2_011024_AnimalHouse;

public class Cat extends Animal implements Playable, CatchingSkill{
    public Dog dog;
    public Cat (String name, int age, boolean isHungry){
        super(name, age, isHungry);
    }

    public void meow() {
        System.out.println("Meow!");
    }

    @Override
    public void introduce() {
        System.out.println("Meow! Let me introduce myself. I'm a cat. My name is " + getName() + ". I am " +getAge() + " years old. Currently I am " + hungerStatus() + ".");
    }

    @Override
    public String toString() {
        return "Cat\n" + "Name: " + getName() + "\nAge: " + getAge() + "\nIs hungry?: " + getHungry();
    }
    @Override
    public void play(Creature another) {
       if(another instanceof Dog) System.out.println("Ups, it's a dog. Cats don't play games with dogs. I'd better be running away! See ya!");
       else if (another instanceof Mouse) System.out.println("Wow! It's a mouse! Mice are cat's best toy!");
       else if (another instanceof Cat) System.out.println("I'm playing with another cat now. Its name is " + another.getName() + ". Cats gladly play with other cats.");
       else if (another instanceof Human) System.out.println("I'm playing with a man. His name is " + another.getName() + ". Cats love playing with men." );
       else System.out.println("I am playing with a robot now. Its name is " + another.getName() + ". We, cats like to play games with robots.");
    }

    @Override
    public void catchMouse(Mouse mouse){
        System.out.println("I have just caught this mouse named " + mouse.getName() + ". I will let it go. It is just a game.");
    }




}
