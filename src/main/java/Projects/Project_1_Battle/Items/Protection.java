package Projects.Project_1_Battle.Items;

public class Protection {

    private String name;
    private int level;

    public Protection(){

    }

    public Protection (String name, int level){
        this.name = name;
        this.level = level;
    }

    public Protection getRandomProtection(){
        String[] protections = {"Metal armour", "Leather shield", "Chain armour", "Dynamic armour", "Power field"};
        int i = (int) (Math.random()*protections.length-1);
        int protectionLevel = (int) (Math.random()*20);

        return new Protection(protections[i], protectionLevel);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public int getLevel(){
        return level;
    }

    @Override
    public String toString() {
        return "Protection: {" +
                "name = '" + name + '\'' +
                ", level = " + level +
                '}';
    }


}

