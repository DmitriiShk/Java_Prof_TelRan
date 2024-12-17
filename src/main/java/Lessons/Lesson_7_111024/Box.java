package Lessons.Lesson_7_111024;

public class Box {

    private String name;
    private boolean canBeSold;
    private static int count;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    Cat cat;

    public Box(){

    }

    public Box (String name, boolean canBeSold, Cat cat){
        this.name = name;
        this.canBeSold = canBeSold;
        this.cat = cat;
        count++;
    }

    public void emptyBox (){
        name = null;
        canBeSold = false;
        cat = null;
    }

    public Box shallowCopy(){
        System.out.println(cat);
        return new Box(this.name, this.canBeSold, this.cat);
    }

    public Box deepCopy(){
        Cat cat1 = new Cat(cat.getName(), cat.getAge(), cat.getColour());
        Box box2 = new Box(this.name, this.canBeSold, cat1);
        return box2;
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

}


