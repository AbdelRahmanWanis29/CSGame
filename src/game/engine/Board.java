package game.engine;

import game.engine.cards.Card;
import game.engine.cells.Cell;
import game.engine.monsters.Monster;

import java.util.ArrayList;

public class Board {

    public static final int BOARD_ROWS = 10;
    public static final int BOARD_COLS = 10;

    private Cell[][] boardCells;

    private static ArrayList<Monster> stationedMonsters;
    private static ArrayList<Card> originalCards;
    private static ArrayList<Card> cards;

    public Board(ArrayList<Card> readCards) {

        boardCells = new Cell[BOARD_ROWS][BOARD_COLS];

        stationedMonsters = new ArrayList<>();
        cards = new ArrayList<>();

        originalCards = readCards;
    }


    public Cell[][] getBoardCells() {
        return boardCells;
    }

    public static ArrayList<Monster> getStationedMonsters() {
        return stationedMonsters;
    }

    public static ArrayList<Card> getOriginalCards() {
        return originalCards;
    }

    public static ArrayList<Card> getCards() {
        return cards;
    }

    public static void setStationedMonsters(ArrayList<Monster> monsters) {
        stationedMonsters = monsters;
    }

    public static void setCards(ArrayList<Card> newCards) {
        cards = newCards;
    }
}