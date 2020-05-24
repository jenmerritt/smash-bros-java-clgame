package characters;
import moves.Move;
import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int health;
    private ArrayList<Move> moves;
    private Move selectedMove;

    public Player(String name, int health, ArrayList<Move> moves, Move selectedMove){
        this.name = name;
        this.health = health;
        this.moves = moves;
        this.selectedMove = selectedMove;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<Move> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }

    public Move getSelectedMove() {
        return selectedMove;
    }

    public void setSelectedMove(Move selectedMove) {
        this.selectedMove = selectedMove;
    }
}
