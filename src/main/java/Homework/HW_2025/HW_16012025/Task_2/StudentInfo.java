package Homework.HW_2025.HW_16012025.Task_2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Аннотация для инициализации Student
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface StudentInfo {
    String name();
    String surname();
    int groupNumber();
    boolean isOnline();
}
