package Projects.Project_1_Battle.Events;

import Projects.Project_1_Battle.Characters.EvilCreature;
import Projects.Project_1_Battle.Characters.Magician;

public class Battle {

    public static void main(String[] args) {

        Magician magician = new Magician("Gendalf", 20, 10, 3);
        magician.introduce();
        System.out.println(magician);

        EvilCreature evilCreature = new EvilCreature();
        evilCreature = evilCreature.getRendomEvilCrature();
        System.out.println(evilCreature);
        evilCreature.introduce();
        magician.fight(evilCreature);
        System.out.println();
        System.out.println("-----------------");
        System.out.println("After the fight: ");
        System.out.println(magician);
        System.out.println(evilCreature);


        //Weapon sword = new Weapon("Sword", 15);                                   //New instance of Weapon created with certain parameters
//        Weapon randomWeapon = new Weapon();                                       //New instance for random selection created
//        randomWeapon = randomWeapon.getRandomWeapon();                            //New instance initialized with random selection method
//        Protection armour = new Protection("Armour", 4);                          //New instance of protection created with certain parameters
//        //Superhero spiderman = new Superhero("Spiderman", 2, sword, armour);     //New instance of superhero created with certain parameters
//        Superhero ironman = new Superhero("Iron man", 5, randomWeapon, armour);
//        //EvilCreature zombie = new EvilCreature("Zombie", 5, 1);
//        EvilCreature randomEvilCreature = new EvilCreature();
//        randomEvilCreature = randomEvilCreature.getRendomEvilCreature();
//
//
//        //spiderman.introduce();
//        ironman.introduce();
//        randomEvilCreature.introduce();
//        System.out.println();
//        System.out.println(ironman);
//
//
//        //spiderman.fight(zombie); // method on the object call
////  zombie.fight(spiderman);
////  Util.fight(spiderman, zombie); //Static method in Util class
//
//        ironman.fight(randomEvilCreature);
//
//        System.out.println("After fight: ");
////        System.out.println(spiderman);
////        System.out.println(zombie);
//
//        System.out.println(ironman);
//        System.out.println(randomEvilCreature);


//        Superhero superhero = new Superhero();
//        superhero = superhero.getRendomSuperHero();
//        EvilCreature evilCreature = new EvilCreature();
//        //evilCreature = evilCreature.getRendomEvilCreature();
//
//
//        System.out.println();
//        System.out.println(superhero);
//        System.out.println(evilCreature);
//        superhero.introduce();
//        evilCreature.introduce();
//        System.out.println();
//        superhero.fight(evilCreature);
//        System.out.println();
//        System.out.println("After the battle: ");
//        System.out.println(superhero);
//        System.out.println(evilCreature);

    }

}
