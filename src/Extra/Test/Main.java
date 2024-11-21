package Extra.Test;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Long> list = new ArrayList<>();
        list.add(2L);
        list.add(3L);
        list.add(null);
        list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println(list);


    }




}
