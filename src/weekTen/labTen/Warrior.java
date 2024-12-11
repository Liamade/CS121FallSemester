package weekTen.labTen;

public class Warrior extends Character implements Fighter {
    //variables
    private int strength;

    public Warrior(String name, int health, int strength){
        super(name, health);
        this.strength = strength;
    }

    public void attack(){
        System.out.println(name + " slashes with his sword!! Strength: " + strength);
    }
    public void defend(){
        System.out.println(name + " raises his shield to block the attack");
    }


    //SETTER
    public void setStrength(int strength){
        this.strength = strength;
    }

    //GETTER
    public int getStrength(){
        return strength;
    }
}
