package Extra.DynamicArray;

public class DynamicArray {

    private int[] array; // Основной массив
    private int count;   // Количество элементов в массиве
    private int size;    // Текущий размер массива

    // Конструктор: создаёт массив начального размера 1
    public DynamicArray() {
        this.array = new int[1];
        this.count = 0;
        this.size = 1;
    }

    // Метод для добавления элемента в массив
    public void add(int data) {
        if (count == size) { // Если массив заполнен, увеличиваем его
            growSize();
        }
        array[count] = data; // Добавляем элемент в конец массива
        count++;             // Увеличиваем количество элементов
    }

    // Метод для удаления последнего элемента
    public void remove() {
        if (count > 0) {      // Проверяем, что есть элементы для удаления
            count--;          // Уменьшаем количество элементов
            array[count] = 0; // Необязательно, но можно сбросить значение
        } else {
            System.out.println("Array is already empty.");
        }
    }

    // Метод для увеличения размера массива в 1.5 раза
    private void growSize() {
        size = (int) (size * 1.5);      // Увеличиваем размер в 1.5 раза
        int[] newArray = new int[size]; // Создаём новый массив увеличенного размера
        // Перекопируем элементы из старого массива в новый
        for (int i = 0; i < count; i++) {
            newArray[i] = array[i];
        }
        array = newArray; // Заменяем старый массив на новый
    }

    // Метод для отображения текущего состояния массива
    public void printArray() {
        System.out.print("Array elements: ");
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}