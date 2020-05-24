package characters;

import moves.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Mario extends Player {

    public Mario(){
        super("Super Mario", 100,
                new ArrayList<Move>(
                        (Arrays.asList(
                                new FireBall(),
                                new Stomp(),
                                new SuperJump()
                        ))
                ), null
        );
    }
}
