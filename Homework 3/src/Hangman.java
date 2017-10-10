public class Hangman {
		private String secretWord;
		private char[] disguisedWord;
		private int guessCount;
		private int missesCount;
		private int MAX_MISSES_ALLOWED=7;
		private char[] missedMarkers;
		public static int gamesPlayed=0;
		public Hangman(String sw){
			secretWord=sw;
			disguisedWord=new char[secretWord.length()];
			for(int i=0; i<secretWord.length(); i++){//this for loop makes secretWord question marks and spaces
				if(secretWord.charAt(i)==' '){
					disguisedWord[i]=' ';
				}
				else{
					disguisedWord[i]='?';
				}
			}
			initialize();
			missedMarkers=new char[MAX_MISSES_ALLOWED];//initializes missedMarkers to "OOOOOOO"
			for(int i=0; i<MAX_MISSES_ALLOWED; i++){
					missedMarkers[i]='O';
			}
		}
		public boolean guessCharacter(char c){//where the game starts
			boolean guessed=false;
			guessCount=guessCount+1;//raises the guessCount
			for(int i=0; i<secretWord.length(); i++){//changes the letters in the secretWord to the user's guess if their guess is correct
				if(secretWord.charAt(i)==c){
					disguisedWord[i]=c;
					guessed=true;
				}
			}
			if(guessed==false){//if the users guess is incorrect, one "O" in missedMarkers will change to "X", and missesCount will go up by 1
				missedMarkers[missesCount]='X';
				missesCount=missesCount+1;
			}
			return guessed;
		}
		public boolean isFound(){//decides whether to congratulate the winner or tell them they died
			if(getDisguisedWord().equals(secretWord)){
				return true;
			}
			else{
				return false;
			}
		}
		public boolean isGameOver(){//game is over
			if(missesCount==MAX_MISSES_ALLOWED || isFound()==true){
				return true;
			}
			else{
				return false;
			}
		}
		public String getDisguisedWord(){//returns secretWord in form of question marks and spaces
			String s = "";
			for(int i=0; i<secretWord.length(); i++){
				s = s + disguisedWord[i];
			}
			return s;
		}
		public int getGuessCount(){//returns guessCount
			return guessCount;
		}
		public int getMissesCount(){//returns missesCount
			return missesCount;
		}
		public String getMissedMarker(){//returns missedMarkers with the correct number of "X"s and "O"s
 			String s = "";
			for(int i=0; i<MAX_MISSES_ALLOWED; i++){
				s = s + missedMarkers[i];
			}
			return s;
		}
		public int getGamesPlayed(){//return gamesPlayed
			return gamesPlayed;
		}
		private void initialize(){
			guessCount=0;
			missesCount=0;
			gamesPlayed=gamesPlayed+1;
		}
}
