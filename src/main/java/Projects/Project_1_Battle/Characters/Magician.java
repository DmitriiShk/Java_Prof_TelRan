package Projects.Project_1_Battle.Characters;

import Projects.Project_1_Battle.Skills.HealingSkills;
import Projects.Project_1_Battle.Skills.ReinforcementSkills;

public class Magician extends Projects.Project_1_Battle.Characters.Character implements HealingSkills, ReinforcementSkills {

    private int force;
    private int protection;
    private int level;

    public Magician(String name, int force, int protection, int level) {
        super(name);
        this.force = force;
        this.protection = protection;
        this.level = level;
    }

    @Override
    public int countForce() {
        return force;
    }

    @Override
    public int countProtection() {
        return protection;
    }

    @Override
    public void introduce(){
        System.out.println("Hello! I'm " + this.getClass().getSimpleName() + ". My name is " + getName());
    }

    @Override
    public void heal (Projects.Project_1_Battle.Characters.Character character){
        character.setHealth(100);
    };

    @Override
    public void heal (Projects.Project_1_Battle.Characters.Character[] characters){
        for (Character character : characters){
            heal(character);
        }
    };

    @Override
    public void increaseForce (Superhero hero){
        hero.setForce((int) (hero.getForce() + hero.getForce() * 0.1 + level));
    };

    @Override
    public void increaseForce (Superhero[] heroes){
        for (Superhero hero  : heroes)
            increaseForce(hero);
    };

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString(){
        return "Magician = Name = '" + getName() + '\'' + " (Level = " + level + " | Health = " + getHealth() + " | Force = " + force
                + " | Protection = " + protection + ")";
    }

}
