package PracticeLessons.Lesson051124.Task1;

import java.util.Objects;

public class Person implements Comparable<Person>{

    private String name;
    private int age;
    private String surname;
    private char sex;
    private int id;
    private String email;
    Address address;

    public Person(String name, int age, String surname, char sex, int id, String email, Address address) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.sex = sex;
        this.id = id;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public char getSex() {
        return sex;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&  Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && age == person.age && sex == person.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, surname, sex, id);
    }

    @Override
    public String toString() {
        return "Person {" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", surname = '" + surname + '\'' +
                ", sex = " + sex +
                ", id = " + id +
                ", email = '" + email + '\'' +
                ", address = " + address +
                '}';
    }

    @Override
    public int compareTo(Person another) {
        int result = this.id - another.id;
        if(result == 0) result = this.name.compareTo(another.name);
        if(result == 0) result = this.surname.compareTo(another.surname);
        if(result == 0) result = this.age - another.age;
        if(result == 0) result = this.sex - another.sex;
        return result;
    }
}
