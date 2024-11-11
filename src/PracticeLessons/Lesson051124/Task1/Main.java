package PracticeLessons.Lesson051124.Task1;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Address address1 = new Address(1, "Main", 1, 00001);

        Person person1 = new Person("John", 20, "Snow", 'm', 1, "jsnow@winterfell.com", address1);
        Person person2 = new Person("Aria", 17, "Stark", 'f', 3, "astark@winterfell.com", address1);

        List<Person> persons = new LinkedList<>();

        persons.add(person1);
        persons.add(person2);

        System.out.println(persons);






    }

    public static List<Person> generateList(List<Person> list, int age){

        List<Person> youngPersons = new LinkedList<>();
        for(Person p : list){
            if(p.getAge() > age){
                youngPersons.add(p);
            }
        }
        return youngPersons;
    }

}
