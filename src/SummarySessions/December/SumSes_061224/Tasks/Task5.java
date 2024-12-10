package SummarySessions.December.SumSes_061224.Tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

    /*
    Напишите метод проверки введенного пароля. Пароль должен иметь от 8 до 15 символов,
    обязательно содержать цифры, буквы верхнего и нижнего регистра и спецсимволы: ~!#$/\-_.
     */
    public static void main(String[] args) {

        String[] testPasswords = {
                "Password1!",      // Валидный пароль
                "pass1!",          // Невалидный (нет заглавных букв)
                "PASSWORD1!",      // Невалидный (нет строчных букв)
                "Password",        // Невалидный (нет цифр и спецсимволов)
                "Password1@#$",    // Валидный пароль
                "12345678",        // Невалидный (нет букв и спецсимволов)
                "Passw0rd$"        // Валидный пароль
        };

        for (String password : testPasswords) {
            System.out.println(password + " : " + isValidPassword(password));
        }

    }

    public static boolean isValidPassword(String password) {
        // Регулярное выражение для проверки пароля
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[~!#$/\\\\\\-_.])[A-Za-z\\d~!#$/\\\\\\-_.]{8,15}$";

        // Проверка пароля с использованием регулярного выражения
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);

        return matcher.matches();
    }


}
