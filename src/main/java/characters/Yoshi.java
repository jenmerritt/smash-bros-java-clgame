package characters;

import moves.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Yoshi extends Player {

    public Yoshi(){
        super("Yoshi", 100,
                new ArrayList<Move>(
                        (Arrays.asList(
                                new EggThrow(),
                                new Punch(),
                                new Stomp()
                        ))
                ), null
        );
    }
}
