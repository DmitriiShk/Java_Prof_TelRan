package Lessons.Lesson_16_071124;

import java.util.*;

public class Pizza {

    private String name;
    private int size;
    private String cookName;
    private boolean isPresent;

    public Pizza(String name, int size, String cookName, boolean isPresent) {
        this.name = name;
        this.size = size;
        this.cookName = cookName;
        this.isPresent = isPresent;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getCookName() {
        return cookName;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Margarita", 2, "Peter", true);
        Pizza pizza2 = new Pizza("4 Cheese", 5, "Mark", false);
        Pizza pizza3 = new Pizza("Pepperoni", 6, "Mark", true);
        Pizza pizza4 = new Pizza("Diablo", 2, "Peter", false);
        Pizza pizza5 = new Pizza("Spicy", 2, "Steve", true);
        Pizza pizza6 = new Pizza("With Pork", 2, "Peter", false);
        Pizza pizza7 = new Pizza("Vegatarian", 2, "Steve", true);
        List<Pizza> pizzas = List.of(pizza1, pizza2, pizza3, pizza4, pizza5, pizza6, pizza7);


//  На основе тестового списка экземпляров данного класса List<Pizza> pizzas
//   a. Получить Map<String, Boolean> имя / информация, в наличии ли пицца

        Map<String, Boolean> mapPizzasPresent = new HashMap<>();
        for (Pizza pizza : pizzas){
            mapPizzasPresent.put(pizza.name, pizza.isPresent);
        }

        System.out.println(mapPizzasPresent);

//   b. Получить Map<String, Integer> повар / количество пиц, приготовленных этим поваром

        // Создаем Map для хранения количества пицц, приготовленных каждым поваром
        Map<String, Integer> cookToPizzaCount = new HashMap<>();

        // Перебираем список пицц и заполняем Map
        for (Pizza pizza : pizzas) {
            String cook = pizza.cookName;

            // Проверяем, есть ли повар в карте
            if (cookToPizzaCount.containsKey(cook)) {
                // Если повар есть, увеличиваем количество пицц
                cookToPizzaCount.put(cook, cookToPizzaCount.get(cook) + 1);
            } else {
                // Если повара нет, добавляем его с количеством 1
                cookToPizzaCount.put(cook, 1);
            }
        }

        // Выводим результат
        for (Map.Entry<String, Integer> entry : cookToPizzaCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

//   c. Получить Map<String, Set<String>> повар / список имен пиц, приготовленных этим поваром

        // Создаем Map для хранения результатов
        Map<String, Set<String>> PizzasByCook = new HashMap<>();

        // Перебираем список пицц и заполняем Map
        for (Pizza pizza : pizzas) {
            String cook = pizza.cookName;
            String pizzaName = pizza.name;

        // Если для повара еще нет множества пицц, создаем его
            if (!PizzasByCook.containsKey(cook)) {
                PizzasByCook.put(cook, new HashSet<>());
            }

        // Добавляем название пиццы в соответствующее множество
            PizzasByCook.get(cook).add(pizzaName);
        }

        // Выводим результат
        for (Map.Entry<String, Set<String>> entry : PizzasByCook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
