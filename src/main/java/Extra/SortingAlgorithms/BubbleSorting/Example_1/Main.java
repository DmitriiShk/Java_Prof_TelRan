package Extra.SortingAlgorithms.BubbleSorting.Example_1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 3, 5, 4, 2, 0, 7, 6};
        System.out.println(Arrays.toString(array));

        System.out.println();

        bubbleSort(array);
        System.out.println(Arrays.toString(array));


    }
    //Сложность пузырьковой сортировки О(n2) - очень медленная, но, в то же время, очень простая сортировка.
    public static void bubbleSort(int[] array){

        boolean sorted = false;  //Создаем флаг "отсортированный" и установим ему значение = "false" - "не отсортирован"

        while(!sorted){          //Цикл будет повторяться пока в массиве будет хотя бы одна сортировка. Если на последней итерации
            sorted = true;       //сортировка не произошла, мы выходим из цикла. Это означает, что массив был полностью отсортирован.
            for (int i = 1; i < array.length; i++) { //Итерацию начинаем со второго элемента с индексом 1.
                int previous = array[i-1]; //Первый элемент сравнения по индексу 0
                int current = array[i];    //Второй элемент сравнения по индексу 1
                if(previous > current){    //Проводим проверку. Если 1й элемент больше 2го, мы должны поменять их местами.
                    swap(array, i-1, i);
                    sorted = false; //Если мы обнаруживаем ситуацию, что предыдущий элемент больше чем текущий, мы сбрасываем
                }                   //флаг "сортед", что означает, что массив еще не отсортирован. Если во внутреннем цикле
             }                      //такая ситуация не обнаружилась, сохранится значение "true", что значит, что массив
        }                           //полностью отсортирован и мы выходим из внешнего цикла.
    }

    public static void swap(int[] array, int index1, int index2){ //Здесь указываем массив и индексы элементов
        int temp = array[index1];   //Здесь уже указываем элементы соответствующих индексов: 1й элемент помещаем в темп
        array[index1] = array[index2]; //Присваиваем 1му элементу значение 2го элемента
        array[index2]  = temp;         //2му элементу присваиваем значение 1го элемента, помещенного в темп.
    }




}
