package Homework.October.HW_291024.Task_2_PaymentCards;

public class VisaCard extends PaymentCard{

    private int visaID;

    public VisaCard(int visaID) {
        this.visaID = visaID;
    }

    @Override
    public int getID() {
        return visaID;
    }

    @Override
    public String toString() {
        return "Visa card {" +
                "ID = " + visaID +
                '}';
    }
}
