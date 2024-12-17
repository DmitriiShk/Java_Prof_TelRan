package Homework.November.HW_151124;

import java.util.function.Function;

public class Task2_Function {

    // Функция для обрезки строки до 11 символов
    public static Function<String, String> truncateTo11 = text -> {
        if (text.length() > 11) {
            return text.substring(0, 11);
        }
        return text;
    };

    // Функция для добавления "Info: " перед строкой
    public static Function<String, String> addInfoPrefix = text -> "Info: " + text;

    // Функция для перевода строки в верхний регистр
    public static Function<String, String> toUpperCase = text -> text.toUpperCase();

    // Композитная функция: обрезает, переводит в верхний регистр и добавляет "Info: "
    public static Function<String, String> processText = truncateTo11.andThen(toUpperCase).andThen(addInfoPrefix);

    public static void main(String[] args) {
        // Пример использования
        String inputText = "Some random data";
        String output = processText.apply(inputText);
        System.out.println(output);  // Ожидаемый вывод: "Info: SOME RANDOM"
    }
}




