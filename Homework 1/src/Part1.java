
/*File Name: Banana Stand part 1
 * Author: Jules Garrett
 * KUID: 
 * Email Address: jrgarrett3222@gmail.com
 * Homework Assignment Number: 1
 * Description: This program will find the cost of an order of bananas based on the kind of bananas the user wants.
 * Last Changed: 9/27/15
 */
import java.util.Scanner;
public class Part1 {


	public static void main(String[] args) {
		System.out.println("Welcome to Banana Stand!");
		System.out.println("---------------------");
		
		char type='x';
		String ty =" ";
		Scanner myScan=new Scanner(System.in);
		System.out.println("Select type of banana:");
		System.out.println("Regular (r/R) (no markup)");
		System.out.println("Organic)(o/O (20% markup)");
		System.out.println("Saturated with Gamma Rays (g/G) (50% markup)");
		System.out.println("Input your choice: ");
		ty = myScan.nextLine();
		type=ty.charAt(0);
		double markup=0.0;
		System.out.println("----------------------");

		char color='x';
		String co=" ";
		System.out.println("Select color of banana:");
		System.out.println("Yellow (y/Y) (no discount)");
		System.out.println("Green (g/G) (10% discount)");
		System.out.println("Mixed (m/M) (5% discount)");
		System.out.println("Input your choice: ");
		co= myScan.nextLine();
		color=co.charAt(0);
		double discount=0.0;
		System.out.println("----------------------");
		
		int n=0;
		System.out.println("How many bananas do you want?:");
		n=myScan.nextInt();
		double total=0;
		total=(n*.03);
		
		System.out.printf("Total cost for "+n+" banana(s) before markups or discounts: $%.2f\n",total);
		if (type=='r'||type=='R')
			{System.out.println("Total markups: $"+0.00);
			}
		else if (type=='o'||type=='O')
			{markup=total*.2;
			System.out.printf("Total markups: $%.2f\n",markup);
			}
		else if (type=='g'||type=='G')
			{markup=total*.5;
			System.out.printf("Total markups: $%.2f\n",markup);
			}
		else {System.out.println("Invalid input");
		}
		
		if (color=='y'|| color=='Y')
		{System.out.println("Total discount: $0.00");
		}
		else if (color=='g'|| color=='G')
		{discount=total*.1;
			System.out.printf("Total discount: $%.2f\n",discount);
		}
		else if (color=='m'||color=='M')
		{discount=total*.05;
			System.out.printf("Total discount: $%.2f\n",discount);
		}
		else
		{System.out.println("Invalid Input");
		}
		System.out.printf("Total Cost: $%.2f",(total+markup-discount));
}	
}
