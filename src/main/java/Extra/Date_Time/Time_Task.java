package Extra.Date_Time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Time_Task {

    public static void main(String[] args) {

    LocalDateTime ldt = LocalDateTime.now();
    System.out.println(ldt);
    LocalDateTime ldt1 = LocalDateTime.of(2024, 12, 12, 9, 30);

    int hours = (int) ChronoUnit.HOURS.between(ldt, ldt1);
    int min = (int) (ChronoUnit.MINUTES.between(ldt, ldt1)-(ChronoUnit.HOURS.between(ldt, ldt1)*60));

    System.out.printf("Lesson will start in %sh and %smin", hours, min);

    }

}
