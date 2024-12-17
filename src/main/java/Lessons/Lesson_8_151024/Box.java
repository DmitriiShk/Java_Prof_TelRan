package Lessons.Lesson_8_151024;

public class Box implements Cloneable {

    private String name;
    private boolean canBeSold;
    private int count;
    private Cat cat;

    public Box (String name, boolean canBeSold, Cat cat, int count){
        this.name = name;
        this.canBeSold = canBeSold;
        this.cat = cat;
        this.count = count;
    }

    public void emptyBox (){
        name = null;
        cat = null;
        count = 0;
        canBeSold = false;
    }

    public Box shallowCopy(){
        return new Box(name, canBeSold, cat, count);
    }

    public Box deepCopy(){
       return new Box(name, canBeSold, new Cat(cat.getName(), cat.getAge(), cat.getColour()), count);
    }

    @Override
    public String toString() {
        return "Box:\n\tName: " + name + "\n\tcanBeSold: " + canBeSold + "\n" + cat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanBeSold() {
        return canBeSold;
    }

    public void setCanBeSold(boolean canBeSold) {
        this.canBeSold = canBeSold;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

}
