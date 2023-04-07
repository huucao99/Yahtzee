/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author HUU NGOC CHINH CAO
 * 4529434
 */
public class AiPlayer extends Player
{
    //Override interface
    @Override
    public void rollDice(Roll dice)
    {
        //Loop through class Die to obtain faceValue
        for(Die x : dice.getDice())
        {
            Die Die = new Die();
            Die.rollDie();
        }
    }
    @Override
    public void selectCategory(Roll category)
    {
        
    }

    @Override
    void selectDice(Roll roll, Roll dice, int number) {
 
    }

    @Override
    void calculateScore(Roll object, int category) {
    
    }
    
    
}
