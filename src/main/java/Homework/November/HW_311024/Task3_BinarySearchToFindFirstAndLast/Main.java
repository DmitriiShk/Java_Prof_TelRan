package Homework.November.HW_311024.Task3_BinarySearchToFindFirstAndLast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 2, 2, 3, 4, 5);

        int target = 3;
        int firstIndex = findFirstOccurrence(list, target);
        int lastIndex = findLastOccurrence(list, target);

       System.out.println("First occurrence of " + target + ": " + firstIndex);
       System.out.println("Last occurrence of " + target + ": " + lastIndex);



    }

    public static int findFirstOccurrence(List<Integer> list, int target) {
        int low = 0;
        int high = list.size() - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) == target) {
                result = mid;
                high = mid - 1; // продолжаем искать в левой половине
            } else if (list.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static int findLastOccurrence(List<Integer> list, int target) {
        int low = 0;
        int high = list.size() - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (list.get(mid) == target) {
                result = mid;
                low = mid + 1; // продолжаем искать в правой половине
            } else if (list.get(mid) < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
