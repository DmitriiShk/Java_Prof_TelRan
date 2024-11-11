package Homework.HW1_260924_CanInABox;

import java.util.Objects;

public class Box {

    private Cat cat;

    public Box (Cat cat){
        this.cat = cat;
    }

    public void setCat(Cat cat){
        this.cat = cat;
    }

    public Cat getCat(){
        return cat;
    }

    @Override
    public String toString(){
        return "Box (Cat " + cat + ")";
    }

    @Override
    public boolean equals(Object another){
        if(another == null || another.getClass() != this.getClass()) return false;

        Box anotherBox = (Box) another;

        return Objects.equals(this.cat, anotherBox.cat);

    }

}
