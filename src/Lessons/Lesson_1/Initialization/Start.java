package Lessons.Lesson_1.Initialization;

public class Start {

    private int number;

    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }

    public Start(){
        this(1000);
        System.out.println("Constructor without arguments at work");
    }

    public Start(int number){
        this.number = number;
        System.out.println("Constructor with 1 argument at work");
    }

}
