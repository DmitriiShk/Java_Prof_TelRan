package Lessons.Lesson_13_291024.DataStorageTask;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        DataStorage dS1 = new DataStorage(new Data ("data1", 1), 10.0, 1, true);
        DataStorage dS2 = new DataStorage(new Data ("data1", 1), 10.0, 1, false);
        DataStorage dS3 = new DataStorage(new Data ("data2", 1), 10.0, 2, true);
        DataStorage dS4 = new DataStorage(new Data ("data2", 1), 10.0, 1, true);
        DataStorage dS5 = new DataStorage(new Data ("data3", 1), 15.0, 1, true);
        DataStorage dS6 = new DataStorage(new Data ("data3", 1), 10.0, 1, true);

        List<DataStorage> storages = new ArrayList<>(List.of(dS1, dS2, dS3, dS4, dS5, dS6));

        Collections.sort(storages);

        System.out.println(storages);

    }

}
