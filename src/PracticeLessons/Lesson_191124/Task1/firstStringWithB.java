package PracticeLessons.Lesson_191124.Task1;

import java.util.Arrays;
import java.util.List;

public class firstStringWithB {



    public static void main(String[] args) {

        // Поиск первой строки, начинающейся с буквы 'b'
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        //1st option.
        String s = words.stream().filter(word -> word.startsWith("b"))
                   .findFirst().get();
        System.out.println(s);

        //2nd option.
        String string = words.stream().
                        filter(word -> word.startsWith("b")).
                        findFirst().
                        orElse("No word found");

        System.out.println(string); // Вывод: banana

    }


}
