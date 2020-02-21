import Characters.*;
import Items.IAffectHealthPoints;
import Items.Protectives.Armour;
import Items.Protectives.IProtect;
import Items.Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    private Room room;
    private Player player;
    private Enemy imp;
    private Enemy hellKnight;
    private IAffectHealthPoints sword = new Weapon("sword", 20);
    private IAffectHealthPoints axe = new Weapon("axe", 5);
    private IProtect basicArmour = new Armour("basicArmour", 2);
    private IProtect shield = new Armour("shield", 5);

    @Before
    public void before(){
        room = new Room();
        player = new Player("Stephen");
        imp = new Imp(30, sword, basicArmour);
        hellKnight = new HellKnight(20, axe, basicArmour);
    }

    @Test
    public void roomStartsWithNoPlayer(){
        assertEquals(null, room.getPlayer());
    }

    @Test
    public void roomStartsWithNoEnemies(){
        assertEquals(0, room.getEnemies().size());
    }

    @Test
    public void canAddPlayerToRoom(){
        room.addPlayer(player);
        assertEquals(player, room.getPlayer());
    }

    @Test
    public void canAddEnemyToRoom(){
        room.addEnemy(imp);
        assertEquals(1, room.getEnemies().size());
    }

    @Test
    public void canAddPlayerAndEnemyToFight(){
        room.addPlayer(player);
        room.addEnemy(imp);
        room.addEnemy(hellKnight);
        room.prepareForBattle();
        assertEquals(2, room.getCurrentFight().size());
        assertEquals(1, room.getEnemies().size());
    }


//      This works but is randomised
//    @Test
//    public void canRandomlyGenerateWhoStarts(){
//        room.addPlayer(player);
//        room.addEnemy(imp);
//        room.addEnemy(hellKnight);
//        room.prepareForBattle();
//        assertEquals(player, room.chooseWhoGoesFirstForBattle());
//    }


}
