package Homework.December.HW_031224;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task3 {

/*
В некотором методе возникает Exception. Реализовать логирование стектрейса Exception со временем ошибки в
файл errors.log. Логи всех возникших Exception должны накапливаться в файле, не перезаписываясь при
перезапуске программы.
 */

    private static final String LOG_FILE = "D:\\TelRan\\Java_Prof\\IO_Stream_Practice_Files\\Errors.log";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void logException(Exception e) {
        try (FileWriter fileWriter = new FileWriter(LOG_FILE, true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            String timestamp = LocalDateTime.now().format(DATE_FORMATTER);
            printWriter.println("[" + timestamp + "] Exception occurred:");
            e.printStackTrace(printWriter);
            printWriter.println(); // добавляем пустую строку для разделения записей
        } catch (IOException ioException) {
            System.err.println("Unable to write to log file: " + ioException.getMessage());
        }
    }

        public static void readLogFile() {
            try (BufferedReader br = new BufferedReader(new FileReader(LOG_FILE))) {
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Unable to read the log file: " + e.getMessage());
            }
        }

    public static void main(String[] args) {

        try {
            throw new RuntimeException("Test exception");
        } catch (Exception e) {
            logException(e);
        }

        System.out.println();
        readLogFile();

    }
}
