import java.util.Scanner;
public class WordGuessingGame {

	public static void main(String[] args) {
		System.out.println("Welcome to the word guessing game.");
		System.out.println("Guess a word: ");
		Scanner myScan=new Scanner(System.in);
		String x=" ";
		x= myScan.nextLine();
		while(!x.equals ("valentine"))
		{System.out.println("Incorrect. Guess again: ");
		x=myScan.nextLine();
		}
System.out.println("You win!");

	}

}
