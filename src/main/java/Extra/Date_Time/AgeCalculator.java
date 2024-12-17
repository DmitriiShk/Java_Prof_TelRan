package Extra.Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculator {

    public static void main(String[] args) {

        calculateAge();

    }

    public static void calculateAge() {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.print("Введите дату рождения в формате ДД.ММ.ГГГГ (например, 12.05.2005): ");
        String input = scanner.nextLine();

        try {
            //Преобразование строки в дату:
            LocalDate birthDate = LocalDate.parse(input, formatter);

            LocalDate currentDate = LocalDate.now();

            // Проверка на будущее время
            if (birthDate.isAfter(currentDate)) {
                System.out.println("Дата рождения не может быть в будущем!");
                return;
            }
            // Вычисление возраста
            int age = (int) ChronoUnit.YEARS.between(birthDate, currentDate);
            System.out.println("Ваш возраст: " + age + " лет.");
        } catch (DateTimeParseException e) {
            System.out.println("Некорректный формат даты. Убедитесь, что вы ввели дату в формате ДД.ММ.ГГГГ.");
        }
    }

}
