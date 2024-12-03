package Extra.QuickSortAlgorithm;

public class QuickSort {

    public static int[] quicksort(int[] array) {
        if (array.length < 2) {
            return array;
        }

        int pivot = array[0];
        int[] less = java.util.Arrays.stream(array, 1, array.length)
                .filter(i -> i <= pivot)
                .toArray();
        int[] greater = java.util.Arrays.stream(array, 1, array.length)
                .filter(i -> i > pivot)
                .toArray();

        int[] sortedLess = quicksort(less);
        int[] sortedGreater = quicksort(greater);

        return merge(sortedLess, pivot, sortedGreater);
    }

    private static int[] merge(int[] less, int pivot, int[] greater) {
        int[] result = new int[less.length + 1 + greater.length];
        System.arraycopy(less, 0, result, 0, less.length);
        result[less.length] = pivot;
        System.arraycopy(greater, 0, result, less.length + 1, greater.length);
        return result;
    }

    public static void main(String[] args) {
        int[] unsortedArray = {10, 5, 2, 3};
        int[] sortedArray = quicksort(unsortedArray);

        System.out.print("Sorted array: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

}
