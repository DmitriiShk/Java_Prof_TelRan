package Homework.December.HW_051224;

/*
Напишите метод валидации введенного пользователем адреcа электронной почты.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

    public static void main(String[] args) {
        String testEmail1 = "example@example.com";
        String testEmail2 = "invalid-email@.com";

        System.out.println("Email: " + testEmail1 + " is valid: " + isValidEmail(testEmail1)); // true
        System.out.println("Email: " + testEmail2 + " is valid: " + isValidEmail(testEmail2)); // false
    }

    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false; // Проверка на пустую строку или null
        }

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);

        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
