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
public class RollUi extends JPanel{
    GridBagLayout layout = new GridBagLayout();
    JButton jbtn1 = new JButton();
    JButton jbtn2 = new JButton();
    JButton jbtn3 = new JButton();
    JButton jbtn4 = new JButton();
    JButton jbtn5 = new JButton();
    JButton roll = new JButton();
    
    public RollUi()
    {
        initComponents();
    }
    
    void initComponents(){
     //new JFrame
     JFrame jFrame = new JFrame();
     //new 7 JButton
     jbtn1 = new JButton("1");
     jbtn2 = new JButton("2");
     jbtn3 = new JButton("3");
     jbtn4 = new JButton("4");
     jbtn5 = new JButton("5");
     roll = new JButton("Roll Dice");
     //new GridBagLayout
     layout = new GridBagLayout();
     jFrame.setLayout(layout);
     //new GridBagConstraints
     GridBagConstraints gbc = new GridBagConstraints();
     //add button to JFrame
     gbc.fill = GridBagConstraints.HORIZONTAL;
     gbc.ipady = 30;
     gbc.gridx = 0;
     gbc.gridy = 0;
     gbc.gridwidth = 1;
     jFrame.add(jbtn1, gbc);
     gbc.ipady = 30;
     gbc.gridx = 0;
     gbc.gridy = 1;
     gbc.gridwidth = 1;
     jFrame.add(jbtn2, gbc);
     gbc.fill = GridBagConstraints.HORIZONTAL;
     gbc.ipady = 30;
     gbc.gridx = 0;
     gbc.gridy = 2;
     gbc.gridwidth = 1;
     jFrame.add(jbtn3, gbc);
     gbc.ipady = 30;
     gbc.gridx = 0;
     gbc.gridy = 3;
     gbc.gridwidth = 1;
     jFrame.add(jbtn4, gbc);
     gbc.ipady = 30;
     gbc.gridx = 0;
     gbc.gridy = 4;
     gbc.fill = GridBagConstraints.HORIZONTAL;
     gbc.gridwidth = 1;
     jFrame.add(jbtn5, gbc);
     gbc.ipady = 60;
     gbc.gridx = 0;
     gbc.gridy = 5;
     gbc.fill = GridBagConstraints.HORIZONTAL;
     gbc.gridwidth = 2;
     jFrame.add(roll, gbc);

}
    
}
