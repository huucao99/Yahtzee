/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author HUU NGOC CHINH CAO
 * 4529434
 */
public class Roll 
{
    int i;
    static ArrayList<Die> dice;
    
    public Roll()
    {
        createDice();
    }
    private void createDice()
    {
        dice = new ArrayList<Die>();
        //Loop dice to add faceValue to ArrayList
        for (i = 0; i < 5; i++)
        {
            Die Die = new Die();
            dice.add(Die);
        }
    }
    public void displayDice()
    {
        int counter = 0;
        for (Die Die : dice)
        {
            //Print out the value in ArrayList
            System.out.println("Die " + counter + " - " + Die.getFaceValue());
            counter++;
        }
    }
    
    public void sortDice()
    {
        ArrayList<Integer> diceValues = new ArrayList();
        
        for(Die die : dice)
            diceValues.add(new Integer(die.getFaceValue()));
        
        Collections.sort(diceValues);
        
        removeDice(this);
        
        for(Integer intt : diceValues)
        {
            Die die = new Die();
            die.setFaceValue(intt);
            dice.add(die);
        }
    }
    public void removeDice(Roll remove)
    {
        dice.removeAll(dice);
    }
    public ArrayList<Die> getDice() {
        return dice;
    }

    public void setDice(ArrayList<Die> dice) {
        this.dice = dice;
    }
}
