package Lessons.Lesson_10_181024.Tasks.Task_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.*;

public class Box implements Iterable<String> {

    private String itemA;
    private String itemB;
    private String itemC;


    public Box(String itemA, String itemB, String itemC) {
        this.itemA = itemA;
        this.itemB = itemB;
        this.itemC = itemC;
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    public String getItemA() {
        return itemA;
    }

    public void setItemA(String itemA) {
        this.itemA = itemA;
    }

    public String getItemB() {
        return itemB;
    }

    public void setItemB(String itemB) {
        this.itemB = itemB;
    }

    public String getItemC() {
        return itemC;
    }

    public void setItemC(String itemC) {
        this.itemC = itemC;
    }

    public class MyIterator implements Iterator<String> {

        public int count = 0;

        @Override
        public boolean hasNext() {
            return count < 3;
        }

        @Override
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            if (count == 0) {
                count++;
                return getItemA();
            } else if (count == 2) {
                count++;
                return getItemB();
            } else {
                return getItemC();
            }

        }
    }
}

