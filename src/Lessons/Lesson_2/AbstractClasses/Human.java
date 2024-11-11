package Lessons.Lesson_2.AbstractClasses;

public class Human {
    private String name;

    public Human(String name){
        this.name = name;
    }

    public void feedAnimal(Animal animal){//If we had no abstract class Animal, we would have to write a separate method for each animal.
       animal.setHundry(false);
    }

    public void feedAnimals(Animal...animals){//Vararg
        for(Animal a : animals) feedAnimal(a);
    }

}
