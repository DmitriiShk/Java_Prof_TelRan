package Lessons.Lesson_1.Initialization;

public class Car {
    static int carCount;

    public String make;
    public String model;
    public String color;
    public int yearOfManufacture;

    public Car(String make, String model, String color, int yearOfManufacture){
    this.make = make;
    this.model = model;
    this.color = color;
    this.yearOfManufacture = yearOfManufacture;

    carCount++;
    }

    public static void displayCarCount(){
        System.out.println(carCount);
    }

    public void displayCarInfo(){
        System.out.println("Car: "+make+" "+model);
        System.out.println("Color: "+color);
        System.out.println("Year of manufacture: "+yearOfManufacture);
        System.out.println("------------------------------------");
    }

}
