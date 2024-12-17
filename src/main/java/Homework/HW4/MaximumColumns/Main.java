package Homework.HW4.MaximumColumns;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array = {{25, 15, 19, 8}, {19, 32, 40, 45}};

        System.out.println(arrayColumnMaximum(array));

    }

    public static String arrayColumnMaximum(int[][] array){
        int max = array[0][0];
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) max = array[i][j];
            }
            newArray[i] = max;
        }
        return Arrays.toString(newArray);
    }
//    Правильное решение
//    public static int[] getMaxArray(int[][] array){
//        int[] maxArray = new int[array[0].length]
//        for (int j = 0; j < array[0].length; j++){
//            int max = array[0][j];
//            for (int i = 0; i< array.length; i++){
//                max = Math.max(max, array[i][j]);
//            }
//            maxArray[j] = max;
//        }
//        return maxArray;
//    }

}
