package Homework.HW_211124;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HW1h {

    public static void main(String[] args) {

        Map<Boolean, List<Integer>> oddValuesMap = getMap();
        oddValuesMap.forEach((key, value) -> System.out.println
                ("Key: " + key + "; List of values: " + value));


    }

//  h)
//    public static Map<Boolean, List<Integer>> getMap() {
//        Map<Boolean, List<Integer>> map = new TreeMap<>();
//        for (int i = 0; i < 100; i++) {
//            if (i % 3 == 0) {
//                if (map.containsKey(true)) {
//                    map.get(true).add(i);
//                } else {
//                    map.put(true, new ArrayList<>());
//                    map.get(true).add(i);
//                }
//            } else {
//                if (map.containsKey(false)) {
//                    map.get(false).add(i);
//                } else {
//                    map.put(false, new ArrayList<>());
//                    map.get(false).add(i);
//                }
//            }
//        }
//        return map;
//    }

    public static Map<Boolean, List<Integer>> getMap() {
        return IntStream.range(0, 100)
                .boxed()
                .collect(Collectors
                .groupingBy(i -> i % 3 == 0,
                 () -> new TreeMap<Boolean, List<Integer>>(), Collectors.toList()));
    }




}
