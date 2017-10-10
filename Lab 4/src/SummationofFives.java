import java.util.Scanner;
public class SummationofFives {
	public static void main(String[] args) {
		Scanner myScan=new Scanner(System.in);
		System.out.println("Please input a multiple larger than 1: ");
		int m=0;
		m=myScan.nextInt();
		System.out.println("Please input a positive integer as the end value: ");
		int i=0;
		i=myScan.nextInt();
		int s=0;
		int x=0;
		while(x<=i/m)
		{s=s+m*x;
		x++;
		}
		System.out.println("The sum is: "+s);
	}
	}