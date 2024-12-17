package PracticeLessons.Lesson_191124.Task2.Task2_1;

import java.util.List;

public class Task1_11 {

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

    //1. Найти всех людей старше 20 лет и вернуть их имена в списке.
        System.out.println("Names of people older than 20: " + namesOlder20(people));
        System.out.println();

    //2. Найти сумму возрастов всех людей, имя которых начинается с буквы 'A'.
        System.out.println("Total age of people whose names begin with A: " + totalAgeA(people));
        System.out.println();

    //3. Получить список уникальных возрастов людей.
        System.out.println("Unique ages: " + uniqueAgeList(people));
        System.out.println();

    //4. Найти средний возраст людей младше 25 лет.
        System.out.println("Average age of people younger than 25: " + averageAgeBelow25(people) );
        System.out.println();

    //7. Получить список имен всех людей, возраст которых делится на 3
        System.out.println("Names of people whose age can be divided by 3: " + namesBy3(people));
        System.out.println();

    //9. Получить список имен людей, отсортированных в алфавитном порядке.
        System.out.println("Sorted names: " + alphabeticNameList(people));
        System.out.println();

    //10. Найти общую длину всех имен людей, старше 30 лет.
        System.out.println("Total length of names of people older than 30: " + totalNameLengthAbove30(people));
        System.out.println();

    //11. Получить список людей, чьи имена короче 5 символов.
        System.out.println("People whose names' length is below 5: ");
        namesShorter5(people).forEach(System.out::println);

    }

    //1. Найти всех людей старше 20 лет и вернуть их имена в списке.
     public static List<String> namesOlder20(List<Person> people) {
        List<String> list = people.stream().filter(p -> p.getAge()>20)
                           .map(person -> person.getName()).toList();
            return list;
     }

     //2. Найти сумму возрастов всех людей, имя которых начинается с буквы 'A'.
     public static int totalAgeA(List<Person> people) {
         int totalAge = people.stream().filter(p -> p.getName().startsWith("A"))
                        .map(person -> person.getAge()).reduce((x, y) -> x+y).get();
        return totalAge;
     }

     //3. Получить список уникальных возрастов людей.
     public static List<Integer> uniqueAgeList(List<Person> people) {
        List<Integer> list = people.stream().map(person -> person.getAge())
                             .distinct().sorted().toList();
        return list;
     }

     //4. Найти средний возраст людей младше 25 лет.
     public static double averageAgeBelow25(List<Person> people) {
       double averageAge = people.stream().filter(person -> person.getAge() < 25)
                          .mapToInt(Person::getAge).average().orElse(0.0);
       return averageAge;
     }

    //7. Получить список имен всех людей, возраст которых делится на 3
    public static List<String> namesBy3(List<Person> people) {
        List<String> list = people.stream().filter(person -> person.getAge()%3==0)
                           .map(Person::getName).toList();
        return list;
    }

    //9. Получить список имен людей, отсортированных в алфавитном порядке.
    public static List<String> alphabeticNameList(List<Person> people) {
        List<String> list = people.stream().map(Person::getName).sorted().toList();
        return list;
    }

    //10. Найти общую длину всех имен людей, старше 30 лет.
    public static int totalNameLengthAbove30(List<Person> people) {
        int totalNameLength = people.stream().filter(person -> person.getAge()>30)
                             .mapToInt(person -> person.getName().length())
                             .reduce((a, n) -> a+n).orElse(0);
        return totalNameLength;
    }

    //11. Получить список людей, чьи имена короче 5 символов.
    public static List<Person> namesShorter5(List<Person> people) {
        List<Person> list = people.stream().filter(person -> person.getName()
                            .length()<5).toList();
        return list;
        }


}
