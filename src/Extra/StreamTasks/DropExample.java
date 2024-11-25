package Extra.StreamTasks;

import java.util.Arrays;
import java.util.List;

public class DropExample {

    // Класс содержит примеры использования метода dropWhile() и класса Collectors
    public static void main(String[] args) {

    // Пример использования метода dropWhile() без параметров
    // Метод dropWhile() отбрасывает элементы из начала потока, пока выполняется указанное условие.
    // В данном примере мы создаем список чисел и отбрасываем все элементы,
    // меньшие или равные 5.
    List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 1, 3, 5, 7, 9);

    List<Integer> resultList = numbers.stream().dropWhile(n -> n <= 5).toList();
        System.out.println("LIst before dropWile() function: " + numbers);
        System.out.println("List after dropWile() function: " + resultList);

    List<Integer> resultList1 = numbers.stream().sorted().distinct().dropWhile(n -> n <= 5).toList();
        System.out.println("List after sorting and dropWile() function: " + resultList1);

    // Пример использования метода dropWhile() с условием, проверяющим квадрат предыдущего числа
    // В данном примере мы создаем список чисел и отбрасываем все элементы, пока не встретится число,
    // которое не является квадратом предыдущего числа.
    List<Integer> numbers1 = Arrays.asList(2, 4, 8, 16, 3, 5, 7, 9);

    List<Integer> resultList2 = numbers1.stream().dropWhile(current -> current == 2
                                || current == 4 || current == 8 || current == 16
                                || current == 3 || current == 5 || current == 7
                                || current == 9).toList();
    System.out.println("\nList before dropWhile(): " + numbers1);
    System.out.println("List after dropWhile(): " + resultList2);

    // Пример использования класса Collectors для сбора результатов
    //    В данном примере мы создаем список строк и собираем только
    //    уникальные строки, приводя их к верхнему регистру.
    List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana");

        List<String> uniqueWordsUpperCase = words.stream().distinct()
                                            .map(String::toUpperCase).toList();
        System.out.println("\nList of unique words in upper case: "
                           + uniqueWordsUpperCase);

    }

}
