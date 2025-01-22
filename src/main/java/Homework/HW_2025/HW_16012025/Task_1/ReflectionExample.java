package Homework.HW_2025.HW_16012025.Task_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Получаем класс MyStack
            Class<?> stackClass = Class.forName("MyStack");

            // Создаем экземпляр класса MyStack с емкостью 5
            Constructor<?> constructor = stackClass.getConstructor(int.class);
            Object stackInstance = constructor.newInstance(5);

            // Получаем метод push()
            Method pushMethod = stackClass.getMethod("push", String.class);

            // Добавляем элементы "A", "B", "C", "D", "E" через рефлексию
            pushMethod.invoke(stackInstance, "A");
            pushMethod.invoke(stackInstance, "B");
            pushMethod.invoke(stackInstance, "C");
            pushMethod.invoke(stackInstance, "D");
            pushMethod.invoke(stackInstance, "E");

            // Пытаемся добавить шестой элемент "F"
            try {
                pushMethod.invoke(stackInstance, "F");
            } catch (InvocationTargetException e) {
                // Обработка исключения, вызванного переполнением стека
                System.out.println("Exception: " + e.getCause().getMessage());
            }

            // Получаем метод pop()
            Method popMethod = stackClass.getMethod("pop");

            // Вызываем pop() и выводим результат
            String poppedElement = (String) popMethod.invoke(stackInstance);
            System.out.println("Popped element: " + poppedElement);

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
