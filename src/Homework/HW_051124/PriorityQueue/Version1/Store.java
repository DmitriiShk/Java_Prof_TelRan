package Homework.HW_051124.PriorityQueue.Version1;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Store {

    // Очередь с приоритетом, которая хранит товары по возрастанию цены
    private Queue<Product> products;

    public Store() {
        // Comparator для сортировки товаров по возрастанию цены
        products = new PriorityQueue<>(Comparator.comparingDouble(Product::getPrice));
    }

    // Метод для добавления товара в магазин
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Добавлен товар: " + product);
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


