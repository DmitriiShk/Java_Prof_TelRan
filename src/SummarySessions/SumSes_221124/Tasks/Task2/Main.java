package SummarySessions.SumSes_221124.Tasks.Task2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

    Employee employee1 = new Employee("Tim", "Smith", 23, 40, true, "IT");
    Employee employee2 = new Employee("Jane", "Smith", 45, 30, false, "STOCK");
    Employee employee3 = new Employee("Inna", "Smith", 32, 20, true, "IT");
    Employee employee4 = new Employee("Mark", "Smith", 47, 40, false, "ACCOUNTING");
    Employee employee5 = new Employee("John", "Smith", 23, 40, true, "STOCK");
    Employee employee6 = new Employee("Nina", "Smith", 12, 20, false, "IT");

    List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6);

        //С помощью коллекторов создать Map:
//        - <name / Employee>
        Map<String, Employee> map1 = employees.stream().collect(Collectors.toMap(Employee::getName, employee -> employee));
        map1.forEach((name, employee) -> System.out.println(name + " -> " + employee));
        System.out.println();

//        - <age / количество>
        Map<Integer, Long> map2 = employees.stream().collect(Collectors.groupingBy(Employee::getAge,
                                  Collectors.counting()));
        map2.forEach((age, quantity) -> System.out.println("Age: " + age + " -> Quantity: " + quantity));
        System.out.println();

//        Map<Integer, Integer> ageEmplQuon = employees.stream().collect(Collectors
//                                            .toMap(Employee::getAge, employee -> 1, Integer::sum));
//        System.out.println(ageEmplQuon);

//        - <age / список сотрудников>
        Map<Integer, List<Employee>> map3 = employees.stream().collect(Collectors
                                            .groupingBy(Employee::getAge));

        //System.out.println("map 3: " + map3);
        map3.forEach((age, employeeList) -> {
            System.out.println("Age: " + age);
            employeeList.forEach(employee -> System.out.println("  " + employee));
        });
        System.out.println();

//        - <isActive / количество>
        Map<Boolean, Long> map4 = employees.stream().collect(Collectors.groupingBy(Employee::isActive,
                        Collectors.counting()));
        map2.forEach((isActive, quantity) -> System.out.println("Is active: " + isActive + " -> Quantity: " + quantity));
        System.out.println();

//        - <department / список сотрудников>
        Map<String, List<Employee>> map5 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));

        //another option:
        Map<String, List<Employee>> map6 = employees.stream().collect(Collectors
                                           .toMap(Employee::getDepartment, Collections::singletonList));

        map3.forEach((department, employeeList) -> {
            System.out.println("Department: " + department);
            employeeList.forEach(employee -> System.out.println("  " + employee));
        });
        System.out.println();
        map3.forEach((department, employeeList) -> {
            System.out.println("Department: " + department);
            employeeList.forEach(employee -> System.out.println("  " + employee));
        });
        System.out.println();

//        - <department / общая сумма рабочих часов>
//        Map<String, Integer> map7 = employees.stream().collect(Collectors
//                                    .groupingBy(Employee::getDepartment, Collectors
//                                    .summingInt(Employee::getWorkingHoursInMonth)));
//        map7.forEach((department, workingHours) -> System.out.println("Department" + department + " -> Working hours " + workingHours));

        Map<String, Integer> departmentToHoursMap = employees.stream()
                                                   .collect(Collectors.groupingBy(
                                                    Employee::getDepartment, // Ключ: департамент
                                                    Collectors.summingInt(Employee::getWorkingHoursInMonth) // Значение: сумма рабочих часов
                ));

        // Вывод карты
        departmentToHoursMap.forEach((department, workingHours) ->
                System.out.println("Department: " + department + " -> Total Hours: " + workingHours));

//


    }

}

class Employee{

    private String name;
    private String surname;
    private int age;
    private int workingHoursInMonth;
    private boolean isActive;
    private String department;

    public Employee(String name, String surname, int age, int workingHoursInMonth, boolean isActive, String department) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workingHoursInMonth = workingHoursInMonth;
        this.isActive = isActive;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkingHoursInMonth() {
        return workingHoursInMonth;
    }

    public void setWorkingHoursInMonth(int workingHoursInMonth) {
        this.workingHoursInMonth = workingHoursInMonth;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age +
                ", workingHoursInMonth = " + workingHoursInMonth +
                ", isActive = " + isActive +
                ", department = '" + department + '\'' +
                '}';
    }
}
