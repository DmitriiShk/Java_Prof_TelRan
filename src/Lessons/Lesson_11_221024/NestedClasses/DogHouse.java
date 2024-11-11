package Lessons.Lesson_11_221024.NestedClasses;

//import static lesson_11_221024.NestedClasses.Dog.DogFood; При таком импорте мне не нужно уже ссылаться на Dog для создания еды

import java.util.List;

public class DogHouse {

    public static void main(String[] args) {

        Dog dog = new Dog("Rex");

        System.out.println(dog);

        Dog.DogFood bone = new Dog.DogFood("bone");
        Dog.DogFood meat = new Dog.DogFood("meat");

        System.out.println(bone);

        List<Dog.DogFood> foodList = List.of(bone, meat);

        System.out.println(dog);


    }

}
