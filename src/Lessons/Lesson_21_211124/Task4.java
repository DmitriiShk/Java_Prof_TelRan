package Lessons.Lesson_21_211124;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Tom", 5, "Gray", true);
        Cat cat2 = new Cat("Max", 3, "Black", true);
        Cat cat3 = new Cat("Garfield", 4, "Red", false);
        Cat cat4 = new Cat("Raff", 1, "Brown", false);
        Cat cat5 = new Cat("Casper", 1, "White", true);

        List<Cat> cats = List.of(cat1, cat2, cat3, cat4, cat5);

        //1.
        String[] strings = {"One", "Two", "Three", "Four", "Five"};
//
//        for (String s : strings) {
//            System.out.println(s);
//        }
//
//        Arrays.stream(strings).forEach(System.out::println);

        //2.
        List<String> strings1 = List.of("One", "Two", "Three", "Four", "Five");

            List<String> uniqueStrings = strings1.stream().distinct().toList();

        //3.
        cats.stream().filter(cat -> cat.isHungry()).forEach(cat -> cat.setHungry(false));

    }

    public static List<String> method(List<String> strings) {
        List<String> result = new ArrayList<>();
        for (String s : strings) {
            if (!result.contains(s)) {
                result.add(s);
            }
        }
        return result;
    }

    public static void feed(List<Cat> cats) {
        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).isHungry()) {
                cats.get(i).setHungry(false);
            }
        }
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

    public void setName(String name) {
        this.name = name;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setAge(int age) {
        this.age = age;
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





