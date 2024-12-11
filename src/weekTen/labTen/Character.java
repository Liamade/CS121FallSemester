package weekTen.labTen;

public abstract class Character {
    //variables
    public static final int MAX_HEALTH = 100;
    protected String name;
    protected int health;

    public Character(String name, int health){
        this.name = name;
        this.health = Math.min(MAX_HEALTH, health);
    }

    //SETTER
    public void setName(String name) {
        this.name = name;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    //GETTER
    public String getName() {
        return name;
    }
    public int getHealth(){
        return health;
    }
    //METHODS
    public boolean isAlive(){
        if(health <= 0){
            return false;
        }
        else{
            return true;
        }
    }

    public void attack(){

    }





}
