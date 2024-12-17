package PracticeLessons.Lesson241024.LinkedList;


public class Main {

    public static void main(String[] args) {

        MyLinkedList ll1 = new MyLinkedList(1);
        MyLinkedList ll2 = new MyLinkedList(0);
        MyLinkedList ll3 = new MyLinkedList(4);
        MyLinkedList ll4 = new MyLinkedList(8);
        MyLinkedList ll5 = new MyLinkedList(12);

        ll1.setNext(ll2);
        ll2.setNext(ll3);
        ll3.setNext(ll4);
        ll4.setNext(ll5);
        //ll5.setNext(ll3);

        System.out.println(ll1.isCycled(ll1));

    }




}
