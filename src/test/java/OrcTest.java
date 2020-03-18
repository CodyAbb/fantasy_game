import Characters.Orc;
import Items.IAffectHealthPoints;
import Items.Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OrcTest {

   private Orc orc;
   private IAffectHealthPoints sword = new Weapon("sword", 20);
   private IProtect shield = new Armour("Shield", 15);


   @Before
   public void before(){
       orc = new Orc("Orc", 100, sword, );
   }

   @Test
   public void checkOrcHas100Health(){
     assertEquals(100, orc.getHealthPoints())
   }
//
//    @Test
//    public void checkTreasureStartsEmpty(){
//        assertEquals(0, orc.getTreasure().size());
//    }
//
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
// }
