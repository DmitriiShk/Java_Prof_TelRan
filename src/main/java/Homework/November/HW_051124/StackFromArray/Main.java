package Homework.November.HW_051124.StackFromArray;

public class Main {

    public static void main(String[] args) {

        MyStack stack = new MyStack(3);

        System.out.println("Стек пуст? " + stack.isEmpty()); // true

        // Добавление элементов
        stack.push("Первый");
        stack.push("Второй");
        stack.push("Третий");

        System.out.println("stack = " + stack);
        System.out.println();

        System.out.println("Размер стека после добавления 3 элементов: " + stack.size()); // 3
        System.out.println("Верхний элемент стека: " + stack.peek()); // Третий
        System.out.println("stack.isEmpty() = " + stack.isEmpty());
        System.out.println();

        // Попытка добавить элемент в заполненный стек
        try {
            stack.push("Четвертый");
        } catch (StackOverflowError e) {
            System.out.println(e.getMessage()); // Ожидаем сообщение об ошибке
        }

        // Извлечение элементов
        System.out.println("Извлекаем элемент: " + stack.pop()); // Третий
        System.out.println("Извлекаем элемент: " + stack.pop()); // Второй
        System.out.println("Верхний элемент после извлечения: " + stack.peek()); // Первый
        System.out.println("Размер стека: " + stack.size()); // 1

        // Попытка извлечь элемент из пустого стека
        stack.pop(); // Теперь стек пуст
        try {
            stack.pop();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage()); // Ожидаем сообщение об ошибке
        }

    }

}

