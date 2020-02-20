import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlayerTest {

    private Player player;

    @Before
    public void before(){
        player = new Player("Stephen", 100);
    }

    @Test
    public void canGetPlayerName(){
        assertEquals("Stephen", player.getName());
    }

    @Test
    public void canGetHealthPoints(){
        assertEquals(100, player.getHealthPoints());
    }
}
