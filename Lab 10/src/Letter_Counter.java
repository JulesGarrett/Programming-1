import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class Letter_Counter {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String line="";
		FileReader myFR=null;
		BufferedReader myBR=null;
		int[] arr=new int[58];
		String file="input.txt";
		char c;
		char letter=' ';
		int let=0;
		FileWriter myFW=null;
		BufferedWriter myBW=null;
		String output=" ";
		boolean run=false;
		while(!run){
		try{
			System.out.println("Input a file name:");
			file=s.nextLine();
			myFR=new FileReader(file);
			myBR=new BufferedReader(myFR);
			line=myBR.readLine();
			
			System.out.println("Input an out file name:");
			output=s.nextLine();
			myFW=new FileWriter(output);
			myBW=new BufferedWriter(myFW);
			System.out.println("");
			System.out.println("Reading from "+file);
			System.out.println("");
			while(line!= null){
				System.out.println(line);
				for(int i=0; i<line.length(); i++){
					c=line.charAt(i);
					if(Character.isLetter(c)){
						let=c;
						let=let-65;
						arr[let]=arr[let]+1;
					}		
				}
				line=myBR.readLine();
			}
			for(int j=0; j<26;j++){
				letter=(char)(j+65);
				myBW.write(letter+"="+arr[j]);
				myBW.newLine();
			}
			for(int k=32; k<58;k++){
				letter=(char)(k+65);
				myBW.write(letter);
				myBW.write("="+arr[k]);
				myBW.newLine();
			}
			myBW.close();
			run=true;
			System.out.println("Results stored in "+output);
		
		
		
		
		}
		catch(Exception e){
				System.out.println(e.getMessage()+"Invalid filename given. Input another.");
		}
		}
	}

}