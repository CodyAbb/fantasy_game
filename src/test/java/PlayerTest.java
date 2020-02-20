import Characters.Player;
import Items.IAffectHealthPoints;
import Items.Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class PlayerTest {

    private Player player;
    private IAffectHealthPoints sword = new Weapon("sword", 20);

    @Before
    public void before(){
        player = new Player("Stephen");
    }

    @Test
    public void canGetPlayerName(){
        assertEquals("Stephen", player.getName());
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(100, player.getHealthPoints());
    }

    @Test
    public void canAddToDamageGiverInventory(){
        player.addToDamageGiverInventory(sword);
        assertEquals(1, player.getDamageGiverInventory().size());
    }

    @Test
    public void playerCanTakeDamageFromSword(){
        player.takeDamage(20);
        assertEquals(80, player.getHealthPoints());
    }

    @Test
    public void playerCanGiveDamageBasedOnEquippedWeapon(){
        player.addToDamageGiverInventory(sword);
        player.equipDamageGiver(0);
        assertEquals(20, player.giveDamage());
    }
}
