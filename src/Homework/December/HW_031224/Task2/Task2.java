package Homework.December.HW_031224.Task2;

import java.io.IOException;

public class Task2 {

    /*
    Один метод вызывает три других метода, которые выбрасывают проверяемые и непроверяемые исключения:
    public static void method1() {
    System.out.println(1 / 0);
    }
    public static void method2() {
    throw new NullPointerException("nulls everywhere!");
    }
    public static void method3() throws IOException {
    throw new IOException("File not found");
    }
    Отловить эти исключения и выбросить вместо них MyAppException, который содержал бы информацию о типе
    исходного исключения и его сообщение.
     */

    public static void main(String[] args) {

        try {
            threeInOne();
        } catch (MyAppException e) {
            System.out.println("Caught MyAppException: " + e.getMessage());
        }

    }

    public static void threeInOne() throws MyAppException {
        try {
            method1();
            method2();
            method3();
        } catch (ArithmeticException e) {
            throw new MyAppException("ArithmeticException", e.getMessage());
        } catch (NullPointerException e) {
            throw new MyAppException("NullPointerException", e.getMessage());
        } catch (IOException e) {
            throw new MyAppException("IOException", e.getMessage());
        }
    }

    public static void method1() {
        System.out.println(1/0);
    }

    public static void method2() {
        throw new NullPointerException("nulls everywhere!");
    }

    public static void method3() throws IOException {
        throw new IOException("File not found");
    }

}
