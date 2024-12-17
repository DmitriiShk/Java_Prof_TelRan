package Lessons.Lesson_6_101024_ClassRelation.Lesson;

public class Car {



    private Motor motor = new Motor(); //Это жесткая связь объектов между собой, т.к. объект поменять нельзя. Называется "композиция"

    private Driver driver; // Связь не такая жесткая. Объект можно менять. Она называется "агрегация"

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
