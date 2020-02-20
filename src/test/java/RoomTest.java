import Characters.Orc;
import Characters.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    private Room room;
    private Player player;
    private Orc orc;

    @Before
    public void before(){
        room = new Room();
        player = new Player("Stephen");
        orc = new Orc();
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
        room.addEnemy(orc);
        assertEquals(1, room.getEnemies().size());
    }


}
