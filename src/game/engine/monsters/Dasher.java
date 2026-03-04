package game.engine.monsters;
import game.engine.Role;

public class Dasher extends Monster {
    private int mommentumTurns;
    public Dasher(String name, String description, Role role, int energy) {
        super(name, description, role, energy);
        mommentumTurns=0;
    }

    public int getMommentumTurns() {
        return mommentumTurns;
    }
    public void setMommentumTurns(int mommentumTurns) {
        this.mommentumTurns = mommentumTurns;
    }
}
