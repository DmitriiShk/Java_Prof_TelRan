package Lessons.Lesson_4;

public class BlackCat extends Cat{

    private String color;

    public BlackCat(String name, int age, String color){
        super(name, age);
        this.color = color;
    }



    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

}
