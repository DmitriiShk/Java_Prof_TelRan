package Homework.November.HW_211124;

import java.util.*;
import java.util.stream.*;

public class HW1a_g {

    public static void main(String[] args) {

//1. Переписать через стримы фрагменты кода:
//   a)
        List<Double> doubleList = Arrays.asList(2.1, 7.0, 4.5, 3.0,6.5, 8.3, 9.0);
//
        List<Double> doubles = new ArrayList<>();
//        for (Double d : doubleList) {
//            if (d % 2 == 1) {
//                doubles.add(d);
//            }
//        }
//        doubleList.stream().filter(element -> element % 2 == 1)
//                  .sorted().toList().forEach(doubles::add);
        doubles = doubleList.stream().filter(e -> e % 2 == 1).sorted().collect(Collectors.toCollection(ArrayList::new));

//      .sorted() здесь, конечно, не нужен, добавил исключительно для тренировки и "красоты" вывода.
        System.out.println("Task 1a:");
        System.out.println("Doubles that give 1 after division by 2: " + doubles);

//   b)
        List<String> list = Arrays.asList("Whiskey", "Tequila", "Rum", "Cognac", "Gin", "Vodka");
//
        String word = null;
////        for (String t : list){
////            if (t.length() == 3) {
////                word = t;
////                break;
////            }
////        }
//
        word = list.stream().filter(str ->str.length()==3).findFirst().orElse(null);
        System.out.println("\nTask 1b:");
        System.out.println("The word is: " + word);

//   c)
     List<Integer> integerList = Arrays.asList(1, 2, 5, 8, 4, 3, 6, 7, 10, 9);
     System.out.println("\nTask 1c:");
     System.out.println("Sum of odd elements of the list: " + getSum(integerList));

//   d)
     String[] data = {"apple", "kiwi", "banana", "pineapple", "cherry", "pear"};
     System.out.println("\nTask 1d:");
     System.out.println("Index of the element \"pineapple\" is: " + findIndex(data, "pineapple"));

//   e)
//      double sum = 0.0;
//      for (int i = 0; i < 10_000; i++) {
//          sum += 0.1;
//      }
//     System.out.println("\nsum = " + sum);
//
//     double sum = IntStream.range(0, 10_000).mapToDouble(i -> 0.1).sum();
//     System.out.println("\nTask 1e:");
//     System.out.println("Sum = " + sum);
     //или
     double sum1 = DoubleStream.generate(() -> 0.1).limit(10_000).sum();
      System.out.println("\nSum = " + sum1);

//   f)
        List<Integer> list1 = new ArrayList<>();

        fill(list1, 10);
        System.out.println("\nTask 1f:");
        System.out.println("List: " + list);

//   g)
        Set<String> names = Set.of("Ivan", "Peter", "William", "Mary");
        Set<Integer> integerSet = new TreeSet<>();
//        for (String s : names) {
//            integerSet.add(s.length());
//        }
        //System.out.println(integerSet);

        names.stream().map(String::length).map(integerSet::add).collect(Collectors.toSet());
     //or
     // integerSet = names.stream().map(String::length).collect(Collectors.toCollection(() -> new TreeSet<Integer>()));
        System.out.println("\nTask 1g");
        System.out.println("Integer set: " + integerSet);

    }

//   с)
//    public static int getSum(List<Integer> integers) {
//        int oddSum = 0;
//        for(Integer i: integers) {
//            if(i % 2 != 0) {
//                oddSum += i;
//            }
//        }
//        return oddSum;
//    }

//  c)
    public static int getSum(List<Integer> integers) {
        int oddSum = integers.stream().filter(el -> el % 2 != 0)
                     .reduce(Integer::sum).orElse(0);
        return oddSum;
    }

//   d)
//    public static int findIndex(String[] data, String element) {
//       for (int i = 0; i < data.length; i++) {
//          if (data[i].equals(element)) {
//            return i;
//          }
//       }
//       return -1;
//}

    public static int findIndex(String[] data, String element) {
                    // Генерирует поток индексов от 0 до data.length - 1
        int index = IntStream.range(0, data.length)
                    // Фильтрует индексы, где элемент равен искомому
                    .filter(i -> data[i].equals(element))
                    // Берет первый подходящий индекс
                    .findFirst()
                    // Если ни один индекс не найден, возвращает -1
                    .orElse(-1);
        return index;
    }


//    f)
//    public static void fill(List<Integer> list, int capacity) {
//        for (int i = 0; i < capacity; i++) {
//            list.add(i);
//        }
//    }

    public static void fill(List<Integer> list, int capacity) {
     list.addAll(IntStream.range(1, capacity+1).boxed().toList());
    }

}
