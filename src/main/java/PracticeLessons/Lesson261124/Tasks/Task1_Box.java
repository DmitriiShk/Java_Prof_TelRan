package PracticeLessons.Lesson261124.Tasks;

/*
Задание 1:
Создайте обобщенный класс Box, который может хранить объект любого типа.
Реализуйте методы для установки и получения значения.
 */

public class Task1_Box<T> {

    private T item;

    public Task1_Box(){}

    public Task1_Box(T item) {this.item = item;}

    public void setItem(T item) {this.item = item;}

    public T getItem() {return item;}

    public T removeItem() {
        T temp = item;
        item = null;
        return temp;
    }

    public boolean isEmpty() {
        return item == null;
    }

    @Override
    public String toString() {
        return "Box {" +
                "item = " + item +
                '}';
    }

    public static void main(String[] args) {

        Task1_Box<Integer> integerBox = new Task1_Box<>();
        integerBox.setItem(42);
        System.out.println(integerBox);
        System.out.println("Get: " + integerBox.getItem());
        System.out.println("Is empty: " + integerBox.isEmpty());
        System.out.println("Remove: " + integerBox.removeItem());
        System.out.println("Is empty: " + integerBox.isEmpty());

    }


}
