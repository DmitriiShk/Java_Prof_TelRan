package Homework.December.HW_101224;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/*
   Составить список времен начала всех занятий по Java на декабрь 2024, если
   предположить, что они проходят каждый вторник/четверг/пятницу c 9:30 CET.
*/

public class Task_1 {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm 'CET'");

        ZoneId cetZone = ZoneId.of("CET");

        LocalDate startDate = LocalDate.of(2024, 12, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 20);

        List<DayOfWeek> lessonDays = List.of(DayOfWeek.TUESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY);

        List<ZonedDateTime> lessonTimes = new ArrayList<>();

        for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
            if (lessonDays.contains(date.getDayOfWeek())) {
                LocalTime lessonTime = LocalTime.of(9, 30);
                ZonedDateTime zonedDateTime = ZonedDateTime.of(date, lessonTime, cetZone);
                lessonTimes.add(zonedDateTime);
            }
        }

        System.out.println("Расписание занятий по Java в декабре 2024:");
        for (ZonedDateTime lesson : lessonTimes) {
            System.out.println(lesson.format(formatter));
        }
    }
}
