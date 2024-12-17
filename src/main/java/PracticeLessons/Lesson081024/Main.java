package PracticeLessons.Lesson081024;

public class Main {

    public static void main(String[] args) {

        var account_001 = new BankAccount("001", 5000.00, "John Snow", "01.01.1450");
        var account_002 = new BankAccount("002", 10_000.00, "Aria Stark", "01.01.1460");
        var account_003 = new BankAccount("003", 1_000_000.00, "Robert Barateon", "01.01.1420");

        System.out.println(account_001);

        Manager manager1;
        manager1 = account_001;
        Cashier cashier1;
        cashier1 = account_002;
        var client = account_003;

        System.out.println(manager1.getAccountOwner());
        System.out.println(cashier1.getAccountBalance());
        System.out.println(cashier1.setAccountBalance(15000.00));
        System.out.println(client.getAccountBalance());
        System.out.println(client.getAccountOwner());
        System.out.println(client.getDateCreate());

//        System.out.println(client instanceof Client);
//        System.out.println(client instanceof BankAccount);
//        System.out.println(client instanceof Cashier);
//        System.out.println(client instanceof Managable);
        System.out.println(client.getClass());

//        Client client1;
//        System.out.println(client1.getClass()); //this client1 is not initialized at all.
//        System.out.println(client1 instanceof Object); //until and unless we initialize this variable, it does not exist.

    }

}
