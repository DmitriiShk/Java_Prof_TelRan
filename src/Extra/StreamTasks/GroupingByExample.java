package Extra.StreamTasks;

import com.sun.security.jgss.GSSUtil;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {

    public static void main(String[] args) {
        // Пример 1: Группировка списка целых чисел по остатку от деления на 3
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Integer, List<Integer>> groupingBy1 = numbers.stream()
                       .collect(Collectors.groupingBy(n -> n % 3));

        //System.out.println(groupingBy1);
        groupingBy1.forEach((remainder, nums) -> System.out.println
                            ("Остаток " + remainder + ": " + nums));
        System.out.println();

        // Пример 2: Группировка списка строк по их длине
        List<String> strings = Arrays.asList("apple", "banana",
                               "cherry", "date", "elderberry");

        Map<Integer, List<String>> groupingByLength = strings.stream().
                        collect(Collectors.groupingBy(s -> s.length()));

        groupingByLength.forEach((k, v) -> System.out.println
                                           ("Length: " + k + ": " + v));
        System.out.println();

        // Пример 3: Группировка списка объектов по их свойству "тип"
        List<Person> people = Arrays.asList(
                new Person("John", "student"),
                new Person("Jane", "teacher"),
                new Person("Tom", "student"),
                new Person("Emily", "teacher")
        );

        Map<String, List<Person>> groupingByType = people.stream()
                  .collect(Collectors.groupingBy(Person::getType));

        groupingByType.forEach((k, v) -> System.out.println
                                  ("Type: " + k + ": " + v));


    }

}

class Person {
    private String name;
    @Getter
    private String type;

    public Person(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name = '" + name + '\'' +
                ", type = '" + type + '\'' +
                '}';
    }
}



