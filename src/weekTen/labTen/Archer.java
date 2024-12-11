package weekTen.labTen;

public class Archer extends Character implements Fighter{
    //variables
    private int agility;

    public Archer(String name, int health, int agility){
        super(name, health);
        this.agility = agility;
    }

    public void attack(){
        System.out.println(name + " shoots his bow!! Agility: " + agility);
    }
    public void defend(){
        System.out.println(name +  "swiftly dodges the attack");
    }

}
