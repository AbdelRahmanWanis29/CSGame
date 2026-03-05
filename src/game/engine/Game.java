package game.engine;

import game.engine.cards.Card;
import game.engine.dataloader.DataLoader;
import game.engine.monsters.Monster;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Game {


    private Board board;
    private ArrayList<Monster> allMonsters;

    private Monster player;
    private Monster opponent;
    private Monster current;

    public Game(Role playerRole) throws IOException{

        this.board = new Board(DataLoader.readCards());
        this.allMonsters = DataLoader.readMonster();
        this.player = selectRandomMonsterByRole(playerRole);
        Role opponentRole;
        if(playerRole==Role.LAUGHER){
            opponentRole = Role.SCARER;
        }else{
            opponentRole = Role.LAUGHER;
        }

        this.opponent = selectRandomMonsterByRole(opponentRole);
        this.current = this.player;

    }

    private Monster selectRandomMonsterByRole(Role role){

        ArrayList<Monster> filtered = new ArrayList<>();
        for (Monster m : allMonsters) {
            if (m.getRole() == role) {
                filtered.add(m);
            }
        }

        if (filtered.isEmpty()) {
            return null;
        }

        Random rand = new Random();
        return filtered.get(rand.nextInt(filtered.size()));
    }


    public Board getBoard() {
        return board;
    }

    public ArrayList<Monster> getAllMonsters() {
        return allMonsters;
    }

    public Monster getPlayer() {
        return player;
    }

    public Monster getOpponent() {
        return opponent;
    }

    public Monster getCurrent() {
        return current;
    }

    public void setCurrent(Monster current) {
        this.current = current;
    }

}
