package game.engine.cells;

import game.engine.Role;
import game.engine.interfaces.CanisterModifier;

public class DoorCell extends Cell implements CanisterModifier {
    private Role role;
    private int energy;
    private boolean activated;

    public int getEnergy() {
        return energy;
    }

    public Role getRole() {
        return role;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public boolean isActivated() {
        return activated;
    }
    public DoorCell(String name, Role role, int energy)
    {
        super(name);
        this.role=role;
        this.energy=energy;
        this.activated=false;

    }

}
