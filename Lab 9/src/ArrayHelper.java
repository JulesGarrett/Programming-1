public class ArrayHelper {
	public static void print2DArray(int[][] array){
		for (int i=0; i<array.length; i++){
			for (int j=0; j<array[i].length; j++){
				System.out.print(array[i][j]);
				if (j!=array[i].length-1){
					System.out.print(", ");
				}
			}
			System.out.println("");
		}
	
	}
	public static int arraySum(int[] array){
		int sum=0;
		for(int i=0; i<array.length; i++){
			sum=sum+array[i];
		}
		return sum;
	}
	public static double arrayAvg(int[] array){
		double avg=0;
		double sum=0;
		for (int i=0; i<array.length;i++){
			sum=sum+array[i];
		}
		avg=sum/array.length;
		return avg;
	}
	public static int arraySum2D(int[][] array){
		int sum=0;
		for (int i=0; i<array.length; i++){
			for (int j=0; j<array[i].length; j++){
				sum=sum+array[i][j];
			}
		}
		return sum;
	}
	public static double arrayAvg2D(int[][] array){
		int sum=0;
		double avg=0;
		double count=0.0;
		for (int i=0; i<array.length; i++){
			for (int j=0; j<array[i].length; j++){
				sum=sum+array[i][j];
				count++;
			}
			avg=sum/count;
		}
		return avg;
	}
	public static int arrayMax2D(int[][] array){
		int max=array[0][0];
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array[i].length; j++){
				if (array[i][j]>max){
					max=array[i][j];
				}
			}
		}
		return max;
	}
}

