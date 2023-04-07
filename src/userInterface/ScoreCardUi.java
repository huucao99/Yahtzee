/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author HUU NGOC CHINH CAO
 * 4529434
 */
public class ScoreCardUi extends JPanel{
    LowerSectionUi lowerUi;
    UpperSectionUi upperUi;
    GridBagConstraints c;
    
    public ScoreCardUi() {
        initComponents();
    }

    void initComponents() {
        lowerUi = new LowerSectionUi();
        upperUi = new UpperSectionUi();
        
        this.setLayout(new GridBagLayout());
        c =  new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = 4;
        this.add(lowerUi, c);
        c.gridx = 0;
        c.gridy = 4;
        c.gridheight = 4;
        this.add(upperUi, c);
    }
    
}
