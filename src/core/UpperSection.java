/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import Constants.Constants;

/**
 *
 * @author HUU NGOC CHINH CAO
 * 4529434
 */
public class UpperSection
{
    int aces;
    int twos;
    int threes;
    int fours;
    int fives;
    int sixes;
    int totalScore;
    int bonus;
    int total;
    
    public void evaluateCategory(Roll roll, int category)
    {
        switch(category)
        {
            case 1:
                for(Die die : roll.getDice())
                {
                    if(die.getFaceValue() == Constants.ONES)
                        setAces(Constants.ONES);
                }
                break;
            case 2:
                for(Die die : roll.getDice())
                {
                    if(die.getFaceValue() == Constants.TWOS)
                        setTwos(Constants.TWOS);
                }
                break;
            case 3:
                for(Die die : roll.getDice())
                {
                    if(die.getFaceValue() == Constants.THREES)
                        setThrees(Constants.THREES);
                }
                break;
            case 4:
                for(Die die : roll.getDice())
                {
                    if(die.getFaceValue() == Constants.FOURS)
                        setFours(Constants.FOURS);
                }
                break;
            case 5:
                for(Die die : roll.getDice())
                {
                    if(die.getFaceValue() == Constants.FIVES)
                        setFives(Constants.FIVES);
                }
                break;
            case 6:
                for(Die die : roll.getDice())
                {
                    if(die.getFaceValue() == Constants.SIXES)
                        setSixes(Constants.SIXES);
                }
                break;
        }
    }

    public int getAces() {
        return aces;
    }

    public void setAces(int aces) {
        aces += aces;
        this.aces = aces;
    }

    public int getTwos() {
        return twos;
    }

    public void setTwos(int twos) {
        twos += twos;
        this.twos = twos;
    }

    public int getThrees() {
        return threes;
    }

    public void setThrees(int threes) {
        threes += threes;
        this.threes = threes;
    }

    public int getFours() {
        return fours;
    }

    public void setFours(int fours) {
        fours += fours;
        this.fours = fours;
    }

    public int getFives() {
        return fives;
    }

    public void setFives(int fives) {
        fives += fives;
        this.fives = fives;
    }

    public int getSixes() {
        return sixes;
    }

    public void setSixes(int sixes) {
        sixes += sixes;
        this.sixes = sixes;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        totalScore = aces + twos + threes + fours + fives + sixes;
        this.totalScore = totalScore;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        total = totalScore + bonus;
        this.total = total;
    }

}
