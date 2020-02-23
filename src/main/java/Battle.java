import Characters.Enemy;
import Characters.ICharacter;
import Characters.Orc;
import Characters.Player;

public class Battle {

    public Battle(){}

    public String playerTakeTurn(Player player, Enemy enemy){
        enemy.takeDamage(player.giveDamage());
        if (enemy.getHealthPoints() <= 0){
            return "playerWins";
        } else {
            return "continue";
        }
    }

    public String enemyTakeTurn(Enemy enemy, Player player){
        player.takeDamage(enemy.giveDamage());
        if (player.getHealthPoints() <= 0){
            return "enemyWins";
        } else {
            return "continue";
        }
    }

//    public String checkIfEitherCharacterHasWon(){
//        if ()
//    }


}
