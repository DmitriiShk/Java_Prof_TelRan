package Lessons.Lesson_6_101024_ClassRelation.Lesson;

public class Main {

    public static void main(String[] args) {

//        Driver driver = new Driver();
//        Car car = new Car();
//
//        Driver driver1 = new Driver();
//        car.setDriver(driver1);
//
//        Motor motor = new Motor();

        Egg egg = new Egg();
        Hen hen = new Hen();

        hen.setEgg(egg);
        egg.setHen(hen);

        System.out.println(hen);
        System.out.println(egg);

        Human human1 = new Human();
        Human human2 = new Human();

        human1.setFriend(human2);
        human2.setFriend(human1);


    }

}
