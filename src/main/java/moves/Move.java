package moves;
import characters.Player;

public abstract class Move {

    private String name;
    private int damage;

    public Move(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return this.name;
    }

    public int getDamage(){
        return this.damage;
    }

    public void effectHealth(Player player) {
        player.setHealth(player.getHealth() - this.damage);
    }
}
