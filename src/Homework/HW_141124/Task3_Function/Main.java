package Homework.HW_141124.Task3_Function;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        // Создаем функции
        Function<Integer, Integer> f1 = x -> x * 10; // Умножить на 10
        Function<Integer, String> f2 = x -> "<<" + x + ">>"; // Преобразовать в строку
        Function<String, Integer> f3 = String::length; // Посчитать длину строки

        // Составляем композицию функций: f1 -> f2 -> f3
        Function<Integer, Integer> composite1 = f1.andThen(f2).andThen(f3);

        // Тестируем последовательность f1 -> f2 -> f3
        int result1 = composite1.apply(777); // Входное значение: 777
        System.out.println(result1); // Вывод: 8


//        // Составляем композицию функций: f3 -> f1 -> f2
//        Function<String, String> composite2 = f3
//                .andThen(x -> x * 10) // f3 -> f1
//                .andThen(x -> "<<" + x + ">>"); // f1 -> f2

        Function<String, String> composite2 = f3
                .andThen(f1) // f3 -> f1
                .andThen(f2);

        // Тестируем последовательность f3 -> f1 -> f2
        String result2 = composite2.apply("Hello!"); // Входное значение: "Hello!"
        System.out.println(result2); // Вывод: "<<60>>"
    }
}

