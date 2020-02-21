import Characters.Enemy;
import Characters.ICharacter;
import Characters.Orc;
import Characters.Player;

import java.util.ArrayList;
import java.util.Random;

public class Room {
    private ArrayList<Enemy> enemies;
    private ArrayList<ICharacter> currentFight;
    private Player player;

    public Room(){
        this.enemies = new ArrayList<Enemy>();
        this.currentFight = new ArrayList<ICharacter>();
    }

    public Player getPlayer(){
        return this.player;
    }

    public void addPlayer(Player player){
        this.player = player;
    }

    public ArrayList<ICharacter> getCurrentFight() {
        return currentFight;
    }

    public void addEnemy(Enemy enemy){
        this.enemies.add(enemy);
    }

    public ArrayList<Enemy> getEnemies(){
        return this.enemies;
    }

    public void prepareForBattle(){
        this.currentFight.add(player);
        Enemy enemy = this.enemies.remove(0);
        this.currentFight.add(enemy);
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public ICharacter chooseWhoGoesFirstForBattle(){
//        Random random = new Random();
//        int randomInteger = random.nextInt(1);

        return currentFight.get(getRandomNumberInRange(0, 1));
    }
}
