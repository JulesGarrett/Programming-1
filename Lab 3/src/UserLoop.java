import java.util.Scanner;
public class UserLoop {
	public static void main (String[] args){
		Scanner myScan=new Scanner(System.in);
		int x=0;
		int y=0;
		System.out.println("Input a start value (included): ");
		x=myScan.nextInt();
		System.out.println("Input an ending value (excluded");
		y=myScan.nextInt();
		if (x<y){
			int i;
		for (i=x; i<y; i=i+1)
		{System.out.println(i);
		}
	}
		else 
		{System.out.println("Invalid input");
		}
	}
	
}
