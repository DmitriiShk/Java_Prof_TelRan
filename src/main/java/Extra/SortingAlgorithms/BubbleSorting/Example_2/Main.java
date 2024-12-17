package Extra.SortingAlgorithms.BubbleSorting.Example_2;

public class Main {

    public static void main(String[] args) {

        int[] array1 = {64, 42, 73, 31, 53, 16, 57, 42, 74, 55, 36};
        //System.out.println(Arrays.toString(array1));
        printArray(array1);
        System.out.println();

        boolean isSorted = false;

        while(!isSorted) {                         //Буквально условие означает Пока(массив НЕ отсортирован) Делаем{}
            isSorted = true;                       //Считаем, что массив отсортирован.
            for (int i = 1; i < array1.length; i++) {
                int temp;
                if (array1[i] < array1[i - 1]) {
                    temp = array1[i];
                    array1[i] = array1[i - 1];
                    array1[i - 1] = temp;
                    isSorted = false;             //Если в массиве происходит хоть какая-то сортировка, сбрасываем флаг
                                                  //Обратно на false.
                }
            }
        }

        printArray(array1);

    }

    public static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i>0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println("]");
    }


}
