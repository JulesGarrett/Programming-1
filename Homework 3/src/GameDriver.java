import java.util.Scanner;
public class GameDriver {
	public static void main (String []args){
		Scanner myScan=new Scanner(System.in);
		String g;
		boolean guessed=false;
		boolean gameOver=false;
		String newWord="big bang";
		String choice="yes";
		System.out.println("Welcome to the Hangman Game!");
		System.out.println("------------------------------");
		while(choice.equals("yes")){
			Hangman h1=new Hangman(newWord);
			while(gameOver==false){
				System.out.println("\n");
				System.out.println("Guess this: "+h1.getDisguisedWord());
				System.out.println("Guesses so far: "+h1.getGuessCount());
				System.out.println("Misses: "+h1.getMissedMarker());
				System.out.println("Enter your guess character:");
				g=myScan.nextLine().toLowerCase();
				guessed=h1.guessCharacter(g.charAt(0));
				if(guessed==true){
					System.out.println(g+" is in the secret word!");
				}
				else{
					System.out.println(g+" is not in the sercet word. Death draws closer.");
				}
				gameOver=h1.isGameOver();
			}
			System.out.println("Game Over!");
			if(h1.isFound()==true){
				System.out.println("Congratulations! You guessed the secret word: "+newWord+" in "+h1.getGuessCount()+" guesses!");
			}
			else{
				System.out.println("You died. Next time, guess as if your life depended on it.");
			}
			System.out.println("Do you want to play again? (yes/no): ");
			choice=myScan.nextLine().toLowerCase();
			if(choice.equals("yes")){
				System.out.println("Input a new secret word: ");
				newWord=myScan.nextLine().toLowerCase();
				gameOver=false;
			}
		}
		System.out.println("Thanks for playing "+ Hangman.gamesPlayed +" game(s) of Hang Man!");
		myScan.close();
	}
}
