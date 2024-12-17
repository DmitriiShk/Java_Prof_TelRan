package PracticeLessons.Lesson081024;

import java.util.Objects;

public class BankAccount implements Manager, Cashier, Client{

    private String accountNumber;
    private double accountBalance;
    private String accountOwner;
    private String dateCreate;

    public BankAccount(String accountNumber, double accountBalance, String accountOwner, String dateCreate) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountOwner = accountOwner;
        this.dateCreate = dateCreate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(accountBalance, that.accountBalance) == 0 && Objects.equals(accountNumber,
                               that.accountNumber) && Objects.equals(accountOwner, that.accountOwner)
                               && Objects.equals(dateCreate, that.dateCreate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountBalance, accountOwner, dateCreate);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", accountOwner='" + accountOwner + '\'' +
                ", dateCreate='" + dateCreate + '\'' +
                '}';
    }
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public double getAccountBalance() {
        return accountBalance;
    }

    @Override
    public double setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
        return accountBalance;
    }

    @Override
    public String getAccountOwner() {
        return accountOwner;
    }

    @Override
    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    @Override
    public String getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(String dateCreate) {
        this.dateCreate = dateCreate;
    }

}
