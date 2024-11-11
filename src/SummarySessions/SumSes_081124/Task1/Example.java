package SummarySessions.SumSes_081124.Task1;

import java.util.HashMap;

public class Example {

    public static void main(String[] args) {

        // Создаем HashMap и добавляем несколько значений
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 3);
        map.put("banana", 5);

        // Получаем значение по ключу "apple"
        // Вернет 3, так как ключ "apple" существует
        Integer appleCount = map.getOrDefault("apple", 0);
        System.out.println("Apple count: " + appleCount);

        // Получаем значение по ключу "orange" (которого нет в карте)
        // Вернет 0, так как ключ "orange" не существует
        Integer orangeCount = map.getOrDefault("orange", 0);
        System.out.println("Orange count: " + orangeCount);
    }
}



