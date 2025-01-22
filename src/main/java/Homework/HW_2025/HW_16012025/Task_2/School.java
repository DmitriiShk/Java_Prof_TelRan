package Homework.HW_2025.HW_16012025.Task_2;

public class School {
    @StudentInfo(name = "Tom", surname = "Smith", groupNumber = 1101, isOnline = true)
    private Student student1;

    @StudentInfo(name = "Mary", surname = "Jennings", groupNumber = 1102, isOnline = false)
    private Student student2;

    public static void main(String[] args) {
        School school = new School();

        // Инициализируем поля с помощью инжектора
        StudentInjector.injectStudents(school);

        // Проверяем результат
        System.out.println(school.student1);
        System.out.println(school.student2);
    }
}
