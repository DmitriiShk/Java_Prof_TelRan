package Extra.Test_Exercises;

public class Calculator {

    public static void main(String[] args) {

        System.out.println(sum(2, 3));
        System.out.println(evenOrOdd(14));
        System.out.println(divide(5, 0));
    }

    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }

    public static boolean evenOrOdd(int number){
        return number % 2 == 0;
    }

    public static double divide(int a, int b){
        int result = a/b;
        return result;
    }

}
