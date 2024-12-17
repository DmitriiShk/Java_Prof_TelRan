package PracticeLessons.Lesson_191124.Task2.Task2_1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task_21_27 {

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

        // 21. Группировать людей по городу и находить максимальный возраст в каждой группе.
        peopleByCityMaxAge(people)
        .forEach((city, maxAge) -> System.out.println("City: " + city +
                              ", Max Age: " + maxAge.orElse(-1)));
        System.out.println();

        // 22. Получить список людей, у которых зарплата больше 50000, отсортированных по убыванию зарплаты.
        System.out.println("People with salary less than 50000: ");
        sortedSalary(people).forEach(person -> System.out.println(person.getName() +
                                     " - Salary: " + person.getSalary()));
        System.out.println();

        // 23. Найти город с наибольшим количеством людей старше 30 лет.
        System.out.println(cityOlder30(people));
        System.out.println();

        // 24. Группировать людей по первой букве имени и находить среднюю зарплату в каждой группе.
        firstLetterAverageSalary(people).forEach((name, avSalary) ->
                                System.out.println("Fist letter: " + name +
                                " -> Average salary: " + avSalary));
        System.out.println();

        // 25. Найти человека с самой длинной электронной почтой в каждом городе.
        longestEmail(people).forEach((city, person) -> System.out.println("City: " + city + ", Person: " +
                           person.map(p -> p.getName() + " (" + p.getEmail() + ")").orElse("None")));
        System.out.println();

        // 27. Получить список имен людей с зарплатой больше 10,000 и возрастом меньше 30, отсортированных по возрасту.
        System.out.println("Names of people younger than 30 with salary greater than 10000: " + namesList(people));

    }

    // 21. Группировать людей по городу и находить максимальный возраст в каждой группе.
    public static Map<String, Optional<Integer>> peopleByCityMaxAge(List<Person> people) {
        Map<String, Optional<Integer>> map = people.stream().collect(Collectors
               .groupingBy(Person::getCity, // Группируем по городу
                Collectors.mapping(Person::getAge, // Извлекаем возраст
                Collectors.maxBy(Comparator.naturalOrder()) // Находим максимальный возраст
                )));
        return map;
    }

    // 22. Получить список людей, у которых зарплата меньше 50000, отсортированных
    //     по убыванию зарплаты.
    public static List<Person> sortedSalary(List<Person> people) {
        List<Person> list = people.stream().filter(person -> person
                        .getSalary() < 50000).sorted((p1, p2) -> Double
                        .compare(p2.getSalary(), p1.getSalary())).toList();
        //or
//        people.stream().filter(person -> person.getSalary()<50000)
//                .sorted(Comparator.comparingDouble(Person::getSalary)
//                .reversed()).toList();
        return list;
    }

    // 23. Найти город с наибольшим количеством людей старше 30 лет.
    public static String cityOlder30(List<Person> people) {
        String s = people.stream().filter(person -> person.getAge() > 30)
                   .collect(Collectors.groupingBy(Person::getCity, Collectors.counting()))
                   // Находим город с максимальным количеством людей
                   .entrySet().stream().max(Map.Entry.comparingByValue())
                   .map(Map.Entry::getKey) // Берём название города
                   .orElse("Нет людей старше 30 лет");
        return s;
    }

    // 24. Группировать людей по первой букве имени и находить среднюю зарплату в каждой группе.
    public static Map<Character, Double> firstLetterAverageSalary(List<Person> people) {
        Map<Character, Double> map = people.stream().collect(Collectors
                       // Группируем по первой букве имени
                       .groupingBy(person -> person.getName().charAt(0),
                       // Находим среднюю зарплату в группе
                       Collectors.averagingDouble(Person::getSalary)));
        return map;
    }

    // 25. Найти человека с самой длинной электронной почтой в каждом городе.
    public static Map<String, Optional<Person>> longestEmail(List<Person> people) {
        Map<String, Optional<Person>> map = people.stream().collect(Collectors
                // Группируем по городу
                .groupingBy(Person::getCity, Collectors.maxBy(Comparator
                // Находим человека с самой длинной почтой
                .comparingInt(p -> p.getEmail().length()))));
        return map;
    }

    // 27. Получить список имен людей с зарплатой больше 10,000 и возрастом
    //     меньше 30, отсортированных по возрасту.
    public static List<String> namesList(List<Person> people) {
//        List<String> list = people.stream().filter(person ->
//                     person.getSalary() > 10000 && person.getAge() < 30)
//                     .sorted((p1, p2) -> p1.getAge() - p2.getAge())
//                     .map(person -> person.getName()).toList();
//        return list;

        //or
        return people.stream()
                // Фильтруем людей с зарплатой больше 10,000
                .filter(person -> person.getSalary() > 10000)
                // И возрастом меньше 30
                .filter(person -> person.getAge() < 30)
                // Сортируем по возрасту
                .sorted(Comparator.comparingInt(Person::getAge))
                .map(Person::getName) // Извлекаем имена
                .collect(Collectors.toList()); // Собираем в список

    }


}
