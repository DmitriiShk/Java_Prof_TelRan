package PracticeLessons.Lesson_191124.Task2.Task2_1;

public class Person {

    private String name;
    private int age;
    private String city;
    private String email;
    private double salary;

    public Person(String name, int age, String city, String email, double salary) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person {name = '" + name + "', age=" + age + ", city='" + city + "', email='" + email + "', salary=" + salary + '}';
    }
}
