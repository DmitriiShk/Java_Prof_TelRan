package SummarySessions.SumSes_081124.Task1;

import java.util.HashMap;

public class Main {
    public static Integer findFirstElementWithKOccurrences(int[] arr, int k) {

        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Подсчитываем количество вхождений каждого элемента
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Ищем первый элемент, который встречается k раз
        for (int num : arr) {
            if (countMap.get(num) == k) {
                return num;
            }
        }
        // Если такого элемента нет, возвращаем null
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 2};
        int k = 4;

        Integer result = findFirstElementWithKOccurrences(arr, k);
        if (result != null) {
            System.out.println("Первый элемент, встречающийся " + k + " раз(а): " + result);
        } else {
            System.out.println("Элемент, встречающийся " + k + " раз(а), не найден.");
        }

    }
}
