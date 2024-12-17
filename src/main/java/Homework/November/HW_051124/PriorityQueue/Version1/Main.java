package Homework.November.HW_051124.PriorityQueue.Version1;

public class Main {

    public static void main(String[] args) {
        Store store = new Store();

        // Завоз товаров с двух складов
        store.addProduct(new Product("Товар с склада 1", 100.0));
        store.addProduct(new Product("Товар с склада 2", 80.0));
        store.addProduct(new Product("Товар с склада 1", 50.0));
        store.addProduct(new Product("Товар с склада 2", 60.0));

        System.out.println("\nПокупатели покупают товары:");

        // Моделируем покупателей, которые покупают самый дешевый товар
        while (store.hasProducts()) {
            store.buyCheapestProduct();
        }
    }


}
