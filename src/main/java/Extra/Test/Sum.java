package Extra.Test;

import java.util.Arrays;

public class Sum {

    public static void main(String[] args) {
        int[] array = {2, 4, 8};

        int[] array1 = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }

        int sum1 = Arrays.stream(array).sum();

        System.out.println(sum);
        System.out.println(sum1);
        System.out.println("--------------");
        arrayElementsSum(array1);

        System.out.println("Sum of array elements = " + arraySum(array1, 0));

        System.out.println("\nMaximum element of the array: " + maxElement(array1));

    }

    public static void arrayElementsSum(int[] array){
        System.out.println("Sum of the array elements = " + Arrays.stream(array).sum());
    }

    public static int arraySum(int[] array, int index) {
        // Базовый случай: если достигли конца массива
        if (index == array.length) {
            return 0;
        }
        System.out.println("Array element: " + array[index]);
        // Рекурсивно добавляем текущий элемент
        return array[index] + arraySum(array, index + 1);
    }
        /*
           Развертывание спирали:
        1) 1+
        2) 2+
        3) 3+
        4) 4+
        5) 5+
        Базовый случай: индекс = длинне массива, возвращается 0.
        происходит скручивание спирали: 5+4+3+2+1 = 15.
         */

//    public static int maxElement(int[]arr){
//        int max = arr[0];
//        for(int i = 0; i<arr.length; i++){
//            if(arr[i]>max) max = arr[i];
//        }
//        return max;
//    }

    public static int maxElement(int[]arr){
        int max = Arrays.stream(arr).max().orElse(0);
    return max;
    }



}
