package PracticeLessons.Lesson261124.Tasks;

/*
    Создайте обобщенный класс Pair, который хранит два объекта,
    возможно, разных типов. Реализуйте методы для установки и получения каждого значения.
 */

public class Task2_Pair <F, S>{

    private F first;
    private S second;

    public Task2_Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

   public void setSecond(S second) {
        this.second = second;
    }

   @Override
   public String toString() {
        return "Pair {" +
                "first = " + first +
                ", second = " + second +
                '}';
    }

    public static void main(String[] args) {

        Task2_Pair<String, Integer> pair = new Task2_Pair<>("Hello", 10);

        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());

        pair.setFirst("World");
        pair.setSecond(20);

        System.out.println(pair);
    }

}
