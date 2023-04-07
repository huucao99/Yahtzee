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
abstract class Player implements IPlayer
{
    //intialize and getters and setters
    String name;
    ScoreCard score;
    
    abstract void selectDice(Roll roll, Roll dice, int number);
    abstract void calculateScore(Roll object, int category);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScoreCard getScore() {
        return score;
    }

    public void setScore(ScoreCard score) {
        this.score = score;
    }
}
