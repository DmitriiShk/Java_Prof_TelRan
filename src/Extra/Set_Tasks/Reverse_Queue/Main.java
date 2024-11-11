package Extra.Set_Tasks.Reverse_Queue;

import java.util.*;

public class Main {

    public static void main(String[] args) {

       // 2. Имеется очередь Queue<String>. Написать метод, возвращающий очередь Queue<String>,
       //    в которой элементы расположены в обратном порядке.

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);

        System.out.println(queue);

        System.out.println(reverseQueue(queue));

    }

    public static Queue<Integer> reverseQueue(Queue<Integer> queue){

        ArrayDeque<Integer> list = new ArrayDeque<>(queue.size());
        while(!queue.isEmpty()){
            int element = queue.remove();
            list.addFirst(element);
        }
        return list;
    }
}
