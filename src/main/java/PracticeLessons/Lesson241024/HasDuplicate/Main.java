package PracticeLessons.Lesson241024.HasDuplicate;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 2, 1};

        System.out.println(hasDuplicate(array));

    }

    public static boolean hasDuplicate(int[] array){

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if(array[i] == array[i+1]){
                return true;
            }
        }
        return false;
    }

}
