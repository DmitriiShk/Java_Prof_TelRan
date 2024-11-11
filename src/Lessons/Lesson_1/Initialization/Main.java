package Lessons.Lesson_1.Initialization;

public class Main {
    public static void main(String[] args) {
//        Start s = new Start();
//        System.out.println(s.getNumber());

        Car car1 = new Car("Ford", "Focus", "Blue", 2023);
        Car car2 = new Car("Ford", "Kugo", "Black", 2023);
        int carCount = Car.carCount;
        System.out.println("************************************");
        System.out.println("Current number of cars is: "+carCount);
        System.out.println("************************************");
        car1.displayCarInfo();
        car2.displayCarInfo();

    }
}
