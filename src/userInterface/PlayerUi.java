/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HUU NGOC CHINH CAO
 * 4529434
 */
public class PlayerUi extends JPanel{
    	JLabel playerName;
	JLabel playerScore;
        GridLayout grid;
        
        public PlayerUi(){
            initComponents();
        }

        void initComponents()
        {
        playerName = new JLabel();
        this.add(playerName);
        playerScore = new JLabel();
        this.add(playerScore);
        grid = new GridLayout(3,1);
        this.setLayout(grid);
        }
    
}
