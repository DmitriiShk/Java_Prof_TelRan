package PracticeLessons.Lesson_191124;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringFiltering {

    public static void main(String[] args) {

        // Задача 8: Фильтрация и преобразование строк

        // Исходный список строк
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "qiwi", "lime", "ananas");

        // Преобразование с фильтрацией и изменением строк
        List<String> filteredWords = words.stream().
                filter(word -> word.length() > 4). // Оставляем строки длиной более 5 символов
                        map(String::toUpperCase).         // Преобразуем оставшиеся строки в верхний регистр
                        collect(Collectors.toList());   // Собираем результат в новый список

        // Вывод результата
        filteredWords.forEach(System.out::println);
    }

}
