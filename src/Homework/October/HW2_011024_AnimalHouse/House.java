package Homework.October.HW2_011024_AnimalHouse;

public class House {

    public static void main(String[] args) {
        System.out.println();

        var gromozeka = new Robot("Gromozeka", 5, "001", "GR01");
        System.out.println(gromozeka);
        System.out.println("************************************");
        gromozeka.introduce();

        System.out.println();

        var john = new Human("John Snow", 21);
        System.out.println(john);
        System.out.println("************************************");
        john.introduce();

        System.out.println();

        var tom = new Cat("Tom", 3, true);
        System.out.println(tom);
        System.out.println("************************************");
        tom.introduce();

        System.out.println();

        var spike = new Dog("Spike", 5, true);
        System.out.println(spike);
        System.out.println("************************************");
        spike.introduce();

        System.out.println();

        var jerry = new Mouse("Jerry", 2, false);
        System.out.println(jerry);
        System.out.println("************************************");
        jerry.introduce();

        System.out.println();

        john.walkAnAnimal(spike);
        System.out.println();
        gromozeka.walkAnAnimal(tom);
        System.out.println();
        //john.walkAnAnimal(tom, jerry);
        john.play(spike);
        gromozeka.play(john);
        tom.play(spike);
        spike.play(tom);
        tom.play(jerry);
        jerry.play(tom);
        gromozeka.play(john);
        gromozeka.catchMouse(jerry);
        tom.catchMouse(jerry);

    }

}
