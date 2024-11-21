package PracticeLessons.Lesson_071124;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeesMap {

    public static void main(String[] args) {

        Map<String, Map<String, String>> employees = Map.of(
                "1", Map.of("Name", "Alice", "Department", "IT"),
                "2", Map.of("Name", "Bob", "Department", "HR"),
                "3", Map.of("Name", "Charlie", "Department", "IT")
        );


    }

//    public static List<String> employeesByDepartment (String department){
//
//        List<String> departmentEmployees = new ArrayList<>();
//
//        Map<String, String> employees1 = new HashMap<>();
//
//        for (Map.Entry<String, Map<String, String>> entry : employees1.entrySet())
//
//        return departmentEmployees;
//
//    }

}
