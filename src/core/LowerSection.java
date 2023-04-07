/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import java.util.ArrayList;
import java.util.Collections;
import Constants.Constants;

/**
 *
 * @author HUU NGOC CHINH CAO
 * 4529434
 */
public class LowerSection 
{
    int threeKind;
    int fourKind;
    int fullHouse;
    int smStraight;
    int lgStraight;
    int yahtzee;
    int chance;
    int yahtzeeBonus;
    int totalScore;
    
    public void evaluateCategory(Roll roll, int category)
    {
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int trip = 0;
        int doub = 0;
        int sS = 0;
        int LS = 0;
        int i = 0;
        
        switch (category)
        {
            case 7:
                for(Die die : roll.getDice())
                {
                    if(die.getFaceValue() == Constants.ONES)
                        one++;
                    if(die.getFaceValue() == Constants.TWOS)
                        two++;
                    if(die.getFaceValue() == Constants.THREES)
                        three++;
                    if(die.getFaceValue() == Constants.FOURS)
                        four++;
                    if(die.getFaceValue() == Constants.FIVES)
                        five++;
                    if(die.getFaceValue() == Constants.SIXES)
                        six++;
                    if(one >= 3 || two >= 3 || three >= 3 || four >= 3 || five >= 3 || six >= 3)
                        setThreeKind(Constants.THREE_KIND);
                }
                break;
            case 8:
                for(Die die : roll.getDice())
                {
                    if(die.getFaceValue() == Constants.ONES)
                        one++;
                    if(die.getFaceValue() == Constants.TWOS)
                        two++;
                    if(die.getFaceValue() == Constants.THREES)
                        three++;
                    if(die.getFaceValue() == Constants.FOURS)
                        four++;
                    if(die.getFaceValue() == Constants.FIVES)
                        five++;
                    if(die.getFaceValue() == Constants.SIXES)
                        six++;
                    if(one >= 4 || two >= 4 || three >= 4 || four >= 4 || five >= 4 || six >=4)
                        setFourKind(Constants.FOUR_KIND);
                }
                break;
            case 9:
                for(Die die : roll.getDice())
                {
                    if(die.getFaceValue() == Constants.ONES)
                        one++;
                    if(die.getFaceValue() == Constants.TWOS)
                        two++;
                    if(die.getFaceValue() == Constants.THREES)
                        three++;
                    if(die.getFaceValue() == Constants.FOURS)
                        four++;
                    if(die.getFaceValue() == Constants.FIVES)
                        five++;
                    if(die.getFaceValue() == Constants.SIXES)
                        six++;
                    if(one >= 3)
                    {
                        trip = 1;
                        one = 0;
                    }
                    if(two >= 3)
                    {
                        trip = 1;
                        two = 0;
                    }
                    if(three >= 3)
                    {
                        trip = 1;
                        three = 0;
                    }
                    if(four >= 3)
                    {
                        trip = 1;
                        four = 0;
                    }
                    if(five >= 3)
                    {
                        trip = 1;
                        five = 0;
                    }
                    if(six >= 3)
                    {
                        trip = 1;
                        six = 0;
                    }
                    if(one >= 2 || two >=2 || three >= 2 || four >= 2 || five >= 2 || six >= 2)
                        doub = 1;
                    if(trip == 1 && doub == 1)
                        setFullHouse(Constants.FULL_HOUSE);
                }
                break;
            case 10:
                for(Die die : roll.getDice())
                {
                    if(die.getFaceValue() == Constants.ONES)
                        one++;
                    if(die.getFaceValue() == Constants.TWOS)
                        two++;
                    if(die.getFaceValue() == Constants.THREES)
                        three++;
                    if(die.getFaceValue() == Constants.FOURS)
                        four++;
                    if(die.getFaceValue() == Constants.FIVES)
                        five++;
                    if(die.getFaceValue() == Constants.SIXES)
                        six++;
                    if(one >= 1 && two >= 1 && three >= 1 && four >= 1)
                        sS = 1;
                    else if(two >= 1 && three >= 1 && four >= 1 && five >= 1)
                        sS = 1;
                    else if(three >= 1 && four >=1 && five >= 1 && six >= 1)
                        sS = 1;
                    if(sS == 1)
                        setSmStraight(Constants.SM_STRAIGHT);
                }
                break;
            case 11:
                for(Die die : roll.getDice())
                {
                    if(die.getFaceValue() == Constants.ONES)
                        one++;
                    if(die.getFaceValue() == Constants.TWOS)
                        two++;
                    if(die.getFaceValue() == Constants.THREES)
                        three++;
                    if(die.getFaceValue() == Constants.FOURS)
                        four++;
                    if(die.getFaceValue() == Constants.FIVES)
                        five++;
                    if(die.getFaceValue() == Constants.SIXES)
                        six++;
                    if(one >= 1 && two >= 1 && three >= 1 && four >= 1 && five >= 1)
                        LS = 1;
                    else if(two >= 1 && three >= 1 && four >= 1 && five >= 1 && six >= 1)
                        LS = 1;
                    if(LS == 1)
                        setLgStraight(Constants.LG_STRAIGHT);
                }
                break;
            case 12:
                for(Die die : roll.getDice())
                {
                    if(die.getFaceValue() == Constants.ONES)
                        one++;
                    if(die.getFaceValue() == Constants.TWOS)
                        two++;
                    if(die.getFaceValue() == Constants.THREES)
                        three++;
                    if(die.getFaceValue() == Constants.FOURS)
                        four++;
                    if(die.getFaceValue() == Constants.FIVES)
                        five++;
                    if(die.getFaceValue() == Constants.SIXES)
                        six++;
                    if(one >= 5 || two >= 5 || three >= 5 || four >= 5 || five >= 5 || six >= 5)
                        setYahtzee(Constants.YAHTZEE);
                }
                break;
            case 13:
                for(Die die : roll.getDice())
                {
                    i += die.getFaceValue();
                    setChance(Constants.CHANCE);
                }
                break;
                
        }
    }

