package Homework.HW_141124.Task2_Even_Odd_Numbers;


import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        Consumer<int[]> evenOddArrayConsumer = array -> {
            for (int number : array) {
                if (number % 2 == 0) {
                    System.out.println("Четное число: " + number);
                } else {
                    System.err.println("Нечетное число: " + number);
                }
            }
        };

        // Пример использования
        evenOddArrayConsumer.accept(numbers);


        //Простой Consumer. Принимает на вход числа:
//        Consumer<Integer> evenOddConsumer = number -> {
//            if (number % 2 == 0) {
//                System.out.println("Even number: " + number);
//            } else {
//                System.err.println("Odd number: " + number);
//            }
//        };
//
//        // Пример использования
//        evenOddConsumer.accept(4); // Четное число: 4
//        evenOddConsumer.accept(7); // Нечетное число: 7
//        evenOddConsumer.accept(10); // Четное число: 10
//        evenOddConsumer.accept(3); // Нечетное число: 3
    }
}




