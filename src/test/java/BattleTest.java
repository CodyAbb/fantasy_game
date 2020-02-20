import Characters.Enemy;
import Characters.Orc;
import Characters.Player;
import Items.IAffectHealthPoints;
import Items.Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BattleTest {

    private Player player1;
    private Player player2;
    private Battle battle;
    private IAffectHealthPoints sword = new Weapon("sword", 20);


    @Before
    public void before(){
        player1 = new Player("Luca");
        player2 = new Player("Jaimie");
        battle = new Battle(player1, player2);
    }

    @Test
    public void player1CanAttackPlayer2(){
        player1.addToDamageGiverInventory(sword);
        player1.equipDamageGiver(0);
        battle.takeTurn(player1, player2);
        assertEquals(80, player2.getHealthPoints());
    }
}
