package game.engine.monsters;
import game.engine.Role;


public abstract class Monster implements Comparable<Monster>{
    private String name; // R
    private String description; // R
    private Role role;
    private Role originalRole;//R
    private int energy; // >=0
    private int position; // 0-99
    private boolean frozen;
    private boolean shielded;
    private int confusionTurns;


    public void setRole(Role role) {
        this.role = role;
    }
    public void setEnergy(int energy) {
        if(energy >= 0) {
            this.energy = energy;
        }
    }
    public void setPosition(int position) {
        if (position >= 0 && position <= 99) {
            this.position = position;
        }
    }
    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }
    public void setShielded(boolean shielded) {
        this.shielded = shielded;
    }
    public void setConfusionTurns(int confusionTurns) {
        this.confusionTurns = confusionTurns;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public Role getRole() {
        return role;
    }
    public Role getOriginalRole() {
        return originalRole;
    }
    public int getEnergy() {
        return energy;
    }
    public int getPosition() {
        return position;
    }
    public boolean isFrozen() {
        return frozen;
    }
    public boolean isShielded() {
        return shielded;
    }
    public int getConfusionTurns() {
        return confusionTurns;
    }

    public Monster(String name, String description, Role originalRole, int energy){
        this.name = name;
        this.description = description;
        this.originalRole = originalRole;
        role = originalRole;
        this.energy = energy;
        position = 0;
        frozen = false;
        shielded = false;
        confusionTurns = 0;

    }

    public int compareTo(Monster o){
        return this.position - o.position;
    }


}
