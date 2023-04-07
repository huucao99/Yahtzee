/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HUU NGOC CHINH CAO
 * 4529434
 */
public class UpperSectionUi extends JPanel{
    JLabel total, bonus, totalScore;
    ArrayList<JButton> categories;
    ArrayList<JLabel> scores;
    GridBagLayout layout = new GridBagLayout();
    JButton jbtn1 = new JButton();
    JButton jbtn2 = new JButton();
    JButton jbtn3 = new JButton();
    JButton jbtn4 = new JButton();
    JButton jbtn5 = new JButton();
    JButton jbtn6 = new JButton();
    
    public UpperSectionUi()
    {
        initComponents();
    }
    
    void initComponents(){
     //new JFrame
     JFrame jFrame = new JFrame();
     //new 7 JButton
     jbtn1 = new JButton("Aces                  Count and add only aces");
     jbtn2 = new JButton("Twos                  Count and add only twos");
     jbtn3 = new JButton("Threes                  Count and add only threes");
     jbtn4 = new JButton("Fours                  Count and add only fours");
     jbtn5 = new JButton("Fives                  Count and add only fives");
     jbtn6 = new JButton("Sixes                  Count and add only sixes");
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

     jFrame.setLocation(50, 100);
     jFrame.setSize(500, 400);
     jFrame.setVisible(true);
     jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    
    
}
