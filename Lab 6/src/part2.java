import java.util.Scanner;
public class part2 {

	public static void main(String[] args) {
		Scanner myScan=new Scanner(System.in);
		int size=0;
		System.out.println("Input an array size for your words array: ");
		size=myScan.nextInt();
		String [] words= new String[size];
		for (int i=0; i<words.length;i++){
			System.out.println("Input a word:");
			myScan.nextLine();
			words[i]=myScan.nextLine();
		}
		
		for (int i=0; i<words.length;i++){
			
		}

	}

}
