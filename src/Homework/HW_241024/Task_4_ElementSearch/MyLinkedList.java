package Homework.HW_241024.Task_4_ElementSearch;

public class MyLinkedList {

    Node head;

    void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    int[] findFirstAndLast(int element) {
        int firstIndex = -1;
        int lastIndex = -1;
        Node current = head;
        int index = 0;

        while (current != null) {
            if (current.data == element) {
                if (firstIndex == -1) {
                    firstIndex = index;
                }
                lastIndex = index;
            }
            current = current.next;
            index++;
        }

        return new int[]{firstIndex, lastIndex};
    }
}
