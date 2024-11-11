package PracticeLessons.Lesson_071124;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Set<Integer>> map = Map.of("C1", Set.of(1,2,3,4), "C2", Set.of(9,8,7,6));

        System.out.println(map.values());

        int sum = 0;
        // Проходим по всем ключам и значениям в Map
        for(Set<Integer> s : map.values()){
            // Проходим по каждому элементу в Set и суммируем
            for(Integer i : s){
                sum += i;
            }
        }
        // Выводим результат
        System.out.println("Sum of all elements is " + sum);
    }
}
