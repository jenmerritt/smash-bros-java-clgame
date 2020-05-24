
import characters.Bowser;
import characters.Player;
import moves.FireBall;
import moves.FireBreath;
import moves.Move;
import moves.Punch;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BowserTest {

    Player bowser;
    Move firebreath;
    Move punch;
    Move fireball;
    ArrayList<Move> moves;

    @Before
    public void before(){
        firebreath = new FireBreath();
        punch = new Punch();
        fireball =  new FireBall();
        moves = new ArrayList<Move>();
        moves.add(firebreath);
        moves.add(punch);
        moves.add(fireball);
        bowser  = new Bowser();
    }

    @Test
    public void can_get_name(){
        assertEquals("Bowser", bowser.getName());
    }

    @Test
    public void can_get_moves(){
        assertEquals(moves.size(), bowser.getMoves().size());
    }

    @Test
    public void can_get_health(){
        assertEquals(50, bowser.getHealth());
    }

}
