package PracticeLessons.Lesson_191124.Task2.Task2_1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Task_12_20 {

    public static void main(String[] args) {

        Person person1 = new Person("John", 25, "London", "jlennon@gmail.com", 15500.00);
        Person person2 = new Person("Paul", 25, "London", "pmccartey@gmail.com", 25500.00);
        Person person3 = new Person("George", 30, "London", "gharrisson@gmail.com", 12500.00);
        Person person4 = new Person("Ringo", 20, "London", "rstar@gmail.com", 10500.00);
        Person person5 = new Person("Jannet", 19, "New York", "jjackson@gmail.com", 10000.00);
        Person person6 = new Person("Anna", 18, "Liverpool", "afrank@gmail.com", 7500.00);
        Person person7 = new Person("Jack", 20, "Sindey", "jsparrow@gmail.com", 50500.00);
        Person person8 = new Person("Alexander", 40, "Paris", "ablock@gmail.com", 55000.00);
        Person person9 = new Person("Alexey", 70, "Yasnaya Polyana", "atolstoy@gmail.com", 1_000_000.00);

        List<Person> people = List.of(person1, person2, person3, person4, person5, person6, person7, person8, person9);

    //12. Найти самого взрослого человека.
        System.out.println("The oldest person is: " + oldestPerson(people));
        System.out.println();

    //13. Получить список всех людей, отсортированных по длине имени.
        System.out.println("List of people sorted by name length: ");
        sortedByLength(people).forEach(System.out::println);
        System.out.println();

    //14. Найти имя самого молодого человека.
        System.out.println("The youngest person in the group is: " + youngestPerson(people));
        System.out.println("------------------------------------------");
        System.out.println("The youngest person in the group is: " + youngestPerson2(people));
        System.out.println();

    // 15. Получить список возрастов людей, имена которых заканчиваются на 'n'.
        System.out.println("List of ages of people whose names end with \"n\": " + namesEndWithN(people));
        System.out.println();

    // 16. Найти общий возраст всех людей с уникальными именами.
        System.out.println("Total age of all people with unique names: " + totalAgeUniqueNames(people));
        System.out.println();

        Map<String, Integer> uniqueNamesTotalAge = people.stream().distinct()
                                                   .collect(Collectors.groupingBy(Person::getName,
                                                            Collectors.summingInt(Person::getAge)));

        System.out.println("Map of total age of all people with the same name");
        uniqueNamesTotalAge.forEach((name, age) -> System.out.println("Name " + name + " -> Total age: " + age));
        System.out.println();

    // 17. Получить список имен всех людей, отсортированных в обратном алфавитном порядке.
        System.out.println("List of people in reverse order: " + reverseOrderNames(people));
        System.out.println();

    //18. Найти средний возраст людей, чьи имена состоят из 4 символов.
        System.out.println("Average age of people with names' length = 4: " + averageAgeByName(people));
        System.out.println();

    // 19. Получить список имен людей, возраст которых кратен 5.
        System.out.println("People whose age is is a multiple of 5: " + namesByAgeBy5(people));
        System.out.println();

    // 20. Найти сумму длин всех имен людей, у которых возраст четный.
        System.out.println("Total name length of people with even age: " + evenAgeTotalNameLength(people));
        System.out.println();

    }


    // 12.
    public static Person oldestPerson(List<Person> people) {
       Person oldestPerson = people.stream().max(Comparator
                             .comparingInt(Person::getAge)).get();
       return oldestPerson;
    }

    // 13.
    public static List<Person> sortedByLength(List<Person> people) {
        List<Person> sortedList = people.stream()
                .sorted(Comparator.comparingInt((Person p) -> p.getName()
                .length()).thenComparing(Person::getName)).toList();
        return sortedList;
    }

    // 14.
    //1й вариант:
    public static String youngestPerson(List<Person> people) {
        Person youngestMan = people.stream()
               .min(Comparator.comparingInt(Person::getAge)).get();
        return youngestMan.getName();
    }
    //2й вариант
    public static String youngestPerson2(List<Person> people) {
        Person youngestMan = people.stream()
                             .sorted((p1, p2) -> p1.getAge()-p2.getAge())
                             .findFirst().get();
        return youngestMan.getName();
    }

    // 15.
    public static List<Integer> namesEndWithN(List<Person> people) {
        List<Integer> list = people.stream().filter(p -> p.getName()
                             .endsWith("n")).map(Person::getAge)
                             .sorted().toList();
        return list;
    }

    // 16.
    public static int totalAgeUniqueNames(List<Person> people) {
        int age = people.stream().distinct().map(Person::getAge)
                  .reduce(Integer::sum).orElse(0);
        return age;
    }

    //17.
//    public static List<String> reverseOrderNames(List<Person> people) {
//        List<String> list = people.stream().map(Person::getName)
//                  .sorted((p1, p2) -> p2.compareTo(p1)).toList();
//        return list;
//    }

    //2nd version
    public static List<String> reverseOrderNames(List<Person> people) {
        List<String> list = people.stream().map(Person::getName)
                     .sorted(Comparator.reverseOrder()).toList();
        return list;
    }

    // 18.
    public static double averageAgeByName(List<Person> people) {
        double avAge = people.stream().filter(person -> person.getName()
                            .length() == 4).mapToInt(Person::getAge)
                            .average().orElse(0.0);
        return avAge;
    }

    // 19. Получить список имен людей, возраст которых кратен 5.
    public static List<String> namesByAgeBy5(List<Person> people) {
        List<String> list = people.stream()
                           .filter(person -> person.getAge() % 5 == 0)
                           .map(Person::getName).sorted().toList();
        return list;
    }

    // 20. Найти сумму длин всех имен людей, у которых возраст четный.
    public static int evenAgeTotalNameLength(List<Person> people) {
        int sum = people.stream().filter(person -> person.getAge() % 2 == 0)
                 .mapToInt(person -> person.getName().length()).sum();
        return sum;
    }


}
