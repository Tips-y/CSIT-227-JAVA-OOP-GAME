import java.util.Random;

public class EmberWitch extends Character {
    private int health = 75;
    private int defence = 5;
    private int roll;
    private String type = "Mana";

    @Override
    public void setHealth(int health){
        this.health = health;
    }

    @Override
    public int getHealth(int damageTaken){
        return health;
    }

    @Override
    public void setDefence(int defence){
        this.defence = defence;
    }
    @Override
    public int getDefence(int damageTaken){
        return defence;
    }

    @Override
    public void setRolls(int roll){
        this.roll = roll;
    }

    @Override
    public int getRolls(){
        return roll;
    }
    
    @Override
    public void setType(String type) {
      this.type = type;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int takeDamage(int damage){
        return health-=damage;
    }

    public int basicAttack() {
        Random r = new Random();
        return r.nextInt(10); 
    }
    


}
