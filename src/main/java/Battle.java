import Characters.Enemy;
import Characters.ICharacter;
import Characters.Orc;
import Characters.Player;

public class Battle {

    public Battle(){}

    public void playerTakeTurn(Player player, Enemy enemy){
        enemy.takeDamage(player.giveDamage());
    }

    public void enemyTakeTurn(Enemy enemy, Player player){
        player.takeDamage(enemy.giveDamage());
    }


}
