package Extra.StreamTasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExamples {
    /*
      Метод flatMap() применяет функцию к каждому элементу стрима и затем выводит результаты
      в один плоский стрим.
    */
    public static void main(String[] args) {

// Пример 1.txt: Разбиение строки на отдельные символы и их удвоение
        List<String> words = Arrays.asList("Привет", "Мир");

        // Разбиение строк на символы и удвоение их
        List<String> doubledChars = words.stream()
                // Преобразуем строку в IntStream
                .flatMap(word -> word.chars()
                // Преобразуем код символа обратно в строку
                .mapToObj(c -> String.valueOf((char) c)))
                .map(ch -> ch + ch) // Удваиваем символ
                .collect(Collectors.toList()); // Собираем в список
        // Вывод результата
        System.out.println(doubledChars);

        String collect = words.stream().flatMap(word -> word.chars()
                        .mapToObj(c -> String.valueOf((char) c)))
                .map(c -> c + c).collect(Collectors.joining());
        System.out.println("\n"+collect);

        // Пример 2: Разделение предложений на слова и преобразование слов в верхний регистр
        List<String> sentences = Arrays.asList("Java - прекрасный язык программирования",
                                               "Stream API упрощает обработку коллекций");

        List<String> listUpperCase = sentences.stream().flatMap(sentence -> Arrays
                        .stream(sentence.split(" ")))
                        .map(String::toUpperCase).toList();
        System.out.println("\n"+listUpperCase);

        // Пример 3: Создание всех возможных комбинаций пар чисел из двух списков
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);

//        List<String> combinations = list1.stream()
//                .flatMap(i -> list2.stream()
//                        .flatMap(j -> list2.stream()
//                                .map(k -> "(" + i + ", " + j + ", " + k + ")")))
//                .toList();
//        System.out.println("Все возможные комбинации чисел: " + combinations);

        List<int[]> combinationsList = list1.stream().flatMap(l1_element -> list2.stream()
                .map(l2_element -> new int[]{l1_element, l2_element})).toList();

        System.out.println("\nAll possible combinations of the lists' values: ");
        combinationsList.forEach(pair -> System.out.println("(" + pair[0] + ", " + pair[1] + ")"));




    }

}
