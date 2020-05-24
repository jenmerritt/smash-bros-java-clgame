package characters;

import moves.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Kirby extends Player {

    public Kirby(){
        super("Kirby", 100,
                new ArrayList<Move>(
                        (Arrays.asList(
                                new Punch(),
                                new Stomp(),
                                new SuperJump()
                        ))
                ), null
        );
    }
}
