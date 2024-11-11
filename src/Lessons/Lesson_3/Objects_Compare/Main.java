package Lessons.Lesson_3.Objects_Compare;

public class Main {

    public static void main(String[] args) {
        var employee1 = new Employee("John", "Snow", 25, 123);
        var employee2 = new Employee("Aria", "Stark", 20, 345);

        System.out.println(employee1.equals(employee2));
    }

}
