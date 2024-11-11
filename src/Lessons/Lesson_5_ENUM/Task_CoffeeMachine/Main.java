package Lessons.Lesson_5_ENUM.Task_CoffeeMachine;

public class Main {

    public static void main(String[] args) {

        var delongi = new CoffeeMachine("Delongi", "Superb 001");

            System.out.println();
            System.out.println(delongi);
            System.out.println("***************************");
            System.out.println();

            delongi.makeCoffee(Coffee.CAPPUCCINO, 5.0);
            System.out.println();

            delongi.displayInfo(Coffee.AMERICANO);
            System.out.println("***************************");

            delongi.makeCoffee(Coffee.ESPRESSO, 1.0);
            System.out.println("-------------");
            delongi.makeCoffee(Coffee.ESPRESSO, 4.0);
            System.out.println("-------------");
            delongi.makeCoffee(Coffee.ESPRESSO, 6.0);
            System.out.println("-------------");
            delongi.makeCoffee(Coffee.AMERICANO, 4.0);

    }

}
