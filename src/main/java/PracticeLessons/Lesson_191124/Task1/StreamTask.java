package PracticeLessons.Lesson_191124.Task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTask {

    public static void main(String[] args) {

        // Задача 3: Преобразование списков в строку и удаление
        //           повторяющихся символов
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i")
        );
                        // Создаем поток из списков
        String result = listOfLists.stream()
        // Объединяем элементы вложенных списков в единый поток
                .flatMap(List::stream)
                // Удаляем повторяющиеся символы
                .distinct()
                // Объединяем элементы в строку
                .collect(Collectors.joining());
                // Вывод результата
        System.out.println(result);

    }
}