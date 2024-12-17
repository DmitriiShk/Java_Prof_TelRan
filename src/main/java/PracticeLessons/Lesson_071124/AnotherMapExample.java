package PracticeLessons.Lesson_071124;

import java.util.*;

public class AnotherMapExample {

    public static void main(String[] args) {

        Map<String, Map<String, List<Integer>>> data = Map.of(
                "Country1", Map.of(
                        "Electronics", List.of(5, 8, 7),
                        "Clothing", List.of(6, 9)
                ),
                "Country2", Map.of(
                        "Food", List.of(3, 4),
                        "Electronics", List.of(8, 8, 9)
                )
        );

        System.out.println(data);

        // Проходим по всем странам в data
        for (Map.Entry<String, Map<String, List<Integer>>> entry : data.entrySet()) {
            String country = entry.getKey();
            Map<String, List<Integer>> categories = entry.getValue();

            String mostPopularCategory = null;
            int maxSum = Integer.MIN_VALUE;

            // Проходим по всем категориям для данной страны
            for (Map.Entry<String, List<Integer>> categoryEntry : categories.entrySet()) {
                String category = categoryEntry.getKey();
                List<Integer> values = categoryEntry.getValue();

                // Вычисляем сумму значений для этой категории
                int sum = values.stream().mapToInt(Integer::intValue).sum();

                // Если сумма больше текущей максимальной, обновляем
                if (sum > maxSum) {
                    maxSum = sum;
                    mostPopularCategory = category;
                }
            }

            // Выводим результат для данной страны
            System.out.println("Для страны " + country + " самой популярной категорией является: " + mostPopularCategory);
        }
    }
}
