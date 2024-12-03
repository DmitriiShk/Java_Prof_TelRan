package SummarySessions.SumSes_291124;

/*
Напишите программу для получения списка файлов с расширением .txt из указанной папки.
 */

import java.io.File;
import java.io.FilenameFilter;

public class Task2 {

    public static void main(String[] args) {

        //String folderPath = "path/to/your/folder";
        File folder = new File("C:\\Users\\Home PC\\Desktop\\Java_BlackBelt\\Advanced_files");

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Указанный путь не существует или не является директорией.");
            return;
        }

        FilenameFilter txtFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".txt");
            }
        };

        File[] txtFiles = folder.listFiles(txtFilter);

        if (txtFiles != null && txtFiles.length > 0) {
            System.out.println("Список файлов с расширением .txt:");
            for (File file : txtFiles) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Файлы с расширением .txt не найдены.");
        }
    }

}
