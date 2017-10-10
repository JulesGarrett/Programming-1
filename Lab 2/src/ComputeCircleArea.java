/*
 * File Name: ComputeCircleArea.java
 * Author: Jules Garrett  jrgarrett3222@gmail.com
 * Assignment: EECS-168 Lab 2
 * Description: This program will compute the area of the circle, where the radius is received 
 * 					from the user.
 * Date: 9/17/15
 */
import java.util.Scanner;
public class ComputeCircleArea {

	public static void main(String[] args) {
		double pi=3.141592;
		double r=0.0;
		Scanner myScan=new Scanner(System.in);
		System.out.println("Enter the number for radius");
		r=myScan.nextDouble();
		double area=0.0;
		area=(pi*r*r);
		System.out.println("The area for the cicle of redius "+r+" is "+area);

	}

}
