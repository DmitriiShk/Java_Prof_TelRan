package Homework.November.HW_051124.PriorityQueue.Version2;

import java.util.*;

// Класс для представления склада
public class Warehouse {

    private List<Product> products;

    public Warehouse() {
        products = new ArrayList<>();
    }

    // Метод для добавления товара на склад
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("На склад добавлен товар: " + product);
    }

    // Метод для передачи всех товаров со склада в магазин
    public List<Product> transferProductsToStore() {
        List<Product> transferredProducts = new ArrayList<>(products);
        products.clear(); // Очищаем склад после передачи товаров
        return transferredProducts;
    }

}
