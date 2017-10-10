import java.util.Scanner;
public class NumberGuessingGame {

	public static void main(String[] args) {
		System.out.println("Welcome to the number guessing game.");
		Scanner myScan= new Scanner (System.in);
		int g=0;
		
		do
		{System.out.print("Guess a number: ");
		g= myScan.nextInt();
		if (g<73){
			System.out.println("Sorry, your guess is too low");}
			else if (g>73){
				System.out.println("Sorry, your guess is too high");
				}
			else {System.out.println("You win!");
			}
		}
		while(g!=73);
	}

}
