package Homework.December.HW_031224;

import java.io.*;

public class Task1 {

    /*
     1. Создайте файл с текстом: "This is my first experience when I work with IO API. I can do everything!"
        Откройте и прочтите файл, напечатав его содержимое в консоль.
     */

    /*
    D:\TelRan\Java_Prof\IO_Stream_Practice_Files
     */

    public static void main(String[] args) {

        String fileName = "D:\\TelRan\\Java_Prof\\IO_Stream_Practice_Files\\File.txt";
        String text = "This is my first experience when I work with IO API. I can do everything!";
        System.out.println();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text);
            System.out.println("Файл успешно создан и записан!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
