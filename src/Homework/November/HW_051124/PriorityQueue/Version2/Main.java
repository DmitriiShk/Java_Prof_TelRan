package Homework.November.HW_051124.PriorityQueue.Version2;

// Тестирование работы магазинов и складов
public class Main {

    public static void main(String[] args) {
        Store store = new Store();

        // Создаем склады
        Warehouse warehouse1 = new Warehouse();
        Warehouse warehouse2 = new Warehouse();

        // Добавляем товары на склады
        warehouse1.addProduct(new Product("Товар с склада 1 - А", 100.0));
        warehouse1.addProduct(new Product("Товар с склада 1 - B", 50.0));
        warehouse2.addProduct(new Product("Товар с склада 2 - X", 80.0));
        warehouse2.addProduct(new Product("Товар с склада 2 - Y", 60.0));

        // Завоз товаров со складов в магазин
        store.stockFromWarehouse(warehouse1);
        store.stockFromWarehouse(warehouse2);

        System.out.println("\nПокупатели покупают товары:");

        // Моделируем покупателей, которые покупают самый дешевый товар
        while (store.hasProducts()) {
            store.buyCheapestProduct();
        }
    }

}
