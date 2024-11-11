package Lessons.Lesson_3.Objects_Compare;

public class Employee {

    private String firstName;
    private String lastName;
    private Integer age;
    private Integer id;

    public Employee(String firstName, String lastName, Integer age, Integer id){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.id=id;
    }


    public boolean equals(Object another){
        if (another == null || another.getClass() != Employee.class) return false;
        var anotherEmployee = (Employee) another;
        return (id != null && id.equals(anotherEmployee.id));
    }

}
