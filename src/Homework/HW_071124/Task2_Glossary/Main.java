package Homework.HW_071124.Task2_Glossary;

import java.util.*;

public class Main {

    /*
    Имеется некоторый текст. Составить словарь используемых в нем слов с частотой их употребления.
    Отсортировать словарь по частоте встречаемости слов (по убыванию).
     */

    public static void main(String[] args) {

        // Пример текста
        String text = "Что такое осень? Это небо, плачущее небо под ногами. В лужах разлетаются птицы с облаками. " +
                      "Осень, я давно с тобою не был. В лужах разлетаются птицы с облаками. Осень, я давно с тобою не был";

        // Приводим текст к нижнему регистру
        text = text.toLowerCase();

        // Список символов для замены на пробелы (например, точки, запятые и т.д.)
        char[] delimiters = {'.', ',', '!', '?', ';', ':', '(', ')', '[', ']', '"', '\''};

        // Заменяем все разделители на пробелы
        for (char delimiter : delimiters) {
            text = text.replace(delimiter, ' ');
        }

        // Разбиваем текст на слова, используя пробел как разделитель
        String[] words = text.split(" ");

        // Подсчитываем частоту каждого слова
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) { // Игнорируем пустые строки
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }

        // Переносим записи из HashMap в список для сортировки
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordFrequency.entrySet());

        // Сортируем по значению (по убыванию частоты)
        Collections.sort(sortedEntries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry2.getValue().compareTo(entry1.getValue());
            }
        });

        // Выводим результат
        System.out.println("Слова и их частота:");
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}