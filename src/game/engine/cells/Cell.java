package game.engine.cells;

import game.engine.monsters.Monster;

public class Cell {
    final private  String name;
    private Monster monster;

    public Cell(String name)
    {
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public Monster getMonster()
    {
        return this.monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

}
