package Lessons.Lesson_19_191124.Stream.StreamTasks.Task3;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", "Ivanov", 30, 320);
        Employee employee2 = new Employee("Semen", "Petrov", 20, 350);
        Employee employee3 = new Employee("Petr", "Semenov", 19, 420);
        Employee employee4 = new Employee("Alexey", "Alexeyev", 25, 400);
        Employee employee5 = new Employee("Igor", "Igorev", 40, 220);
        Employee employee6 = new Employee("Vladimir", "Vladimirov", 50, 120);

        List<Employee> employees = List.of(employee1, employee2, employee3, employee4, employee5, employee6);

        List<Employee> olderEmployees = employees.stream().filter(employee -> employee.getAge()>20).toList();
        olderEmployees.forEach(employee -> System.out.println(employee));
        System.out.println();

        List<Employee> otherEmployees = employees.stream().filter(employee -> employee.getWorkingHoursInMonth()>300).
                                        filter(employee -> employee.getName().startsWith("I")).toList();
        System.out.println(otherEmployees);

        List<String> surnamesOfIvan = employees.stream().filter(employee -> employee.getName().equals("Ivan")).
                                      map(Employee::getSurname).toList();

        System.out.println("Surnames of Ivan = " + surnamesOfIvan);

        List<String> uniqueNames = employees.stream().distinct().map(employee -> employee.getName()).toList();
        uniqueNames.forEach(employee -> System.out.println(employee));
        
    }


}
