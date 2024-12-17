package Extra.Date_Time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class DateTimeExamples {

    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);
        System.out.println(currentDate.getTime());

        LocalDate date = LocalDate.of(2014, 11, 7);

        Date date1 = new Date();

        System.out.println(date1);
        System.out.println(currentDate.equals(date1));

        System.out.println("\nDate: " + date);

        System.out.println("Date in German: " + date.format(DateTimeFormatter.ofPattern("d. MMMM yyyy", Locale.GERMAN)));
        System.out.println("Date in English: " + date.format(DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH)));

        System.out.println("\n****LocalDate Class****\n");

        LocalDate date2 = LocalDate.now();
        System.out.println(date2);

        LocalDate date3 = LocalDate.of(2024, 05, 12);
        System.out.println(date3);
        System.out.println(date2.getYear());
        System.out.println(date2.getEra());
        System.out.println(date3.getChronology());
        System.out.println(date3.getDayOfMonth());
        System.out.println(date3.getDayOfYear());
        System.out.println(date2.plusDays(10));
        System.out.println(date3.minusMonths(2));

        System.out.println("\n****ChronoUnit Class****\n");

        LocalDate localDate = LocalDate.of(2020, 12, 20);
        System.out.println(localDate);
        LocalDate localDate1 = LocalDate.of(2021, 8, 14);

        System.out.println(ChronoUnit.MONTHS.between(localDate, localDate1));
        System.out.println(ChronoUnit.YEARS.between(localDate, localDate1));
        System.out.println(ChronoUnit.WEEKS.between(localDate, localDate1));

        LocalTime localTime = LocalTime.parse("08:30");
        LocalTime localTime1 = LocalTime.parse("10:45");
        LocalTime localTime2 = LocalTime.now();
        System.out.println(localTime2);
        System.out.println(ChronoUnit.HOURS.between(localTime, localTime1));
        System.out.println(ChronoUnit.HOURS.between(localTime, localTime2));

        long start = System.currentTimeMillis();

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
            System.out.println("Current i = " + i + "; Current sum = " + sum);
        }
        System.out.println("Sum: " + sum);

        double finish = System.currentTimeMillis()-start;
        System.out.println("Time of cycle execution: " + finish);





    }

}
