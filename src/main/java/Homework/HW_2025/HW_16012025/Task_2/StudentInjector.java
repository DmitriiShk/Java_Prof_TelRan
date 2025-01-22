package Homework.HW_2025.HW_16012025.Task_2;

import java.lang.reflect.Field;

public class StudentInjector {
    public static void injectStudents(Object obj) {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(StudentInfo.class)) {
                StudentInfo annotation = field.getAnnotation(StudentInfo.class);
                Student student = new Student(
                        annotation.name(),
                        annotation.surname(),
                        annotation.groupNumber(),
                        annotation.isOnline()
                );

                field.setAccessible(true); // Открываем доступ к приватным полям
                try {
                    field.set(obj, student);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
