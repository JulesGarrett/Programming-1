import java.util.Scanner;
public class MyCircleTest {
	public static void main(String[] args) {
		
                // Declare a new circle called myCircle
		MyCircle myCircle=new MyCircle();
		
                // Declare any other variables you need (e.g. Scanner, double)
		Scanner scr=new Scanner(System.in);
		double rad;
                //Get a radius from the user
        System.out.println("Input a radius: ");
		rad=scr.nextDouble(); 
		myCircle.setRadius(rad);
                //Display a message to the screen that says "My circle has a radius of <put the radius here>"
		System.out.println("My circle has a radius of "+rad);
                //Use the method area() from myCircle to print the area                         
		
		System.out.println("The area is: "+myCircle.area());
                //Use the method circumference() from myCircle to print the circumference
		System.out.println("The circumference is: "+myCircle.circumference());
                //Using only a method call to diameter()  to print the diameter
		System.out.println("The diameter is: "+myCircle.diameter());
		
	}

}