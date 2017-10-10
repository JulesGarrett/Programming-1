import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		int y=0;
		do{
		System.out.println("Please enter a Number: ");
		int num=0;
		Scanner myScan= new Scanner(System.in);
		num=myScan.nextInt();
		boolean pal=isPalindrome(num);
		if (pal){
			System.out.println("The Number is a Palindrome.");
		}
		else{
			System.out.println("The Number is not a Palindrome.");
		}
		System.out.println("Want to try again? (y=1/n=0):");
		y=myScan.nextInt();
		}
	while(y==1);
		System.out.println("Thank you!");
	}
public static boolean isPalindrome(int num){
	int reverse=reverse(num);
	System.out.println("The reverse of the number is: "+reverse);
	boolean pal=(reverse==num);
	return(pal);
}
public static int reverse(int num){
	int reverse=0;
	int x=lengthOfNumber(num);
	System.out.println("The length of the number is : "+x);
	while (num>0){
		reverse=reverse*10;
		reverse=reverse+num%10;
		num=num/10;
	}
	return(reverse);
}
public static int lengthOfNumber(int num){
	int x=0;
	do{
		num=num/10;	
		x++;
	}
	while(num>0);
	return(x);
}
}