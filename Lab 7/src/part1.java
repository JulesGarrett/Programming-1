import java.util.Scanner;
public class part1 {

	public static void main(String[] args) {
		Scanner myScan=new Scanner(System.in);
		int size=0;
		do{
		System.out.println("Input an array size:");
		size=myScan.nextInt();
		}
		while(size<1);
		System.out.println("Now please enter "+size+" numbers");
		double[] nums=new double[size];
		for(int i=0; i<size; i++){
			System.out.println("Input a number into your array: ");
			nums[i]=myScan.nextDouble();
		}
		System.out.println("Here are all the numbers in your array:");
		printArray(nums);
		System.out.println("");
		System.out.println("");
		int size2=0;
		do {
			System.out.println("Input a new size: ");
		size2=myScan.nextInt();
		} 
		while(size2<size);
		System.out.println("You need to add "+(size2-size)+" values");
		nums=arrayResize(nums, size2);
		for (int i=size; i<size2; i++){
			System.out.println("Input a number to add to your array:");
			nums[i]=myScan.nextDouble();
		}
		System.out.println("Here are all the numbers in your new array:");
		printArray(nums);
		double value=0.0;
		System.out.println("");
		System.out.println("");
		System.out.println("Enter a value to count: ");
		value=myScan.nextDouble();
		int x=0;
		x=count(nums, value);
		if(x==1){
			System.out.println(value+" occurs "+x+" time in the array.");
		}
		else{
			System.out.println(value+" occurs "+x+" times in the array.");
		}
		double z=0.0;
		z=min(nums);
		System.out.println("Min value in array: "+z);
		double y=0.0;
		y=max(nums);
		System.out.println("Max value in array: "+y);
	
		
	}
	public static void printArray(double[]arr){
		for (int i=0; i<arr.length; i++){
			if (i==0){
				System.out.print("[");
			}
				System.out.print(arr[i]);
				if(i!=(arr.length-1)){
					System.out.print(", ");
				}
			if(i==(arr.length-1)){
				System.out.print("]");
			} 
		}
	}
	public static double[] arrayResize(double[] oldArray, int newSize){
		double[] nums2=new double [newSize];
		for(int i=0; i<oldArray.length; i++){
			nums2[i]=oldArray[i];
		}
		for(int i=oldArray.length; i<newSize; i++)
			nums2[i]=0;
		return (nums2);
	}
	public static int count(double[] arr, double value){
		int x=0;
		for(int i=0; i<arr.length;i++){
			if(arr[i]==value){
				x++;
			}
		}
		return(x);
	}
	public static double max(double[]arr){
		double max=0.0;
		max=arr[0];
		for (int i=0; i<arr.length; i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		return(max);
	}
	public static double min(double[]arr){
		double min=0.0;
		min=arr[0];
		for(int i=0; i<arr.length; i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		return(min);
	}
}