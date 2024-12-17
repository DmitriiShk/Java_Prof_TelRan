package Homework.November.HW_051124.ClassToTreeSet;

import java.util.Objects;

public class Customer implements Comparable<Customer> {
    private String name;
    private String email;
    private int bonusAmount;
    private boolean isEmailConfirmed;

    public Customer(String name, String email, int bonusAmount, boolean isEmailConfirmed) {
        this.name = name;
        this.email = email;
        this.bonusAmount = bonusAmount;
        this.isEmailConfirmed = isEmailConfirmed;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getBonusAmount() {
        return bonusAmount;
    }

    public boolean isEmailConfirmed() {
        return isEmailConfirmed;
    }

    // Переопределяем метод equals для корректного сравнения
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return bonusAmount == customer.bonusAmount &&
                isEmailConfirmed == customer.isEmailConfirmed &&
                Objects.equals(name, customer.name) &&
                Objects.equals(email, customer.email);
    }

    // Переопределяем метод hashCode для корректного добавления в HashSet
    @Override
    public int hashCode() {
        return Objects.hash(name, email, bonusAmount, isEmailConfirmed);
    }

    // Реализуем метод compareTo для сортировки в TreeSet
    @Override
    public int compareTo(Customer other) {
        // Сначала сравниваем по имени
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) return nameComparison;

        // Если имена одинаковы, сравниваем по email
        int emailComparison = this.email.compareTo(other.email);
        if (emailComparison != 0) return emailComparison;

        // Если email тоже одинаков, сравниваем по количеству бонусов
        int bonusComparison = Integer.compare(this.bonusAmount, other.bonusAmount);
        if (bonusComparison != 0) return bonusComparison;

        // Если бонусы тоже одинаковы, сравниваем по статусу подтверждения email
        return Boolean.compare(this.isEmailConfirmed, other.isEmailConfirmed);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", bonusAmount=" + bonusAmount +
                ", isEmailConfirmed=" + isEmailConfirmed +
                '}';
    }
}
