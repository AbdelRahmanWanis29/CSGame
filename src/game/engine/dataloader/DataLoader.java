package game.engine.dataloader;

import game.engine.cards.*;
import game.engine.monsters.*;

import javax.script.ScriptEngine;
import javax.smartcardio.Card;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class DataLoader {

    public static String CARDS_FILE_NAME = "cards.csv";
    public static String MONSTERS_FILE_NAME = "monsters.csv";
    public static String CELLS_FILE_NAME = "cells.csv";

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
                case "CONFUSION":c = new ConfusionCard(tokens[1],tokens[2],Integer.parseInt(tokens[3]),Boolean.parseBoolean(tokens[4]),Integer.parseInt(tokens[5]));
                break;
                default:break;
            }
            cards.add(c);
        }
        return cards;
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
                case "DASHER":m = new Dasher(tokens[1],tokens[2],tokens[3],Integer.parseInt(tokens[4]));
                    break;
                case "DYNAMO":m = new Dynamo();
                    break;
                case "MULTITASKER":m = new MultiTasker();
                    break;
                case "SCHEMER":m = new Schemer();
                    break;
                default:break;
            }
            monsters.add(c);
        }
        return monsters;
    }


}