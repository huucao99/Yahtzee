/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

/**
 *
 * @author HUU NGOC CHINH CAO
 * 4529434
 */
 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
 
public class YahtzeeUi extends JFrame {
    private GameUi gameUi;
    private PlayerUi playerUi;
    private RollUi rollUi;
    private ScoreCardUi scoreCardUi;
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu gameMenu;
    private JMenuItem exit;
    private JMenuItem newGame;
    private JPanel rightPanel;
    private BoxLayout boxLayout;
    
    public YahtzeeUi()
    {
        initComponents();
    }
   
    void initComponents() {
        gameUi = new GameUi();
        playerUi = new PlayerUi();
        rollUi = new RollUi();
        scoreCardUi = new ScoreCardUi();
        boxLayout = new BoxLayout(rightPanel, BoxLayout.Y_AXIS);
       
        // Create menubar
        menuBar = new JMenuBar();
        gameMenu = new JMenu("Yahtzee");
        gameMenu.setMnemonic('G');
        menuBar.add(gameMenu);
        this.setJMenuBar(menuBar);
       
        // Create main control buttons
        newGame = new JMenuItem("New Game");
        exit = new JMenuItem("Exit");
        gameMenu.add(newGame);
        gameMenu.add(exit);
       
        // Create window frame
        frame = new JFrame("Yahtzee!");
        frame.setJMenuBar(menuBar);
       
       
        // Create right sidepanel
        rightPanel = new JPanel(new FlowLayout());
        rightPanel.setBorder(BorderFactory.createTitledBorder("Yahtzee"));
        this.add(rightPanel, BorderLayout.EAST);
 
        // Open window
        frame.setVisible(true);
        
        rightPanel.setBackground(Color.lightGray);
        rightPanel.setBorder(BorderFactory.createRaisedBevelBorder());
        
        
    }

}
