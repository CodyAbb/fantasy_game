import Characters.Enemy;
import Characters.ICharacter;
import Characters.Orc;
import Characters.Player;

import java.util.ArrayList;
import java.util.Random;

public class Room {
    private ArrayList<Enemy> enemies;
    private Player player;

    public Room(){
        this.enemies = new ArrayList<Enemy>();
    }

    public Player getPlayer(){
        return this.player;
    }

    public void addPlayer(Player player){
        this.player = player;
    }

    public void addEnemy(Orc enemy){
        this.enemies.add(enemy);
    }

    public ArrayList<Enemy> getEnemies(){
        return this.enemies;
    }

//    public ICharacter chooseWhoGoesFirstForBattle(){
//        Random random = new Random();
//        int randomInteger = random.nextInt(1);
//
//    }
}
