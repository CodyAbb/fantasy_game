import Items.IAffectHealthPoints;
import Items.Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WeaponTest {

    private IAffectHealthPoints sword = new Weapon("sword", 20);


    @Test
    public void canGetAffectPoints(){
        assertEquals(20, sword.getAffectPoints());
    }
}
