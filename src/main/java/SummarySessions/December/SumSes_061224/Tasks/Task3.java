package SummarySessions.December.SumSes_061224.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    public static void main(String[] args) {
        String text = "This is a simple test. Try testing the " +
                      "method with some words starting with t.";
        char letter = 't';

        // Вызываем метод для поиска слов, начинающихся с буквы 't'
        List<String> words = findWordsStartingWithLetter(text, letter);

        // Выводим найденные слова
        System.out.println("Words starting with '" + letter + "': " + words);
    }

    public static List<String> findWordsStartingWithLetter(String text, char letter) {

        String regex = "\\b" + letter + "\\w*\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(text);

        List<String> result = new ArrayList<>();

        while (matcher.find()) {
            result.add(matcher.group());
        }

        return result;
    }


}
