package PracticeLessons.Lesson_191124;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueSymbols {

    public static void main(String[] args) {

        // Задача 6: Получение уникальных символов из списка строк
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        //1. Первый вариант решения с использованием Set:
        Set<Character> uniqueCharactersToSet = words.stream().flatMap(word -> word.chars().
                                          mapToObj(c -> (char) c)). // Разбиваем слова на символы
                                          collect(Collectors.toSet()); // Сохраняем уникальные символы в Set

        System.out.println("Set: " + uniqueCharactersToSet);

        //2. Второй вариант решения через distinct() и List.
        List<Character> uniqueCharachtersToList = words.stream().flatMap(word -> word.chars().
                                                  mapToObj(c -> (char) c)).distinct().// Разбиваем слова на символы
                                                  sorted().collect(Collectors.toList()); // Сохраняем уникальные символы в List

        System.out.println("List: " + uniqueCharachtersToList);

    }

}
