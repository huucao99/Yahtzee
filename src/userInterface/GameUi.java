/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;

/**
 *
 * @author HUU NGOC CHINH CAO
 * 4529434
 */
public class GameUi extends JPanel {
    JLabel round, gameTurn, logo;
   
    GridLayout grid;

    public GameUi()
    {
        initComponents();
    }
        void initComponents()
    {
        round = new JLabel();
        this.add(round);
        gameTurn = new JLabel();
        this.add(gameTurn);
        logo = new JLabel();
        this.add(logo);
        grid = new GridLayout(3,1);
        this.setLayout(grid);

    }
}
    

