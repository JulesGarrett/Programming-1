import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		int y=0;
		do{
		System.out.println("Please enter a No: ");
		int n=0;
		Scanner myScan=new Scanner(System.in);
		n=myScan.nextInt();
		int sum=0;
		sum=addDigits(sum, n);
		System.out.println("The sum of the digits is: "+(sum));
		System.out.println("Want to try again? (y=1/n=0):");
		y=myScan.nextInt();
		}
		while (y==1);
		if (y==0){
			System.out.println("Thank you!");
			}
	}
	public static int addDigits(int sum, int n)
	{do
		{sum=sum+(n%10);
			n=(n/10);
			
		}
	while (n>0);
		
		return (sum);
	}
}