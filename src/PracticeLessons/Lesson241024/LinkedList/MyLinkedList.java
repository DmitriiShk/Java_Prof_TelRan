package PracticeLessons.Lesson241024.LinkedList;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MyLinkedList {

    private int num;
    private MyLinkedList next;

    public MyLinkedList(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public MyLinkedList getNext() {
        return next;
    }

    public void setNext(MyLinkedList next) {
        this.next = next;
    }

    public boolean isCycled(MyLinkedList head) {
        MyLinkedList slow = head;
        MyLinkedList fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {//Если указатель уперся в null
                return false; //вернут false, т.е список незацикленный.
            }
            slow = slow.next; //Здесь мы переприсваиваем значения slow на следующий
            fast = fast.next.next; //а fast - через следующий узел.
        }
        return true;
    }

}
