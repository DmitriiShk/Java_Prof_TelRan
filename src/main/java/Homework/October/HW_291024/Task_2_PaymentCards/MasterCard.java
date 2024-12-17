package Homework.October.HW_291024.Task_2_PaymentCards;

public class MasterCard extends PaymentCard {

private int masterID;

    public MasterCard(int masterID) {
        this.masterID = masterID;
    }

    @Override
    public int getID() {
        return masterID;
    }

    @Override
    public String toString() {
        return "Master card {" +
                "ID = " + masterID +
                '}';
    }


}
