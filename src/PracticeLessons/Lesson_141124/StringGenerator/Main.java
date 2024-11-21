package PracticeLessons.Lesson_141124.StringGenerator;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Создаем экземпляр StringGenerator с помощью лямбда-выражения
        StringGenerator generator = () -> {
            Random random = new Random();
            int length = 5 + random.nextInt(6); // Длина строки от 5 до 10

            StringBuilder sb = new StringBuilder(length);
            // Генерируем случайные буквы (A-Z, a-z)
            for (int i = 0; i < length; i++) {
                char randomChar = (char) ('a' + random.nextInt(26));
                sb.append(randomChar);
            }
            return sb.toString();
        };

        // Генерируем и выводим 10 случайных строк
        for (int i = 0; i < 10; i++) {
            System.out.println(generator.generate());
        }
    }

    /*
    Объяснение кода
Интерфейс StringGenerator: Это функциональный интерфейс с единственным абстрактным методом generate(), который не принимает параметров и возвращает случайную строку.
Реализация интерфейса: Мы реализуем StringGenerator с помощью лямбда-выражения. Метод generate создает строку случайной длины от 5 до 10 символов.
Генерация случайной строки: Внутри метода generate, мы:
Определяем длину строки (от 5 до 10).
Используем цикл, чтобы последовательно добавлять случайные буквы в строку.
Вывод результата: С помощью IntStream.range(0, 10) мы генерируем и выводим 10 случайных строк.
Запустив этот код, вы получите 10 строк, каждая из которых будет состоять из случайных букв с длиной от 5 до 10 символов.
     */


}
