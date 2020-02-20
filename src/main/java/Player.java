public class Player {

    private String name;
    private int healthPoints;

    public Player(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(int damageAmount){
        this.healthPoints -= damageAmount;
    }
}
