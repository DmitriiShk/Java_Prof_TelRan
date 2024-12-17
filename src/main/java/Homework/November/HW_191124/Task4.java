package Homework.November.HW_191124;

/*
Создать класс Cat с полями
String name
int age
String colour
boolean isHungry
Создать список из экземпляров класса Cat. С помощью стримов:

- вывести список голодных кошек старше 2 лет
- вывести список уникальных цветов кошек
- вывести список имен кошек возраста 1 год
 */

import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Tom", 5, "Gray", true);
        Cat cat2 = new Cat("Max", 3, "Black", true);
        Cat cat3 = new Cat("Garfield", 4, "Red", false);
        Cat cat4 = new Cat("Raff", 1, "Brown", false);
        Cat cat5 = new Cat("Casper", 1, "White", true);

        List<Cat> cats = List.of(cat1, cat2, cat3, cat4, cat5);

        //1.
        List<Cat> hungryCats = cats.stream().filter(cat -> cat.isHungry() && cat.getAge()>2).toList();
        System.out.println("Hungry cats older than 2: ");
        hungryCats.forEach(System.out::println);
        System.out.println();

        //2.
        System.out.println("List of unique colors of cats: ");
        List<String> uniqueColors = cats.stream().map(Cat::getColour).distinct().toList();
        System.out.println();

        //3.
        System.out.println("One year old cats: ");
        List<Cat> oneYearOldCats = cats.stream().filter(cat -> cat.getAge()==1).toList();
        oneYearOldCats.forEach(System.out::println);

    }

}

class Cat{

    private String name;
    private int age;
    private String colour;
    private boolean isHungry;

    public Cat(String name, int age, String colour, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.isHungry = isHungry;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColour() {
        return colour;
    }

    public boolean isHungry() {
        return isHungry;
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", colour = '" + colour + '\'' +
                ", isHungry = " + isHungry +
                '}';
    }
}
