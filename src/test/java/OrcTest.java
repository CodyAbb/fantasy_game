import Characters.Orc;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class OrcTest {

    private Orc orc;

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
}
