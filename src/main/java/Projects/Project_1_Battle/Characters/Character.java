package Projects.Project_1_Battle.Characters;

public abstract class Character {

    private String name;
    private int health = 100;

    public Character(){

    }

    public Character(String name){
        this.name=name;
    }

    public void introduce(){
        System.out.println("Hello! I'm " + this.getClass().getSimpleName() + ". My name is " + name);
    }

    public abstract int countForce();

    public abstract int countProtection();

    public final void fight(Character another){
        System.out.println(this.getName() + " fights with " + another.getName());
        int myForce = countForce();
        int anotherForce = another.countForce();
        if (myForce < anotherForce) {
            System.out.println(another.getName() + " wins");
            this.health = this.health - (anotherForce - myForce) / countProtection(); // Logic isn't clear. Figure it out.
        } else if (myForce > anotherForce){
            System.out.println(this.getName() + " wins");
            another.health = another.health - (myForce - anotherForce) / countProtection();
        } else {
            System.out.println("No one wins. Powers are equal");
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
