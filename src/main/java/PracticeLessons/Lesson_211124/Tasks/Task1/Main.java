package PracticeLessons.Lesson_211124.Tasks.Task1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(1, 5, 10, 17, 25, 80, 32, 46, 58, 11, 9);

        //1.
        System.out.println("Sum of odd numbers' squares = " + sumOfSquaresOfOddNumbers(integerList));

        //2.
        List<String> stringList = List.of("Apple", "Orange", "Banana", "Qiwi", "Plum", "Pear", "Orange", "Qiwi", "Plum");

        System.out.println("List of unique sorted words: " + uniqueSortedWords(stringList));
        System.out.println();

        //3.
        System.out.println("List of strings with unique symbols: " + uniqueChars(stringList));
        System.out.println();

        //4.
        System.out.println("The longest word in the list is: " + longestString(stringList));
        System.out.println();
    }

    //1. Напишите метод, который принимает список чисел и возвращает сумму
    //   квадратов всех нечетных чисел в списке.
    public static int sumOfSquaresOfOddNumbers(List<Integer> numbers) {
        Integer sum = numbers.stream().filter(n -> n % 2 != 0)
            .map(n -> n*n).reduce((n,m)-> n+m).orElse(0);
        return sum;
    }

    /* 2. Напишите метод, который принимает список строк и возвращает
          список уникальных слов, отсортированных в лексикографическом порядке.
     */
         public static List<String> uniqueSortedWords(List<String> strings) {
                 List<String> uniqueStrings = strings.stream().sorted()
                                              .distinct().toList();
             return uniqueStrings;
        }

    /* 3. Напишите метод, который принимает список строк и возвращает
          список строк, содержащихтолько уникальные символы (т.е. символы,
          которые не повторяются в строке).
     */
        public static List<String> uniqueChars(List<String> strings) {

            List<String> uniqueSymbols = strings.stream().distinct()
                                        .filter(word -> word.chars()
                                        .distinct().count() == word.length())
                                        .toList();
            return uniqueSymbols;
        }
    // В данном решении использую 2 distinct() т.к. применяю метод к
    // списку, где есть повторяющиеся значения
        public static List<String> uniqueChars1(List<String> strings){
           return strings.stream().map(s -> s.chars().distinct()
                            .collect(StringBuilder::new,
                                     StringBuilder::appendCodePoint,
                                     StringBuilder::append)
                            .toString()).toList();
        }

    //4. Напишите метод, который принимает список строк и возвращает
    //   самую длинную строку в списке.
    public static String longestString(List<String> strings) {
         String longestWord = strings.stream().max(Comparator
           .comparingInt(String::length)).orElse("None");
         //strings.stream().max((s1, s2) -> Integer.compare(s1.length(),
        //                                 s2.length())).orElse("None")
         return longestWord;
    }


}
