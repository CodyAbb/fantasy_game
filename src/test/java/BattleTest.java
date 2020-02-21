import Characters.Enemy;
import Characters.Imp;
import Characters.Orc;
import Characters.Player;
import Items.IAffectHealthPoints;
import Items.Protectives.Armour;
import Items.Protectives.IProtect;
import Items.Weapons.Healing;
import Items.Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BattleTest {

    private Player player;
    private Enemy imp;
    private IAffectHealthPoints sword = new Weapon("sword", 20);
    private IAffectHealthPoints axe = new Weapon("axe", 5);
    private IProtect basicArmour = new Armour("basicArmour", 2);
    private IProtect shield = new Armour("shield", 5);
    private IAffectHealthPoints healingMantra = new Healing("healingMantra", 10);
    private Battle battle;

    @Before
    public void before(){
        player = new Player("Stephen");
        battle = new Battle();
        imp = new Imp(30, axe, basicArmour);
    }


    @Test
    public void playerCanAttackEnemy(){
        player.addToDamageGiverInventory(sword);
        player.equipDamageGiver(0);
        player.addToProtectionInventory(shield);
        player.equipProtective(0);
        battle.playerTakeTurn(player, imp);
        assertEquals(12, imp.getHealthPoints());
    }

    @Test
    public void enemyCanAttackPlayer(){
        player.addToDamageGiverInventory(sword);
        player.equipDamageGiver(0);
        player.addToProtectionInventory(shield);
        player.equipProtective(0);
        battle.enemyTakeTurn(imp, player);
        assertEquals(12, imp.getHealthPoints());
    }

    @Test
    public void canDecideWhoGoesFirstForBattle(){

    }
}
