package Homework.December.HW_101224;


import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
   Рейс из Лос-Анджелеса во Франкфурт отправляется в 15:05 по местному времени и длится 10 ч. 50 м.
   Во сколько он прилетит? Написать метод, который мог бы совершать подобные вычисления.
 */
public class Task_2 {

    public static void main(String[] args) {

        String departureTime = "15:05";
        String departureZone = "America/Los_Angeles";
        String arrivalZone = "Europe/Berlin";
        int flightHours = 10;
        int flightMinutes = 50;

        String arrivalTime = calculateArrivalTime(departureTime, departureZone, arrivalZone, flightHours, flightMinutes);
        System.out.println("Время прибытия: " + arrivalTime);
    }

    public static String calculateArrivalTime(String departureTime, String departureZone, String arrivalZone, int flightHours, int flightMinutes) {

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        LocalDateTime localDeparture = LocalDateTime.now()
                .withHour(Integer.parseInt(departureTime.split(":")[0]))
                .withMinute(Integer.parseInt(departureTime.split(":")[1]))
                .withSecond(0)
                .withNano(0);

        ZonedDateTime departureZoned = localDeparture.atZone(ZoneId.of(departureZone));

        ZonedDateTime arrivalZoned = departureZoned.plusHours(flightHours).plusMinutes(flightMinutes);

        ZonedDateTime arrivalInTargetZone = arrivalZoned.withZoneSameInstant(ZoneId.of(arrivalZone));

        return arrivalInTargetZone.format(timeFormatter);
    }

}
