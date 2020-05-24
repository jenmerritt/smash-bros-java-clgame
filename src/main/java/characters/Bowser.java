package characters;

import moves.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Bowser extends Player {

    public Bowser(){
        super("Bowser", 100,
                new ArrayList<Move>(
                        (Arrays.asList(
                                new FireBall(),
                                new Stomp(),
                                new FireBreath()
                        ))
                ), null
        );
    }
}
