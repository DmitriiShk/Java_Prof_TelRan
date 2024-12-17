package Lessons.Lesson_6_101024_ClassRelation.Lesson;

import org.w3c.dom.ls.LSOutput;

public class Egg {

    private Hen hen;

    public Hen getHen() {
        return hen;
    }

    public void setHen(Hen hen) {
        this.hen = hen;
    }

    @Override
    public String toString(){
        return "Some egg";
    }

}
