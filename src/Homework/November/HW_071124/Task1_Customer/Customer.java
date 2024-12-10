package Homework.November.HW_071124.Task1_Customer;

import java.util.Objects;

public class Customer {

    private String name;
    private String email;
    private String country;
    private int bonusAmount;
    private boolean isEmailConfirmed;

    public Customer(String name, String email, String country, int bonusAmount, boolean isEmailConfirmed) {
        this.name = name;
        this.email = email;
        this.country = country;
        this.bonusAmount = bonusAmount;
        this.isEmailConfirmed = isEmailConfirmed;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

    public int getBonusAmount() {
        return bonusAmount;
    }

    public boolean isEmailConfirmed() {
        return isEmailConfirmed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return bonusAmount == customer.bonusAmount && isEmailConfirmed == customer.isEmailConfirmed && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(country, customer.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, country, bonusAmount, isEmailConfirmed);
    }

    @Override
    public String toString() {
        return "Customer {" +
                "name = '" + name + '\'' +
                ", email = '" + email + '\'' +
                ", country = '" + country + '\'' +
                ", bonusAmount = " + bonusAmount +
                ", isEmailConfirmed = " + isEmailConfirmed +
                '}';
    }
}
