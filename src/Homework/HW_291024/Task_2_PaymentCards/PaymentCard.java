package Homework.HW_291024.Task_2_PaymentCards;

public abstract class PaymentCard implements Comparable<PaymentCard> {

    //Нереализованный метод
    public abstract int getID();

    @Override
    public int compareTo(PaymentCard another) {
        return Integer.compare(this.getID(), another.getID());
    }

}
