package Homework.November.HW_071124.Task1_Customer;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Customer customer1 = new Customer("John Smith", "jsmith@gmail.com", "USA", 100, true);
        Customer customer2 = new Customer("James Cooper", "jcooper@gmail.com", "USA", 150, true);
        Customer customer3 = new Customer("Jannis Joplin", "jjopplin@gmail.com", "USA", 200, false);
        Customer customer4 = new Customer("Ozzy Osbourne", "oosbourne@gmail.com", "UK", 350, true);

        //На основе списка экземпляров данного класса List customers
        List<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);

        for(Customer c : customers){
            System.out.println(c);
        }
        System.out.println();

        System.out.println("a. Получить Map email / страна");
        countryByEmail(customers);

        System.out.println("b. Получить Map email / покупатель");
        customersByEmails(customers);

        System.out.println("c. Получить Map isEmailConfirmed / количество подтвержденных и неподтвержденных email");
        emailStatistics(customers);

        System.out.println("d. Получить Map> страна / список покупателей из данной страны");
        customersByCountries(customers);

        System.out.println("e. Получить Map страна/суммарный накопленный бонус покупателей из данной страны");
        totalBonusByCountries(customers);

    }

    private static void totalBonusByCountries(List<Customer> customers) {
        Map<String, Integer> totalBonusByCountry = new HashMap<>();

        for (Customer c : customers){
            String country = c.getCountry();
            int currentBonus = totalBonusByCountry.getOrDefault(country, 0);
            totalBonusByCountry.put(country, currentBonus + c.getBonusAmount());
        }

        for(Map.Entry<String, Integer> entry : totalBonusByCountry.entrySet()){
            System.out.println("Country: " + entry.getKey() + "; Total bonus: " + entry.getValue());
        }
    }

    private static void customersByCountries(List<Customer> customers) {
        Map<String, List<Customer>> customersByCountry = new HashMap<>();

        for (Customer c : customers){
            String country = c.getCountry();//Для чистоты кода создаем переменную country
            customersByCountry.putIfAbsent(country, new ArrayList<>()); //вводим ключ: country и массив значений
            customersByCountry.get(country).add(c); //заполняем массив значениями для каждой конкретной страны-ключа
        }

        for(Map.Entry<String, List<Customer>> entry : customersByCountry.entrySet()){
            System.out.println("Country: " + entry.getKey() + "; Customers: " + entry.getValue());
        }
        System.out.println();
    }

    private static void emailStatistics(List<Customer> customers) {
        Map<Boolean, Integer> emailStatistics = new HashMap<>();

        emailStatistics.put(true, 0); //Вводим первый ключ: true, со значением 0
        emailStatistics.put(false, 0); //Вводим второй ключ: false, со значением 0

        for (Customer customer : customers) {
            boolean isConfirmed = customer.isEmailConfirmed(); //получаем значение is confirmed
            //emailStatistics.put(isConfirmed, emailStatistics.get(isConfirmed) + 1); //проводим подсчет значения
            //второй вариант - через метод getOrDefault:
            emailStatistics.put(isConfirmed, emailStatistics.getOrDefault(isConfirmed, 0)+1);
        }

        for (Map.Entry<Boolean, Integer> entry : emailStatistics.entrySet()){
            System.out.println("Is email confirmed? " + entry.getKey() + "; Value: " + entry.getValue());
        }
        System.out.println();
    }

    private static void customersByEmails(List<Customer> customers) {
        Map<String, String> emailCustomerMap = new HashMap<>();
        for (Customer c : customers){
            emailCustomerMap.put(c.getEmail(), c.getName());
        }

        for (Map.Entry<String, String> entry : emailCustomerMap.entrySet()) {
            System.out.println("Email: " + entry.getKey() + "; Customer: " + entry.getValue());
        }
        System.out.println();
    }

    private static void countryByEmail(List<Customer> customers) {
        
        Map<String, String> emailCountryMap = new HashMap<>();

        for(Customer c : customers){
            emailCountryMap.put(c.getEmail(), c.getCountry());
        }

        for(Map.Entry<String, String> entry : emailCountryMap.entrySet()){
            System.out.println("Email: " + entry.getKey() + "; Country: " + entry.getValue());
        }
        System.out.println();
    }

}
