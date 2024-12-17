package Lessons.Lesson_6_101024_ClassRelation.Task;

import java.util.Arrays;

public class Transpose {

    public static void main(String[] args) {


        int[][] initialMatrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 0, 0, 0}};
        System.out.println("Initial matrix: " + Arrays.deepToString(initialMatrix));

        matrixTranspose(initialMatrix);


    }

    private static void matrixTranspose(int[][] initialMatrix) {
        int rows = initialMatrix.length;
        int columns = initialMatrix[0].length;

        int[][] transposedMatrix = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++){
                transposedMatrix[j][i] = initialMatrix[i][j];
            }
        }

        System.out.println("Transposed matrix: " + Arrays.deepToString(transposedMatrix));
    }

}
