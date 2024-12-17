package Lessons.Lesson_5_ENUM.Task_CoffeeMachine;

import org.w3c.dom.ls.LSOutput;

public class CoffeeMachine {

    private String name;
    private String version;

    public CoffeeMachine(String name, String version){
        this.name=name;
        this.version=version;
    }

    public void displayInfo(Coffee coffee){
        System.out.println(coffee.toString());
    }

    public void makeCoffee(Coffee coffee, double money){
        if(coffee == Coffee.CAPPUCCINO) System.out.println("Sorry, currently we cannot make cappuccino. Select another drink please.");
        else if (money<coffee.getPrice()) System.out.println("Sum is insufficient for the selected drink. "
                                                              + "Please add the missing amount of "
                                                              + (coffee.getPrice()-money));
        else {
            System.out.println("Your " + coffee.getDescription().toLowerCase() + " is ready. Enjoy the drink!");
            if (coffee.getPrice()-money !=0) System.out.println("Here is your change: " + (money - coffee.getPrice()));
        }
    }

    @Override
    public String toString(){
        return "Coffee machine:\n    Brand: " + name + "\n    Model: " + version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
