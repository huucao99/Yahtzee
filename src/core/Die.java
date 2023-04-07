/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import java.util.Random;
import Constants.Constants;

/**
 *
 * @author HUU NGOC CHINH CAO
 * 4529434
 */
public class Die 
{
    int faceValue;
    public void rollDie ()
    {
        //Generate the random faceValue for dice
        Random Random = new Random();
        faceValue = (Random.nextInt(Constants.MAX_DIE_VALUE) + 1);
    }
    
    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }
    
    public String toString()
    {
        return Integer.toString(getFaceValue());
    }
}
