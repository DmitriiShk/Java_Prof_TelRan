package Lessons.Lesson_6_101024_ClassRelation.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] ints = new int[10];
//        System.out.println(ints.getClass().getName());
//        System.out.println(ints.getClass().getCanonicalName());
//        System.out.println(ints.getClass());
//        System.out.println();
//        Integer[] integers = new Integer[10];
//        System.out.println(integers.getClass().getName());
//        System.out.println(integers.getClass().getCanonicalName());
//        System.out.println(integers.getClass());

        int[] ints = {1, 0, 3, 2, 9};
        int[] sorted = {0, 1, 2, 3, 6, 9};

        boolean isPresent = searchLinear(ints, 2);//Alt+Enter creates a method
        System.out.println(isPresent);

        System.out.print(searchLinear(sorted, 9));
    }

    private static boolean searchLinear(int[] ints, int i) {
        for (int j = 0; j < ints.length; j++) {
            if (i == ints[j]) return true;
        }
        return false;
    }

}
