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
public class ScoreCard 
{
    UpperSection upper;
    LowerSection lower;
    int grandTotal;
    
    public ScoreCard()
    {
        upper = new UpperSection();
        lower = new LowerSection();
    }

    public UpperSection getUpper() {
        return upper;
    }

    public void setUpper(UpperSection upper) {
        this.upper = upper;
    }

    public LowerSection getLower() {
        return lower;
    }

    public void setLower(LowerSection lower) {
        this.lower = lower;
    }

    public int getGrandTotal() {
        grandTotal = upper.getTotal() + lower.getTotalScore();
        return grandTotal;
    }

    public void setGrandTotal(int grandTotal) {
        this.grandTotal = grandTotal;
    }

}
