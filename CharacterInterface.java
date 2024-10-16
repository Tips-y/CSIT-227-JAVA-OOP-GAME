public interface CharacterInterface{
    public void setHealth(int health);
    public int getHealth(int damageTaken);
    public int damage();
    public void setDefence(int defence);
    public int getDefence(int damageTaken);
    public void basicAttack(String type, int roll);
    public void skill(String type, int roll);
    public void ult();
    public void switchCharacter();
}