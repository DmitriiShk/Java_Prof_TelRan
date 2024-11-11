package Homework.HW_241024.Task_4_Second_Option;

import Homework.HW_241024.Task_4_ElementSearch.Node;

public class MyLinkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        //Первоначальный узел
        Node(int value){
            data = value;
            next = null;
        }
    }
    //Метод для добавления элементов в связанный список
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


    //Метод для поиска первого и последнего вхождения элемента
    public int[] findFirstAndLastIndex(int element){
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        //Текущий узел изначально равен первому узлу списка.
        Node current = head;
        int index = 0;

        while (current != null){
            if (current.data == element){
                if(result[0] == -1){
                    result[0] = index; //Записываем индекс первого вхождения
                }
                result[1] = index; //Обновляем индекс последнего вхождения
            }
            index++;
            current = current.next;
        }

        return result;
    }

}
