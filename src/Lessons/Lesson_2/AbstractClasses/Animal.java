package Lessons.Lesson_2.AbstractClasses;

public abstract class Animal {
    private String name;
    private int age;
    private boolean isHundry = true;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract void introduce();

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public boolean isHundry() {
        return isHundry;
    }

    public void setHundry(boolean hundry) {
        isHundry = hundry;
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", age=" + age + ", isHundry=" + isHundry + '}';
    }

}
