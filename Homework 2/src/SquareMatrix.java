/*File Name: Square Matrix
 * Author: Julia Garrett
 * KUID: 2834743
 * Email Address: jrgarrett3222@gmail.com
 * Homework Assignment Number: 2
 * Description: This program will create a nxn matrix of numbers where n is a number collected from the user
 * Last Changed: 10/5/15
 */
import java.util.Scanner;
public class SquareMatrix {

	public static void main(String[] args) {
		Scanner myScan= new Scanner(System.in);
		System.out.println("Enter the Size of the Square Matrix");
		int s=0;
		s= myScan.nextInt();
		System.out.println("Square Matrix: ");
			for (int x=0; x<s; x++)
			{for (int y=1; y<=s; y++)
			{System.out.print(y+(s*x)+" ");
			}
			System.out.println("");
			}
		System.out.println("Transpose: ");
		for (int x=1; x<=s; x++)
		{for (int y=0; y<s; y++)
		{System.out.print(x+(s*y)+" ");
		}
		System.out.println("");
		}

	}
	

}