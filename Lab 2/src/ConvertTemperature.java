/* File Name: convertTemperature.java
 * Author: Jules Garrett
 * Assignment: EECS-168 Lab 2
 * Description: This program will convert the input temperature from Fahrenheit to Celsius.
 * Date: 9/17/15
 */
import java.util.Scanner;

public class ConvertTemperature {

	public static void main(String[] args) {
		Scanner myScan=new Scanner(System.in);
		double F;
		double C;
		System.out.println("Enter the temperature in Fahrenheit:");
		F=myScan.nextDouble();
		C=((F-32)*5/9);
		System.out.println("*Conversion:");
		System.out.println(F+" degrees Fahrenheit = "+C+" degrees Celsius");
	}

}
