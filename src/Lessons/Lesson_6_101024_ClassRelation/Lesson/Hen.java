package Lessons.Lesson_6_101024_ClassRelation.Lesson;

public class Hen {

    private Egg egg;


    public Egg getEgg() {
        return egg;
    }

    public void setEgg(Egg egg) {
        this.egg = egg;
    }

    @Override
    public String toString(){
        return "Some hen";
    }

}
