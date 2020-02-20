import Characters.Orc;
import Items.Item;
import Items.Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OrcTest {

    private Orc orc;
    private Item sword = new Weapon("sword", 20);


    @Before
    public void before(){
        orc = new Orc();
    }

    @Test
    public void checkTreasureStartsEmpty(){
        assertEquals(0, orc.getTreasure().size());
    }

    @Test
    public void checkInventoryStartsEmpty(){
        assertEquals(0, orc.getInventory().size());
    }

    @Test
    public void checkOrcCanHaveSword(){
        orc.addToInventory(sword);
        assertEquals(1, orc.getInventory().size());
    }
}
