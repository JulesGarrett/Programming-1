/*-----------------------------------------------
 * File Name: Dice
 * Author: Jules Garrett   jrgarrett3222@gmail.com
 * Assignment: EECs-168 Lab 2
 * Description: This program allows for the creation of dice and the ability to roll them
 * Date: 11/17/15
 */
import java.util.Random;
public class Dice {
	private final int numSides;
	public Dice(int sides){//creates a dice with given amount of sides
		numSides=sides;//sets variable numSides to the parameter
		
	}
	public int roll(){//creates method that "rolls" a dice returning a random number
		Random myRand=new Random();
		return (myRand.nextInt(numSides)+1);
	}



}
