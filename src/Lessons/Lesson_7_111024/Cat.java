package Lessons.Lesson_7_111024;

import java.util.Objects;

public class Cat {

    private String name;
    private int age;
    private String colour;

    public Cat(String name, int age, String colour){
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public String getColour() {
        return colour;
    }

    @Override
    public String toString(){
        return "Cat:\n" + "\tName: " + name + "\n\tAge: " + age + "\n\tColour: " + colour + "\n_____________________";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(colour, cat.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, colour);
    }
}
