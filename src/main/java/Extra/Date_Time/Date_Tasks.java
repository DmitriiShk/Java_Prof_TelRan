package Extra.Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Date_Tasks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        System.out.print("Enter birth date in the format of dd.mm.yyyy (for example: 01.12.1970): ");

        String input = scanner.nextLine();

        LocalDate birthDate = LocalDate.parse(input, formatter);
        LocalDate currentDate = LocalDate.now();
        int currentAge = (int)ChronoUnit.YEARS.between(birthDate, currentDate);
        System.out.println("Current age is: " + currentAge);
    }

}
