package Homework.HW_051124.PriorityQueue.Version2;

import java.util.*;

// Класс для представления магазина
class Store {

    // Очередь с приоритетом, которая хранит товары по возрастанию цены
    private Queue<Product> products;

    public Store() {
        // Comparator для сортировки товаров по возрастанию цены
        products = new PriorityQueue<>(Comparator.comparingDouble(Product::getPrice));
    }

    // Метод для завоза товаров со склада в магазин
    public void stockFromWarehouse(Warehouse warehouse) {
        List<Product> newProducts = warehouse.transferProductsToStore();
        products.addAll(newProducts);
        System.out.println("В магазин завезены товары со склада: " + newProducts);
    }

    // Метод для покупки самого дешевого товара
    public Product buyCheapestProduct() {
        if (products.isEmpty()) {
            System.out.println("В магазине нет товаров для покупки.");
            return null;
        }
        Product cheapestProduct = products.poll();
        System.out.println("Куплен товар: " + cheapestProduct);
        return cheapestProduct;
    }

    // Метод для проверки наличия товаров
    public boolean hasProducts() {
        return !products.isEmpty();
    }
}
