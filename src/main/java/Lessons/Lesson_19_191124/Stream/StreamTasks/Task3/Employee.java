package Lessons.Lesson_19_191124.Stream.StreamTasks.Task3;

public class Employee {

    private String name;
    private String surname;
    private int age;
    private int workingHoursInMonth;

    public Employee(String name, String surname, int age, int workingHoursInMonth) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workingHoursInMonth = workingHoursInMonth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getWorkingHoursInMonth() {
        return workingHoursInMonth;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age +
                ", workingHoursInMonth = " + workingHoursInMonth +
                '}';
    }
}
