package Extra.Test_Exercises;

public class Dog {

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog {" +
                "name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }

    public static void main(String[] args) {

        Dog dog = new Dog("Rex", 3);

        System.out.println(dog);

    }

}
