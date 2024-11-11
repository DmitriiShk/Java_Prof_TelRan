package Extra.SearchAlgorithms.BinarySearch.Version1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myList = {1, 3, 5, 7, 9, 12, 14, 18, 21};

        int[] myList1 = {3, 8, 11, 4, 24, 47, 2, 1, 9};



        System.out.println(binarySearch(myList, 21));

    }

    public static String binarySearch(int[] list, int number){
        int start = 0; //индекс первого элемента массива
        int end = list.length-1; //индекс последнего элемента массива

        while(start<=end){
            int mid = (start + end)/2;
            int guess = list[mid];
            if(guess == number){ //Если искомое число находится в середине массива, возвращаем сообщение с указанием индекса.
                return "There is such a number in the array. It is located at the index " + mid;
            }else if(guess > number){ // если искомое число меньше числа, расположенного в середине массива
                end = mid-1;          // убираем правую половину массива, включая среднее число.
            } else { // Если искомое число больше числа, расположенного в середине массива,
                start = mid+1; //Убираем левую часть массива, включая среднее число.
            }
        }
        return "There is no such a number in the array"; //Если искомого числа нет, цикл завершается и выводится сообщение.
    }

}
