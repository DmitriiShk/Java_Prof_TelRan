package Homework.HW_051124.StackFromArray;

import java.util.Arrays;

public class MyStack {
    private String[] data;
    private int top; // Указатель на верхний элемент стека

    // Конструктор с заданным размером стека
    public MyStack(int size) {
        data = new String[size];
        top = -1; // Изначально стек пуст
    }

    // Метод для добавления элемента в стек
    public void push(String item) {
        if (top == data.length - 1) {
            throw new StackOverflowError("Стек заполнен. Невозможно добавить элемент: " + item);
        }
        data[++top] = item;
    }

    // Метод для извлечения элемента из стека
    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст. Невозможно извлечь элемент.");
        }
        return data[top--];
    }

    // Метод для просмотра верхнего элемента стека без его извлечения
    public String peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст. Невозможно посмотреть верхний элемент.");
        }
        return data[top];
    }

    // Метод для получения текущего размера стека
    public int size() {
        return top + 1;
    }

    // Метод для проверки, пуст ли стек
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        return "MyStack {" +
                "data = " + Arrays.toString(data) +
                ", top = " + top +
                '}';
    }
}
