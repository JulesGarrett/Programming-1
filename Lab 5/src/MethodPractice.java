import java.util.Scanner;
public class MethodPractice {

	public static void main(String[] args) {
		int l=0;
		Scanner myScan=new Scanner(System.in);
		System.out.println("Input two numbers:");
		int a=0;
		int b=0;		
		a=myScan.nextInt();
		b=myScan.nextInt();
		l=max( a, b);
		System.out.println("The max of "+a+" and "+b+" is: "+l); 
		System.out.println(" ");
		System.out.println("Input a radius: ");
		double radius=0.0;
		radius=myScan.nextDouble();
		radius=sphereArea(radius);
		System.out.println("The area of a sphere with this radius is: "+ radius);
		System.out.println(" ");
		System.out.println("Input a String:");
		String word=" ";
		myScan.nextLine();
		word= myScan.nextLine();
		System.out.println(" ");
		System.out.println("How many times do you want to print it?: ");
		int timesToPrint=0;
		timesToPrint=myScan.nextInt();
		printWord( word, timesToPrint);
	}
	public static int max(int a, int b)
		{
		if(a>b)
		{return a;
		}
		else
		{return b;
		}
		}
		
	public static double sphereArea(double radius)
		{
		if (radius > 0){
			radius=(4*radius*radius*3.14159);
			return(radius);
		}
		else {
			return(0.0);
		}
		
	}
	
	public static void printWord(String word, int timesToPrint)
	{
		if (timesToPrint>0){
			for(int i=0; i<timesToPrint;i++){
				System.out.println(word);
			}
		}
	}
}
