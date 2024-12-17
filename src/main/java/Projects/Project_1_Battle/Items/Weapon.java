package Projects.Project_1_Battle.Items;

public class Weapon {

    private String name;
    private int force;

    public Weapon(){

    }

    public Weapon (String name, int force){
        this.name = name;
        this.force = force;
    }

    public Weapon getRandomWeapon(){
       String[] weapons = {"Fire sword", "Ice sword", "Power sword", "Laser Saber", "Long sword"};
       int i = (int) (Math.random()*(weapons.length-1));
       force = (int) (Math.random()*21);
       name = weapons[i];
       return new Weapon(name, force);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setForce(int force){
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    @Override
    public String toString() {
        return "Weapon: {" +
                "name = '" + name + '\'' +
                ", force = " + force +
                '}';
    }

    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon = weapon.getRandomWeapon();
        System.out.println(weapon);
    }

}

