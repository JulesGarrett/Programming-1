import java.util.Scanner; 
public class Muliples {

	public static void main(String[] args) {
		Scanner myScan=new Scanner(System.in);
		int n;
		int m;
		System.out.println("What number do you wish to see multiples of?");
		n=myScan.nextInt();
		System.out.println("How many multiples?");
		m=myScan.nextInt();
		if(m>0){
		System.out.println("Here are the first "+m+" multiples of the number "+n);
		int x;
		
		for(x=n;x<=n*m;x=x+n)
		{System.out.println(x);
		}
		}
		else 
		{System.out.println("Error: The amount of multiples to display must be greater than zero.");
		}
		}
		

	}
