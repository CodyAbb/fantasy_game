import Characters.Orc;
import Characters.Player;

import java.util.ArrayList;

public class Room {
    private ArrayList<Orc> enemies;
    private Player player;

    public Room(){
        this.enemies = new ArrayList<Orc>();
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

    public ArrayList<Orc> getEnemies(){
        return this.enemies;
    }
}
