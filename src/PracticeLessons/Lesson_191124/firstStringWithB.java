package PracticeLessons.Lesson_191124;

import java.util.Arrays;
import java.util.List;

public class firstStringWithB {

    // Задача 13: Поиск первой строки, начинающейся с буквы 'b'

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        //1st option.
        String s = words.stream().filter(word -> word.startsWith("b")).findFirst().get();
        System.out.println(s);

        //2nd option.
        String string = words.stream().
                        filter(word -> word.startsWith("b")).
                        findFirst().
                        orElse("No word found");

        System.out.println(string); // Вывод: banana

    }


}
