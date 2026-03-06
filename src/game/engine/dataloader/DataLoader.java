package game.engine.dataloader;

import game.engine.Role;
import game.engine.cards.*;
import game.engine.cells.Cell;
import game.engine.cells.ContaminationSock;
import game.engine.cells.ConveyorBelt;
import game.engine.cells.DoorCell;
import game.engine.monsters.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class DataLoader {

    private final static String CARDS_FILE_NAME = "cards.csv";
    private final static String MONSTERS_FILE_NAME = "monsters.csv";
    private final static String CELLS_FILE_NAME = "cells.csv";

    public static ArrayList<game.engine.cards.Card> readCards() throws IOException{
        ArrayList<game.engine.cards.Card> cards = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(CARDS_FILE_NAME));
        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(",");
            String type = tokens[0];
            game.engine.cards.Card c=null;
            switch (type) {
                case "SWAPPER":c = new SwapperCard(tokens[1],tokens[2],Integer.parseInt(tokens[3]));
                    break;
                case "STARTOVER":c = new StartOverCard(tokens[1],tokens[2],Integer.parseInt(tokens[3]),Boolean.parseBoolean(tokens[4]));
                    break;
                case "ENERGYSTEAL":c = new EnergyStealCard(tokens[1],tokens[2],Integer.parseInt(tokens[3]),Integer.parseInt(tokens[4]));
                    break;
                case "SHIELD":c = new ShieldCard(tokens[1],tokens[2],Integer.parseInt(tokens[3]));
                    break;
                case "CONFUSION":c = new ConfusionCard(tokens[1],tokens[2],Integer.parseInt(tokens[3]),Integer.parseInt(tokens[4]));
                    break;
                default:break;
            }
            cards.add(c);
        }
        return cards;
    }

    public static ArrayList<Cell> readCells() throws IOException{
        ArrayList<Cell> cells = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(CELLS_FILE_NAME));
        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(",");
            if (tokens.length == 3) {

                String name = tokens[0];
                Role role = Role.valueOf(tokens[1].toUpperCase());
                int energy = Integer.parseInt(tokens[2]);

                cells.add(new DoorCell(name, role, energy));
            }
            else if (tokens.length == 2) {

                String name = tokens[0];
                int effect = Integer.parseInt(tokens[1]);

                if (effect > 0) {
                    cells.add(new ConveyorBelt(name, effect));
                } else {
                    cells.add(new ContaminationSock(name, effect));
                }
            }


        }
        return cells;
    }


    public static ArrayList<Monster> readMonster() throws IOException{
        ArrayList<Monster> monsters = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(MONSTERS_FILE_NAME));
        String line;
        while ((line = br.readLine()) != null) {
            String[] tokens = line.split(",");
            String type = tokens[0];
            Monster m=null;
            switch (type) {
                case "DASHER":m = new Dasher(tokens[1],tokens[2], Role.valueOf(tokens[3]),Integer.parseInt(tokens[4]));
                    break;
                case "DYNAMO":m = new Dynamo(tokens[1],tokens[2], Role.valueOf(tokens[3]),Math.abs(Integer.parseInt(tokens[4])));
                    break;
                case "MULTITASKER":m = new MultiTasker(tokens[1],tokens[2], Role.valueOf(tokens[3]),Integer.parseInt(tokens[4]));
                    break;
                case "SCHEMER":m = new Schemer(tokens[1],tokens[2], Role.valueOf(tokens[3]),Integer.parseInt(tokens[4]));
                    break;
                default:break;
            }
            monsters.add(m);
        }
        return monsters;
    }



}