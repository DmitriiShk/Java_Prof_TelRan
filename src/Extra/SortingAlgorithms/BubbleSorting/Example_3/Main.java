package Extra.SortingAlgorithms.BubbleSorting.Example_3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array2 = {64, 42, 73, 31, 53, 16, 57, 42, 74, 55, 36};
        //System.out.println(Arrays.toString(array2));
        printArray(array2);
        System.out.println();

        for (int i = 0; i < array2.length-1; i++) {
            for (int j = 0; j < array2.length-1; j++) { //Внутренний цикл выполняется столько раз, сколько элементов в
                int temp;                               //массиве. Количество элементов в массиве определяется внешним
                if(array2[j]>array2[j+1]){              //циклом.
                    temp = array2[j];
                    array2[j] = array2[j+1];
                    array2[j+1] = temp;
                }
            }
            System.out.println("After " + (i+1) + " iteration: " + Arrays.toString(array2));
        }
        System.out.println();

        System.out.println("Array after sorting: " + Arrays.toString(array2));

    }

    public static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print (", ");
            }
        }
        System.out.println("]");
    }

}
