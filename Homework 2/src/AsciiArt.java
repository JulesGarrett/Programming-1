/*File Name: Ascii Art
 * Author: Julia Garrett
 * KUID: 2834743
 * Email Address: jrgarrett3222@gmail.com
 * Homework Assignment Number: 2
 * Description: This program will create a specific pattern and a specific size both of which are decided by input from the user.
 * Last Changed: 10/5/15
 */
import java.util.Scanner;
public class AsciiArt {

	public static void main(String[] args) {
		System.out.println("Choose one of the following patterns by typing the corresponding number:");
		System.out.println("1) Stripes");
		System.out.println("2) Checker Board");
		System.out.println("3) Double Diagonal (aka the X)");
		System.out.println("4) Two Islands");
		Scanner myScan= new Scanner(System.in);
		int p=0;
		p=myScan.nextInt();
		if(p<1 || p>4)
		{System.out.println("Error");
		}
		else{
		System.out.println("Input a size (must be larger than 1):");
		int s=0;
		s=myScan.nextInt();
		if ( s<1)
			{System.out.println("Error");
			}
			else
			{if(p==1)
				{for (int x=0; x<s; x++)
				{System.out.print(x+" ");
				for (int y=0; y<s; y++)
				{if ((y%2)==1){
				System.out.print(" ");}
				else {System.out.print("*");}
				}
				
				System.out.println(" ");
				}
				}
			}
			 if (p==2)
				{for (int x=0; x<s; x++)
				{System.out.print(x+" ");
				for (int y=0; y<s; y++)
				{
					if ((x+y)%2 ==0)
					{
						System.out.print(('*'));
			
					}
					else {System.out.print(' ');
			
					}
				}
				System.out.println("");
				}
				}
		else if (p==3)
			{for (int x=0; x<s; x++)
			{System.out.print(x+" ");
			for (int y=0; y<s; y++)
		
			{if (x==y)
			{System.out.print(('*'));
			}
			else if (y==((s-1)-x))
			{System.out.print('*');
			
			}
			else {System.out.print(' ');
			
			}
			}
			System.out.println("");
				
			}
			}
		else if (p==4)
			{for (int x=0; x<s; x++)
			{System.out.print(x+" ");
			for (int y=0; y<s; y++)
			{if (y==((s-1)-x))
			{System.out.print('*');
			}
			else if(y<((s-1)-x) && x<(s/2) && y<(s/2))
				{System.out.print('!');
			}
			else if( y>((s-1)-x) && x>((s-1)/2) && y>((s-1)/2))
			{System.out.print('?');}
			else
			{System.out.print('~');
			}
			}
			System.out.println("");
			}
			
	}
		

}
}
}
