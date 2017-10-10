import java.util.Scanner;
public class part1 {

	public static void main(String[] args) {
		Scanner myScan=new Scanner(System.in);
		int size=0;
		do{
			System.out.println("Input an array size: ");
			size=myScan.nextInt();
		}
		while (size<1);
		System.out.println("Now please enter 5 numbers");
		int[] nums= new int[size];
		for (int i=0;i<nums.length;i++){
			System.out.println("Input a number into your array: ");
			nums[i]=myScan.nextInt();
		}
		System.out.println("Here are all the numbers in your array:");
		for (int i=0;i<nums.length;i++){
			System.out.println(nums[i]);
		}
		int sum=0;
		for (int i=0;i<nums.length;i++){
			sum=sum+nums[i];
		}
		int max=0;
		System.out.println("The sum of all the values is: "+sum);
		System.out.println("The average of all the values is: "+(sum/size));
		max=nums[0];
		for (int i=0;i<nums.length;i++){
			if (max<nums[i]){
				max=nums[i];
			}
		}
		System.out.println("The largest value is: "+max);
		int min=0;
		min=nums[0];
		for (int i=0;i<nums.length;i++){
			if(min>nums[i]){
				min=nums[i];
			}
		}
		System.out.println("The samllest value is: "+min);

	}

}
