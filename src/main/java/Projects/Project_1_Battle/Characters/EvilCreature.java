package Projects.Project_1_Battle.Characters;

public class EvilCreature extends Character {

    private int force;
    private int protection;
    private boolean isAngry;

    public EvilCreature() {

    }

    public EvilCreature(String name, int force, int protection) {
        super(name);
        this.force = force;
        this.protection = protection;
    }

    public EvilCreature(String name, int force, int protection, boolean isAngry) {
        super(name);
        this.force = force;
        this.isAngry = isAngry;
        this.protection = protection;
    }

    public EvilCreature getRendomEvilCrature(){
        String[] name = {"Koschey", "Zmey Gorynych", "Green Goblin", "Thanos", "Dart Vader", "Ork", "Troll"};
        int i = (int) (Math.random()*(name.length-1));
        force = (int) (Math.random()*21);
        protection = (int) (Math.random()*11);
        return new EvilCreature (name[i], force, protection, false);
    }

    @Override
    public int countForce() {
        if (isAngry) return force*2;
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

    public int getProtection() {
        return protection;
    }

    public void setProtection(int protection) {
        this.protection = protection;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    @Override
    public String toString(){
        return "Evil creature = '" + getName() + '\'' + " (Health = " + getHealth() + " | Force = " + force
                + " | " + protection + ")";
    }

}
