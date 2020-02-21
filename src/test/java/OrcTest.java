import Characters.Orc;
import Items.IAffectHealthPoints;
import Items.Protectives.Armour;
import Items.Protectives.IProtect;
import Items.Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OrcTest {

    private Orc orc;
    private IAffectHealthPoints sword = new Weapon("sword", 10);
    private IProtect armour = new Armour("Goliath", 5);


    @Before
    public void before() {
        orc = new Orc(20, sword, armour);
    }

    @Test
    public void canGetWeapon(){
        assertEquals(sword, orc.getEquippedWeapon());
    }

    @Test
    public void canGetProtective(){
        assertEquals(armour, orc.getEquippedProtection());
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(20, orc.getHealthPoints());
    }

    @Test
    public void orcGivesDamage(){
        assertEquals(10, orc.giveDamage());
    }

    @Test
    public void orcTakesDamage(){
        orc.takeDamage(10);
        assertEquals(15, orc.getHealthPoints());
    }

}

//    @Test
//    public void checkTreasureStartsEmpty(){
//        assertEquals(0, orc.getTreasure().size());
//    }

//    @Test
//    public void checkInventoryStartsEmpty(){
//        assertEquals(0, orc.getInventory().size());
//    }
//
//    @Test
//    public void checkOrcCanHaveSword(){
//        orc.addToInventory(sword);
//        assertEquals(1, orc.getInventory().size());
//    }
//
//    @Test
//    public void canAffectOrcHealthWithSword(){
//        assertEquals(90, );
//    }
//}
