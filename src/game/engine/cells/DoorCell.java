package game.engine.cells;

import game.engine.Role;

public class DoorCell extends Cell{
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
