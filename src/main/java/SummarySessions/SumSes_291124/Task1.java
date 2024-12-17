package SummarySessions.SumSes_291124;

/*
Написать программу, которая дает пользователю арифметическую задачу со случайными числами и проверяет ответ
 */

import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        // Создаем экземпляры Random и Scanner
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Генерация двух случайных чисел от 1 до 100
        int num1 = random.nextInt(100) + 1;
        int num2 = random.nextInt(100) + 1;

        // Генерация случайного арифметического оператора (+, -, *, /)
        char[] operators = {'+', '-', '*', '/'};
        char operator = operators[random.nextInt(operators.length)];

        // Выводим задачу пользователю
        System.out.printf("Сколько будет %d %c %d?%n", num1, operator, num2);

        // Получаем ответ пользователя
        double userAnswer = scanner.nextDouble();

        // Вычисляем правильный ответ
        double correctAnswer = 0;
        switch (operator) {
            case '+':
                correctAnswer = num1 + num2;
                break;
            case '-':
                correctAnswer = num1 - num2;
                break;
            case '*':
                correctAnswer = num1 * num2;
                break;
            case '/':
                // Проверяем деление на ноль и округляем до двух знаков после запятой
                if (num2 != 0) {
                    correctAnswer = Math.round((num1 / (double) num2) * 100.0) / 100.0;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                break;
        }

        // Проверяем ответ пользователя
        if (Math.abs(userAnswer - correctAnswer) < 0.001) {
            System.out.println("Верно! Отличная работа.");
        } else {
            System.out.printf("Неверно. Правильный ответ: %.2f%n", correctAnswer);
        }

        // Закрываем сканер
        scanner.close();
    }

}
