/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import Constants.Constants;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author HUU NGOC CHINH CAO
 * 4529434
 */
public class HumanPlayer extends Player
{
    public HumanPlayer()
    {
        setScore(new ScoreCard());
    }
    //Override interface
    @Override
    public void rollDice(Roll dice)
    {
        //Loop through class Die to obtain faceValue
        ArrayList<Die> die = dice.getDice();
        for (Die Die : dice.getDice())
        {
            Die.rollDie();
        }
    }
    @Override
    public void selectCategory(Roll dice)
    {
        System.out.println("Select the category for this roll by entering the index");
        Scanner scan = new Scanner(System.in); 
        dice.displayDice();
        
        int select = 0;
        do
        {
            System.out.println("**********************");
            System.out.println(" UPPER SECTION");
            System.out.println("**********************");
            System.out.println("1 - ONES");
            System.out.println("2 - TWOS");
            System.out.println("3 - THREES");
            System.out.println("4 - FOURS");
            System.out.println("5 - FIVES");
            System.out.println("6 - SIXES");
            System.out.println("**********************");
            System.out.println("  LOWER SECTION");
            System.out.println("**********************");
            System.out.println("7 - THREE OF A KIND");
            System.out.println("8 - FOUR OF A KIND");
            System.out.println("9 - FULL HOUSE");
            System.out.println("10 - SMALL STRAIGHT");
            System.out.println("11 - LARGE STRAIGHT");
            System.out.println("12 - YAHTZEE");              
            System.out.println("13 - CHANCE");
            try 
            {
                select = scan.nextInt();
                if(select < 1 || select > 13)
                {
                  System.out.println("**");
                  System.out.println("Invalid option, try again");
                  System.out.println("**");
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("**");
                System.out.println("Invalid option, try again");
                System.out.println("**");
                scan.next();
            }
        }
        while(scan.nextInt() < 1 || scan.nextInt() > 13);
        select = scan.nextInt();
        if (select >= 1 && select <= 13)
        {
            calculateScore(dice, select);
        }
    }


    @Override
    public void selectDice(Roll roll, Roll select, int number) {
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        boolean valid = false;
        System.out.println("Select dice to select");
        System.out.println("Enter the index of each die you would like to select, enter 5 for Done when finished");
         while(!done || !valid)
        {
            // display the die in the roll array list
            roll.displayDice();
            
            // get input from user
            String value = scan.next();

            // exit the while loop if the users selects to
            // or all dice have been selected
            if(value.equalsIgnoreCase("5"))
            {                
                if((!roll.getDice().isEmpty()) && 
                    number == (Constants.MAX_ROLLS - 1))
                {
                    System.out.println("Sorry " + getName() + 
                                       ", you have to select the rest of the dice");
                     
                    for(Die die : roll.getDice())
                    {
                        select.getDice().add(die);
                    }
                    
                    roll.getDice().removeAll(roll.getDice());
                }
             
                done = true;
   
                break;
            }
            else
            {
                int idx = 0;                
                Die die = null;
                
                // parse the integer from the input
                try
                {
                    idx = Integer.parseInt(value);
                    
                    // get that die from the arraylist
                    die = roll.getDice().get(idx);                

                    // add the die to the select arraylist
                    select.getDice().add(die);

                    // remove from the roll dice
                    roll.getDice().remove(idx);                
                }
                catch(Exception ex)
                {
                    System.out.println("Invalid option, try again");
                    valid = false;
                }
                
                System.out.println("***************");
                System.out.println("select dice " + select.getDice().size());
                select.displayDice();
                System.out.println("***************");
                
                if(select.getDice().size() == Constants.NUM_DICE)
                {
                    break;
                }
            }
        }
    }

    @Override
    public void calculateScore(Roll select, int category) {
        ScoreCard scorecard = new ScoreCard();
        if(category >= 1 && category <= 6)
            scorecard.upper.evaluateCategory(select, category);
        if(category >= 7 && category <= 13)
            scorecard.lower.evaluateCategory(select, category);
        System.out.println("Total Score is:" + scorecard.getGrandTotal());
    }
}
