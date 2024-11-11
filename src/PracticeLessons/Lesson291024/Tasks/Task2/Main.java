package PracticeLessons.Lesson291024.Tasks.Task2;


//1. Реализовать собственный метод сортировки списка Book через компаратор. Проверить, является ли сортировка устойчивой
//2. Реализовать метод бинарного поиска по списку строковых данных



public class Main {

   public static void main(String[] args) {

   int[] myList = {1, 3, 5, 7, 9, 11, 15};

        binarySearch(myList, 11);

   }

   public static String binarySearch(int[] list, int item){

          int start = 0;
          int end = list.length-1;
          int middle = (start + end)/2;
          int guess = list[middle];

          while(start<=end){
               if(guess == item){
                  return "There is this item in the list. Its index is " + middle;
               } else if(item<guess){
                    end = middle-1;
               } else{
                   start = middle+1;
               }
            }
            return "There is no such an item in the list";
          }


}
