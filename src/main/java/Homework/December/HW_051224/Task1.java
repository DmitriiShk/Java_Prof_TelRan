package Homework.December.HW_051224;

/*
Напишите регулярное выражение, которое соответствует любому номеру телефона согласно формату:
телефонный номер состоит из 7 цифр подряд или из 3х цифр, пробела или тире, а затем из 4 цифр
(1234567, 123-4567, 123 4567).
 */

import java.util.regex.Pattern;

public class Task1 {

    public static void main(String[] args) {

        String regex = "\\d{7}|\\d{3}[- ]\\d{4}";

        String[] testNumbers = {"1234567", "123-4567", "123 4567", "123456", "12 34567"};

        for (String number : testNumbers) {
            if (Pattern.matches(regex, number)) {
                System.out.println(number + " is valid.");
            } else {
                System.out.println(number + " is invalid.");
            }
        }
    }

}
