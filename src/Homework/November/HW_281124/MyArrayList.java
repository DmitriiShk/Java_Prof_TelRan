package Homework.November.HW_281124;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class MyArrayList<T> implements Iterable<T> {

    private T[] data;

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        data = (T[]) new Object[0]; // Инициализация пустого массива
    }

    @SuppressWarnings("unchecked")
    public MyArrayList(T[] data) {
        this.data = (T[]) Arrays.copyOf(data, data.length);
    }

    public void add(T element) {
        data = Arrays.copyOf(data, data.length + 1);
        data[data.length - 1] = element;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < data.length;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return data[index++];
            }
        };
    }

    public Iterator<T> reverseIterator() {
        return new MyReverseIterator();
    }

    public Iterator<T> randomIterator() {
        return new MyRandomIterator();
    }

    private class MyReverseIterator implements Iterator<T> {
        private int index = data.length - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return data[index--];
        }
    }

    private class MyRandomIterator implements Iterator<T> {
        private final T[] copy;
        private int index = 0;

        @SuppressWarnings("unchecked")
        MyRandomIterator() {
            copy = (T[]) Arrays.copyOf(data, data.length);
            shuffle(copy);
        }

        @Override
        public boolean hasNext() {
            return index < copy.length;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return copy[index++];
        }
    }

    private void shuffle(T[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            swap(array, i, j);
        }
    }

    private void swap(T[] array, int i, int j) {
        if (i != j) {
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

