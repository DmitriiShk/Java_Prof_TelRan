package Projects.Project_1_Battle.Characters;

import Projects.Project_1_Battle.Items.Protection;
import Projects.Project_1_Battle.Items.Weapon;

public class Superhero extends Character {

    private int force;
    private Weapon weapon;
    private Protection protection;

    public Superhero(){

    }

    public Superhero(String name, int force, Weapon weapon, Protection protection){
        super(name);
        this.force = force;
        this.weapon = weapon;
        this.protection = protection;
    }

    public Superhero getRendomSuperHero(){
        String[] name = {"Iron man", "Thor", "Spider man", "Captain America", "Dr. Strange", "Luke Skywalker", "Master Yoda"};
        int i = (int) (Math.random()*(name.length-1));
        force = (int) (Math.random()*21);
        Weapon weapon = new Weapon();
        Protection protection = new Protection();

        return new Superhero (name[i], force, weapon.getRandomWeapon(), protection.getRandomProtection());
    }

    @Override
    public void introduce(){
        System.out.println("Hello! I'm " + this.getClass().getSimpleName() + ". My name is " + getName());
    }

    @Override
    public int countForce(){
        return force + weapon.getForce();
    };

    @Override
    public int countProtection(){
        return protection.getLevel();
    };


    public void setForce(int force){
        this.force = force;
    }

    public int getForce(){
        return force;
    }

    public void setProtection(Protection protection){
        this.protection = protection;
    }

    public Protection getProtection(){
        return protection;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public Weapon getWeapon(){
        return weapon;
    }

    @Override
    public String toString() {
        return "Hero = '" + getName() + '\'' + " (Health = " + getHealth() + " | Force = " + force
                          + " | " + protection + " | " + weapon + ")";
    }

}


