package Homework.October.HW_291024.Task_2_PaymentCards;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    MasterCard masterCard1 = new MasterCard(123);
    MasterCard masterCard2 = new MasterCard(134);
    VisaCard visaCard1 = new VisaCard(212);
    VisaCard visaCard2 = new VisaCard(213);

    Set<PaymentCard> set = new TreeSet<>();
    set.add(masterCard1);
    set.add(masterCard2);
    set.add(visaCard1);
    set.add(visaCard2);

    System.out.println(set);

    }
}
