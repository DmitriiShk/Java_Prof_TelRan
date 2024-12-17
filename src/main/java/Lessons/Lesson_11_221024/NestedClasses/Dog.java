package Lessons.Lesson_11_221024.NestedClasses;

import java.util.*;

public class Dog {

    private String name;
    private List<DogFood> foodList;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DogFood> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<DogFood> foodList) {
        this.foodList = foodList;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name = '" + name + '\'' +
                "food = '" + foodList + '}';
    }

    static class DogFood{ //static class не привязан к объектам класса и ведет себя как обычный невложенный класс.

        private String foodName;

    public DogFood(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public String toString() {
        return "DogFood{" +
                "foodName='" + foodName + '\'' +
                '}';
    }
}

}
