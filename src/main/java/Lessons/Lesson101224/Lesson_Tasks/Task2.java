package Lessons.Lesson101224.Lesson_Tasks;

/*

 */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class Task2 {

    public static void main(String[] args) {

        LocalDate lastThursdayNovember2024 = getLastDayOfWeekInMonth(2024, Month.NOVEMBER, DayOfWeek.THURSDAY);
        System.out.println("Последний четверг ноября 2024: " + lastThursdayNovember2024);

        LocalDate secondWednesdayMay2025 = getNthDayOfWeekInMonth(2025, Month.MAY, DayOfWeek.WEDNESDAY, 2);
        System.out.println("Вторая среда мая 2025: " + secondWednesdayMay2025);

    }

    public static LocalDate getLastDayOfWeekInMonth(int year, Month month, DayOfWeek dayOfWeek) {
        return LocalDate.of(year, month, 1).with(TemporalAdjusters.lastInMonth(dayOfWeek));
    }

    public static LocalDate getNthDayOfWeekInMonth(int year, Month month, DayOfWeek dayOfWeek, int n) {
        return LocalDate.of(year, month, 1).with(TemporalAdjusters.dayOfWeekInMonth(n, dayOfWeek));
    }

}