    private ArrayList sortDice(Roll roll)
    {
        ArrayList<Integer> integer = new ArrayList();
        int i = 0;
        for (Die die : Roll.dice) 
        {
            Integer faceValue = 0;
            faceValue = roll.dice.get(i).getFaceValue();
            i++;
        }
        Collections.sort(integer);
        return integer;
    }
    public int getThreeKind() {
        return threeKind;
    }

    public void setThreeKind(int threeKind) {
        threeKind += threeKind;
        this.threeKind = threeKind;
    }

    public int getFourKind() {
        return fourKind;
    }

    public void setFourKind(int fourKind) {
        fourKind += fourKind;
        this.fourKind = fourKind;
    }

    public int getFullHouse() {
        return fullHouse;
    }

    public void setFullHouse(int fullHouse) {
        this.fullHouse = fullHouse;
    }

    public int getSmStraight() {
        return smStraight;
    }

    public void setSmStraight(int smStraight) {
        this.smStraight = smStraight;
    }

    public int getLgStraight() {
        return lgStraight;
    }

    public void setLgStraight(int lgStraight) {
        this.lgStraight = lgStraight;
    }

    public int getYahtzee() {
        return yahtzee;
    }

    public void setYahtzee(int yahtzee) {
        this.yahtzee = yahtzee;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        chance += chance;
        this.chance = chance;
    }

    public int getYahtzeeBonus() {
        return yahtzeeBonus;
    }

    public void setYahtzeeBonus(int yahtzeeBonus) {
        this.yahtzeeBonus = yahtzeeBonus;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        totalScore = threeKind + fourKind + fullHouse + smStraight + lgStraight + yahtzee + chance + yahtzeeBonus;
        this.totalScore = totalScore;
    }

}
