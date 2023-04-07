/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import java.util.ArrayList;
import java.util.Scanner;
import Constants.Constants;

/**
 *
 * @author HUU NGOC CHINH CAO
 * 4529434
 */
public class Game 
{
    private int gameTurn;
    private ArrayList<Player> players;
    private Roll dice; 
 
    public Game()
    {
        //Call methods
        createPlayers();
        displayPlayers();
        playGame();
    }
    private void createPlayers()
    {
        //Create players with name of Human and AI
        players = new ArrayList();    
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter human name:");
        String input = Scan.next();
        Player Human = new HumanPlayer();
        Human.setName(input);
        Player Ai= new AiPlayer();
        Ai.setName("AI Player");
        players.add(Human);
        players.add(Ai);
    }

    private void displayPlayers()
    {
        
        //Print out players name
        System.out.println("Players for this game are:");
        for (Player player : players)
        {
            //Loop through class player to print out players name
            String name = player.getName();
            System.out.println(name);
        }
            
    }
    private void playGame()
    {
        int roll = 0;
        dice = new Roll();
        for (Player player : players)
        {
            String name = player.getName();
            //Loop through ArrayList
            System.out.println("Displaying the dice value:");
            System.out.println("Player " + name + " passed the dice");
            System.out.println("Player " + name + " rolling the dice");
            Roll display = new Roll();
            Player human = new HumanPlayer();
            Player ai = new AiPlayer();
            Roll select = new Roll();
            select.removeDice(select);
            while(select.getDice().size() < Constants.NUM_DICE && roll < Constants.MAX_ROLLS)
            {
                System.out.println("Roll" + roll);
                player.rollDice(dice);
                System.out.println("Player " + player.getName() + " select dice to keep");
                player.selectDice(dice, select, roll);
                roll++;
            }
            player.selectCategory(select);
            player.rollDice(dice);
            dice.displayDice();
        }
    }

    public int getGameTurn() {
        return gameTurn;
    }

    public void setGameTurn(int gameTurn) {
        this.gameTurn = gameTurn;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Roll getDice() {
        return dice;
    }

    public void setDice(Roll dice) {
        this.dice = dice;
    }
}
