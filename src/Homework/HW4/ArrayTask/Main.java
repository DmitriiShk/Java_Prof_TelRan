package Homework.HW4.ArrayTask;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        int[][] array = new int[4][3];

        int[][] matrix = generateMatrix(4, 3);
        System.out.println(Arrays.deepToString(matrix));

//        diagonalFromFirstRowLR(array);
//        System.out.println();
//        diagonalFromSecondRowLR(array);
//
//        diagonalFromFirstRowRL(array);
//        System.out.println();
//        diagonalFromSecondRowRL(array);

    }
    //Пропустил условие задания - создание двухмерной матрицы.
    public static int[][] generateMatrix (int n, int m){
        int min = Math.min(n, m);
        int j = 0;
        int[][] matrix = new int[n][m];
        for (int i = n - 1; i > n - min; i--){
            matrix[i][j++] = 1;
        }
        return matrix;
    }

    private static void diagonalFromFirstRowLR(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j)
                    array[i][j] = 1;
                else
                    array[i][j] = 0;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void diagonalFromSecondRowLR(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j+1)
                    array[i][j] = 1;
                else
                    array[i][j] = 0;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void diagonalFromSecondRowRL(int[][] array){
        for(int i = array.length-1; i>=0; i--){
            for(int j = 0; j <array[i].length; j++){
                if (i == j) array[i][j] = 1;
                else array[i][j] = 0;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }



    private static void diagonalFromFirstRowRL(int[][] array){
        for(int i = array.length-1; i>=0; i--){
            for(int j = 0; j <array[i].length; j++){
                if (i == j+1) array[i][j] = 1;
                else array[i][j] = 0;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
