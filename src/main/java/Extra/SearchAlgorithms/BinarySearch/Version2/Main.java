package Extra.SearchAlgorithms.BinarySearch.Version2;

public class Main {

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 2;
        int result = binarySearch(sortedArray, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return mid; // Элемент найден
            } else if (array[mid] < target) {
                low = mid + 1; // Ищем в правой половине
            } else {
                high = mid - 1; // Ищем в левой половине
            }
        }
        return -1; // Элемент не найден
    }
}


/*
Объяснение кода:

1. **Метод `binarySearch`**:
   - Принимает отсортированный массив `array` и целевое значение `target`.
   - Устанавливает границы поиска: `low` и `high`.
   - Использует цикл `while`, который продолжается, пока `low` меньше или равен `high`.
   - Находит индекс `mid`, который соответствует средней позиции между `low` и `high`.
   - Сравнивает элемент по индексу `mid` с целевым значением:
     - Если они равны, возвращает индекс `mid`.
     - Если элемент по индексу `mid` меньше целевого, сдвигает `low` вправо.
     - Если элемент больше, сдвигает `high` влево.
2. **Пример использования**:
   - В `main` методе мы создаем отсортированный массив и вызываем метод `binarySearch`, выводя результат на экран.

Этот метод работает за логарифмическое время, то есть O(log n), что делает его эффективным для поиска в больших отсортированных массивах.
 */
