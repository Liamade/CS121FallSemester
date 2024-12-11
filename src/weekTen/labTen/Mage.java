package weekTen.labTen;

public class Mage extends Character implements Fighter{
    //variables
    private int magicPower;

    public Mage(String name, int health, int magicPower){
        super(name, health);
        this.magicPower = magicPower;
    }

    public void attack(){
        System.out.println(name + " casts fireball!! Magic Power: " + magicPower);
    }
    public void defend(){
        System.out.println(name + " conjures a magical barrier");
    }

}
