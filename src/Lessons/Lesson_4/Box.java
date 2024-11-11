package Lessons.Lesson_4;

import java.util.Objects;

public class Box {

    private Cat cat; //We put an object cat of the class Cat in the box

    public Box(Cat cat){
        this.cat = cat;
    }

    @Override
    public String toString(){
        return "Box{" + "Cat = " + cat + '}';
    }

    @Override
    public boolean equals(Object another){
        if (another == null || another.getClass() != this.getClass()) return false;

        Box anotherBox = (Box) another;
        return Objects.equals(this.cat, anotherBox.cat);

    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

}
