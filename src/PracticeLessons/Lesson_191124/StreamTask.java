package PracticeLessons.Lesson_191124;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask {

    public static void main(String[] args) {

        // Задача 3: Преобразование списков в строку и удаление повторяющихся символов
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i")
        );

        String result = listOfLists.stream() // Создаем поток из списков
                .flatMap(List::stream)        // Объединяем элементы вложенных списков в единый поток
                .distinct()                  // Удаляем повторяющиеся символы
                .collect(Collectors.joining()); // Объединяем элементы в строку

        System.out.println(result); // Вывод результата

    }
}