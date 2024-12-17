package Lessons.Lesson101224.Lesson_Tasks;

/*
// 1) создать любую дату
        // - вывести на консоль на немецком / английском языках
        // - найти, на какой день недели она выпала
        // - вычесть 10 лет из созданной даты, вывести на консоль
        // - посчитать количество дней до нее (ChronoUnit.DAYS)
 */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Task1 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2023, 12, 10);

        System.out.println("Datum auf Deutsch: " + date.format(java.time.format.
                           DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.GERMAN)));

        System.out.println("Date in English: " + date.format(java.time.format.
                            DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.ENGLISH)));

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println("Day of week: " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault()));

        LocalDate minus10Years = date.minusYears(10);
        System.out.println("The date 10 years ago: " + minus10Years);

        LocalDate today = LocalDate.now();
        long daysUntil = ChronoUnit.DAYS.between(today, date);
        System.out.println("Period in days till the created date: " + daysUntil);

    }


}
