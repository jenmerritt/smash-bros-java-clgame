package characters;

import moves.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Link extends Player {

    public Link(){
        super("Link", 100,
                new ArrayList<Move>(
                        (Arrays.asList(
                                new SwordAttack(),
                                new BowAndArrow(),
                                new SuperJump()
                        ))
                ), null
        );
    }
}
