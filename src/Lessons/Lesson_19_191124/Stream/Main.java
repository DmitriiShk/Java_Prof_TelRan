package Lessons.Lesson_19_191124.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //1st option of Stream generation
        Stream<Integer> stream = Stream.of(1, 2, 3, 5, 6);
        System.out.println("Stream is created");

//        //2nd option of Stream generation
//        List<Integer> list = List.of(1, 2, 3, 5, 6, 7);
//        Stream<Integer> stream1 = list.stream();
//
        Integer[] array = {1, 2, 3, 4, 5, 6};


        Stream<Integer> stream2 = Arrays.stream(array);


        //Intermediate stream operations:
        Stream<Integer> streamAfterFilter = stream.filter(element -> element%2 == 1).limit(3);

        //Terminal operations
        List<Integer> resultList = streamAfterFilter.toList();
        System.out.println(resultList);


    }

}
