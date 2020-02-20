import Characters.Enemy;
import Characters.ICharacter;
import Characters.Orc;
import Characters.Player;

public class Battle {
    private Player player1;
    private Player player2;

    public Battle(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public void takeTurn(ICharacter attacker, ICharacter defender){
        defender.takeDamage(attacker.giveDamage());
    }

    public boolean player1WinsBattle(){
        return player2.getHealthPoints() <= 0;
    }
}
