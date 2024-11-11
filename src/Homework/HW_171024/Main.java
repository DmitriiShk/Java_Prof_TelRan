package Homework.HW_171024;

public class Main {

    public static void main(String[] args) {
        Integer[][] array = new Integer[][]{{1}, {2,3,4,5,},{6,7},{8,9,10,11,12,}};
        ArrayIterator i = new ArrayIterator(array);

        while (i.hasNext()){
            System.out.print(i.next() + " ");
        }
    }

}
