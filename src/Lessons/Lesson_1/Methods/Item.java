package Lessons.Lesson_1.Methods;

public class Item {

    private int weight;
    private String name;

    public Item(){

    }

    public Item(int weight, String name){
        this.weight=weight;
        this.name=name;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getName (){
        return name;
    }




}
