package Extra.Set_Tasks.Stack;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        3. На основе библиотечного класса LinkedList реализовать такую структуру данных, как стек:
        Создать класс CustomStack с методами push(), pop(), peek(). Протестировать работу класса.
         */

        // Пример использования CustomStack
        CustomStack<Integer> stack = new CustomStack();

        System.out.println("Стек пуст: " + stack.isEmpty());  // Проверка, что стек пуст

        // Добавляем элементы в стек
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Текущий размер стека: " + stack.size());  // Размер стека
        System.out.println("Верхний элемент стека: " + stack.peek());  // Получение верхнего элемента

        // Удаляем элементы из стека
        System.out.println("Удаляем элемент: " + stack.pop());  // Удаление верхнего элемента
        System.out.println("Текущий размер стека после pop: " + stack.size());  // Размер после удаления
        System.out.println("Верхний элемент стека после pop: " + stack.peek());  // Получение верхнего элемента

        // Удаляем оставшиеся элементы
        stack.pop();
        stack.pop();

        System.out.println("Стек пуст: " + stack.isEmpty());  // Проверка, что стек пуст

    }

}

class CustomStack<T>{

    private LinkedList<T> list;

    // Конструктор, создающий новый связанный список
    public CustomStack() {
        list = new LinkedList<>();
    }

    // Метод push() - добавление элемента в стек
    public void push(T item) {
        list.addFirst(item);  // Добавляем элемент в начало списка (верх стека)
    }

    // Метод pop() - удаление элемента из стека и его возвращение
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст.");
        }
        return list.removeFirst();  // Удаляем и возвращаем первый элемент списка (верх стека)
    }

    // Метод peek() - получение верхнего элемента стека без удаления
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст.");
        }
        return list.getFirst();  // Получаем первый элемент списка (верх стека)
    }

    // Метод isEmpty() - проверка, пуст ли стек
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Метод size() - возвращение размера стека
    public int size() {
        return list.size();
    }


}
