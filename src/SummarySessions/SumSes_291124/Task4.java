package SummarySessions.SumSes_291124;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        String directoryPath = "C:/example/directory";
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            listTxtFiles(directory);
        } else {
            System.out.println("Указанный путь не является папкой или не существует.");
        }
    }

     public static void listTxtFiles(File folder) {
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                     listTxtFiles(file);
                } else if (file.isFile() && file.getName().endsWith(".txt")) {
                    System.out.println("Файл найден: " + file.getAbsolutePath());
                    printFileContents(file);
                }
            }
        }
    }


    public static void printFileContents(File file) {
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.err.println("Не удалось открыть файл: " + file.getAbsolutePath());
        }
    }
}

