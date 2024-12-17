package Homework.November.HW_151124;


import java.util.function.BiFunction;

public class Task1_BiFunction_Power {
    public static void main(String[] args) {

        // BiFunction, который возводит первый аргумент в степень второго
        BiFunction<Integer, Integer, Integer> powerFunction = (base, exponent) -> (int) Math.pow(base, exponent);

        // Пример использования
        int base = 2;
        int exponent = 3;
        int result = powerFunction.apply(base, exponent);

        System.out.println(base + " в степени " + exponent + " = " + result);
    }
}



