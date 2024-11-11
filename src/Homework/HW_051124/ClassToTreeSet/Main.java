package Homework.HW_051124.ClassToTreeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Customer customer1 = new Customer("Alice", "alice@example.com", 100, true);
        Customer customer2 = new Customer("Bob", "bob@example.com", 150, false);
        Customer customer3 = new Customer("Alice", "alice@example.com", 100, true); // дубликат customer1
        Customer customer4 = new Customer("Charlie", "charlie@example.com", 200, true);

        // Проверка с HashSet
        HashSet<Customer> customerHashSet = new HashSet<>();
        customerHashSet.add(customer1);
        customerHashSet.add(customer2);
        customerHashSet.add(customer3); // дубликат, не должен добавиться
        customerHashSet.add(customer4);

        System.out.println("Содержимое HashSet:");
        for (Customer customer : customerHashSet) {
            System.out.println(customer);
        }

        // Проверка с TreeSet
        TreeSet<Customer> customerTreeSet = new TreeSet<>();
        customerTreeSet.add(customer1);
        customerTreeSet.add(customer2);
        customerTreeSet.add(customer3); // дубликат, не должен добавиться
        customerTreeSet.add(customer4);

        System.out.println("\nСодержимое TreeSet (сортированное):");
        for (Customer customer : customerTreeSet) {
            System.out.println(customer);
        }
    }
}
