/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yahtzee;
import core.Game;
import userInterface.YahtzeeUi;

import javax.swing.JOptionPane;

/**
 *
 * @author HUU NGOC CHINH CAO
 *         4529434
 */
public class Yahtzee 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Welcome to Yahtzee!");
        JOptionPane.showMessageDialog(null, "Let's play Yahtzee!");
        //Call Yahtzee Ui
        YahtzeeUi yahtzeeUi= new YahtzeeUi();
        //Call Game
        Game game = new Game();
    }
    
}
