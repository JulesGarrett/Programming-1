import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		Scanner myScan=new Scanner(System.in);
		int b;
		System.out.println("Enter the number of asterisks for the base of the triangle: ");
		b=myScan.nextInt();
		for(int x=1; x<=b; x++)
				{
					for(int y=1; y<=x; y++)
					{
						System.out.print("*");
					}
System.out.println("");
				}
}
}
