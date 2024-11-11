package Homework.HW_241024.Task_4_ElementSearch;

public class Main {

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        int[] elements = {1, 4, 3, 2, 1, 2, 2, 0};
        for (int element : elements) {
            ll.append(element);
        }

        int targetElement = 2;
        int[] result = ll.findFirstAndLast(targetElement);
        System.out.println("First entry of the element in the list: " + result[0] + "; Second entry of the element in the list: " + result[1]);  // Вывод: 3 6
    }

/*

Вот пример реализации на Java, который находит первое и последнее вхождение указанного элемента в связанном списке:

Пояснение:
1. **Node** — класс для узла связанного списка.
2. **LinkedList** — класс для управления связанным списком, с методами `append` (добавление элемента) и `findFirstAndLast`
   (поиск первого и последнего вхождения).
3. В методе `findFirstAndLast` мы перебираем список, обновляя индексы для первого и последнего вхождения искомого элемента.
4. В `main` мы создаем список, добавляем элементы и вызываем метод для поиска индексов, затем выводим их на экран.

*/


}
