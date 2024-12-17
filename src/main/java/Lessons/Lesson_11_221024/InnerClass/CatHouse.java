package Lessons.Lesson_11_221024.InnerClass;

public class CatHouse {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Mashka");
        System.out.println(cat1);

        Cat.Kitten kitten1 = cat1.new Kitten("Glashka");
        Cat.Kitten kitten2 = cat1.new Kitten("Pashka");

        System.out.println(kitten1);
        System.out.println(kitten2);


    }




}
