package Lessons.Lesson_5_ENUM.Task_CoffeeMachine;

public enum Coffee {

    CAPPUCCINO(3.0, "Cappuccino"),
    LATTE(3.5, "Latte"),
    AMERICANO(2.0, "Americano"),
    ESPRESSO(4.0, "Espresso"),
    MACCHIATO(4.5, "Macchiato");

    private double price;
    private String description;

    private Coffee(double price, String description){
        this.price=price;
        this.description=description;
    }

    public double getPrice(){
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString(){
        return "Coffee:\n    Type: " + description + "\n    Price: " + price;
    }

}
