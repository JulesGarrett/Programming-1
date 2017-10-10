import java.lang.Math;
import java.util.Scanner;
public class Hypotenuse {
	public static void main(String[] args) {
		Scanner myScan=new Scanner(System.in);
		double a=0.0;
		double b=0.0;
		double c=0.0;
		System.out.println("Will use the formula a^2 +b^2 = c^2 to solve for the hypotenuse of a triangle.");
		System.out.println("Imput a value for a: ");
		a=myScan.nextDouble();
		System.out.println("Imput a value for b: ");
		b=myScan.nextDouble();
		c=Math.sqrt(a*a+b*b);
		System.out.println("The hypotnuse is "+c);
}}
