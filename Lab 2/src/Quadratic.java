/* 
 * File Name: Quadratic.java
 * Author: Julia Garrett
 * Assignment: EECS-168 Lab 2
 * Description: This program calculates the roots of the quadratic equation. Assumes valid input.
 * Date: 9/17/15
 */
import java.util.Scanner;
import java.lang.Math;
public class Quadratic {
	public static void main(String[] args) {
double a=0.0;
double b=0.0;
double c=0.0;
Scanner myScan=new Scanner(System.in);
System.out.println("Input a:");
a=myScan.nextDouble();
System.out.println("Input b:");
b=myScan.nextDouble();
System.out.println("Input c:");
c=myScan.nextDouble();
double root1;
root1=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
double root2;
root2=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
System.out.println("root 1:"+root1);
System.out.println("root 2:"+root2);

	}
}
