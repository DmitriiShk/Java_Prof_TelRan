package Lessons.Lesson_10_181024.Tasks.Task_1;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Box box = new Box("A", "B", "C");

        Iterator<String> iterator = box.iterator();

        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }
    }

}
