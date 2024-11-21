package PracticeLessons.Lesson_141124.PlaceHolder;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(3, 4);
        map.put(5, 6);

        System.out.println(method(map1 -> {
            StringBuilder s = new StringBuilder("");
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                s.append(entry.getKey() + entry.getValue());
            }
            return s.toString();
        }, map));

    }

    public static String method(MapTransformer mapTransformer, Map<Integer, Integer> map) {
        return mapTransformer.transform(map);
    }

}

@FunctionalInterface
interface MapTransformer {
    String transform(Map<Integer, Integer> map);
}

