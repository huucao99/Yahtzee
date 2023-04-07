/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.ComponentOrientation;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
/**
 *
 * @author HUU NGOC CHINH CAO
 * 4529434
 */
public class LowerSectionUi extends JPanel {
    JLabel round, totalLower, totalUpper, grandTotal;
    ArrayList<JButton> categories;
    ArrayList<JLabel> scores;
    GridBagLayout layout = new GridBagLayout();
    JButton jbtn1 = new JButton();
    JButton jbtn2 = new JButton();
    JButton jbtn3 = new JButton();
    JButton jbtn4 = new JButton();
    JButton jbtn5 = new JButton();
    JButton jbtn6 = new JButton();
    JButton jbtn7 = new JButton();
    JButton jbtn8 = new JButton();
    
    public LowerSectionUi()
    {
        initComponents();
    }
    
    void initComponents(){
     //new JFrame
     JFrame jFrame = new JFrame();
     //new 7 JButton
     jbtn1 = new JButton("3 of a kind           Add total of all dice");
     jbtn2 = new JButton("4 of a kind           Add total of all dice");
     jbtn3 = new JButton("Full house            Score 25");
     jbtn4 = new JButton("Small straight        Score 30");
     jbtn5 = new JButton("Large straight        Score 40");
     jbtn6 = new JButton("YAHTZEE               Score 50");
     jbtn7 = new JButton("Chance                Score total of 5 dice");
     jbtn8 = new JButton("YAHTZEE BONUS         Score 100");
     //new GridBagLayout
     layout = new GridBagLayout();
     jFrame.setLayout(layout);
     //new GridBagConstraints
     GridBagConstraints gbc = new GridBagConstraints();
     //add button to JFrame
     gbc.fill = GridBagConstraints.HORIZONTAL;
     gbc.ipady = 20;
     gbc.gridx = 0;
     gbc.gridy = 0;
     gbc.gridwidth = 12;
     jFrame.add(jbtn1, gbc);
     gbc.ipady = 20;
     gbc.gridx = 0;
     gbc.gridy = 1;
     gbc.gridwidth = 12;
     jFrame.add(jbtn2, gbc);
     gbc.fill = GridBagConstraints.HORIZONTAL;
     gbc.ipady = 20;
     gbc.gridx = 0;
     gbc.gridy = 2;
     gbc.gridwidth = 12;
     jFrame.add(jbtn3, gbc);
     gbc.ipady = 20;
     gbc.gridx = 0;
     gbc.gridy = 3;
     gbc.gridwidth = 12;
     jFrame.add(jbtn4, gbc);
     gbc.ipady = 20;
     gbc.gridx = 0;
     gbc.gridy = 4;
     gbc.fill = GridBagConstraints.HORIZONTAL;
     gbc.gridwidth = 12;
     jFrame.add(jbtn5, gbc);
     gbc.ipady = 20;
     gbc.gridx = 0;
     gbc.gridy = 5;
     gbc.fill = GridBagConstraints.HORIZONTAL;
     gbc.gridwidth = 12;
     jFrame.add(jbtn6, gbc);
     gbc.ipady = 20;
     gbc.gridx = 0;
     gbc.gridy = 6;
     gbc.fill = GridBagConstraints.HORIZONTAL;
     gbc.gridwidth = 12;
     jFrame.add(jbtn7, gbc);
     gbc.ipady = 20;
     gbc.gridx = 0;
     gbc.gridy = 7;
     gbc.fill = GridBagConstraints.HORIZONTAL;
     gbc.gridwidth = 12;
     jFrame.add(jbtn8, gbc);
     jFrame.setLocation(50, 100);
     jFrame.setSize(500, 400);
     jFrame.setVisible(true);
     jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}