package Lessons.Lesson_6_101024_ClassRelation.Lesson;

public class Human {

    private String name;
    private int age;

    private Human friend;

    public void setFriend(Human friend) {
        this.friend = friend;
    }

    @Override
    public String toString(){
        return "Human";
    }

}
