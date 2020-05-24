package characters;

import moves.*;

import java.util.ArrayList;
import java.util.Arrays;

public class DonkeyKong extends Player {

    public DonkeyKong(){
        super("Donkey Kong", 100,
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
