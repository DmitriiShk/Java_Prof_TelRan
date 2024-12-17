package Extra.SortingAlgorithms.BubbleSorting.Example_3;

import java.util.Arrays;

public class Improved {

    public static void main(String[] args) {

        int[] array2 = {64, 42, 73, 31, 53, 16, 57, 42, 74, 55, 36};
        //System.out.println(Arrays.toString(array2));
        printArray(array2);
        System.out.println();

        for (int i = 0; i < array2.length-1; i++) {     //Внешний цикл
            boolean isSorted = true;                    //Если массив отсортирован, мы не зайдем во внутренний цикл.
            for (int j = 0; j < array2.length-1; j++) { //Внутренний цикл выполняется столько раз, сколько элементов в
                int temp;                               //массиве. Количество элементов в массиве определяется внешним
                if(array2[j]>array2[j+1]){              //циклом.
                    temp = array2[j];
                    array2[j] = array2[j+1];
                    array2[j+1] = temp;

                    isSorted = false;                   //Если мы зашли во внутренний цикл, это означает, что не все
                }                                       //еще отсортировано, т.е. isSorted = false. Если значение isSorted
            }                                           //false, выход из массива выполняться не будет.
            System.out.println("After " + (i+1) + " iteration: " + Arrays.toString(array2));
            if(isSorted) break; //Если isSorted = true (true можно не писать, т.к. по умолчанию установлено значение true),
        }                       //цикл прерывается.

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
