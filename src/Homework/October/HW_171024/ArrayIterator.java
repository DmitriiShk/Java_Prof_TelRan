package Homework.October.HW_171024;

import java.util.*;

public class ArrayIterator implements Iterator<Integer> {
    private Integer[][] array;
    private int i, j;
    public ArrayIterator(Integer[][] array) {
        this.array = array;
    }
    @Override
    public boolean hasNext() {
        return i < array.length && j < array[i].length;
    }
    @Override
    public Integer next() {
        Integer r = array[i][j++];
        if (j >= array[i].length) {
            i++;
            j = 0;
        }
        return r;
    }
}
