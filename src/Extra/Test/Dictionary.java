package Extra.Test;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {

    public static void main(String[] args) {

        // Создаём словарь
               //Слово, перевод
        HashMap<String, String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Бесконечный цикл для взаимодействия с пользователем
        while (true) {
            System.out.println("Введите слово на английском (или 'exit' для выхода): ");
            //убираем все лишние пробелы и приводим к нижнему регистру.
            String word = scanner.nextLine().trim().toLowerCase();

            // Проверяем, не хочет ли пользователь выйти
            if (word.equals("exit")) {
                System.out.println("Выход из программы. До свидания!");
                break;
            }

            // Проверяем, есть ли слово в словаре
            if (dictionary.containsKey(word)) {
                System.out.println("Перевод: " + dictionary.get(word));
            } else {
                System.out.println("Слово не найдено в словаре. Введите перевод: ");
                String translation = scanner.nextLine().trim();

                // Сохраняем слово и перевод в словарь
                dictionary.put(word, translation);
                System.out.println("Слово и перевод успешно добавлены в словарь!");
            }
        }
        scanner.close();
    }
}
