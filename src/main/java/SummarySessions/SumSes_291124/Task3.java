package SummarySessions.SumSes_291124;

import java.io.File;

/*
Напишите программу, чтобы получить размер файла в байтах, КБ, МБ.
 */

public class Task3 {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Home PC\\Desktop\\Java_BlackBelt\\Advanced_files";

        File file = new File(filePath);

        if (file.exists()) {
            long bytes = file.length();
            double kilobytes = bytes / 1024.0;
            double megabytes = kilobytes / 1024.0;

            System.out.println("Размер файла:");
            System.out.println("В байтах: " + bytes + " байт");
            System.out.println("В килобайтах: " + String.format("%.2f", kilobytes) + " КБ");
            System.out.println("В мегабайтах: " + String.format("%.2f", megabytes) + " МБ");
        } else {
            System.out.println("Файл не найден по указанному пути: " + filePath);
        }
    }

}
