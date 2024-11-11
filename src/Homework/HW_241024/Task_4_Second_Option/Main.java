package Homework.HW_241024.Task_4_Second_Option;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        int[] elements = {1, 4, 3, 2, 1, 2, 2, 0};
        for (int element : elements) {
            list.append(element);
        }
    }

}
