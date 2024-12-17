package PracticeLessons.Lesson261124.Tasks.Task3_Comparator;

public class Main {

    public static void main(String[] args) {

        MyNumber myNumber = new MyNumber(15);
        MyNumber myNumber1 = new MyNumber(5);
        MyNumber myNumber2 = new MyNumber(20);
        MyNumber myNumber3 = new MyNumber(10);

        System.out.println(myNumber);


        System.out.println("Number compare to number 1: " + myNumber.compareTo(myNumber1));
        System.out.println("Number 2 compare to number 3: " + myNumber2.compareTo(myNumber3));
        System.out.println("Number 3 compare to number: " + myNumber3.compareTo(myNumber));

        NumberBox<Integer> box1 = new NumberBox<>(10);
        NumberBox<Double> box2 = new NumberBox<>(20.5);

        double result = box1.sum(box2);

        System.out.println("Сумма: " + result);


    }


}
