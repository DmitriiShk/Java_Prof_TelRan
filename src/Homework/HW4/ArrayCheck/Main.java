package Homework.HW4.ArrayCheck;

public class Main {

    public static void main(String[] args) {

        int[] array = {15, 10, 8, 4, 7};
        int[] array1 = {4, 7, 8, 10, 15};
        System.out.println("is array sorted? " + isSorted(array));
        System.out.println("is array 1 sorted? " + isSorted(array1));

    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length-1; i++) {// -1 чтобы не вылететь за пределы массива, т.к. идет сравнение с соседним элементом.
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }

}
