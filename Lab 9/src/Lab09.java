import java.util.Scanner;
public class Lab09 {
	public static void main (String args[]){
	int[][] grid;
	int row=0;
	int col=0;
	int num=0;
	int [] rows;
	Scanner k=new Scanner(System.in);
	System.out.println("How many rows?:");
	row=k.nextInt();
	System.out.println("How many columns?:");
	col=k.nextInt();
	grid=new int[row][col];
	rows=new int[col];
	for(int i=0; i<grid.length; i++){
		for (int j=0; j<grid[i].length; j++){
			grid[i][j]=0;
		}
	}
	for(int i=0; i<grid.length; i++){
		for(int j=0; j<grid[i].length; j++){
			System.out.println("Enter a value for the position ("+i+","+j+"):");
			grid[i][j]=k.nextInt();
		}
	}
	System.out.println("Here is your array");
	ArrayHelper.print2DArray(grid);
	for (int i=0; i<grid.length; i++){
		for (int j=0; j<grid[i].length;j++){
			rows[j]=grid[i][j];
		}
		System.out.println("row "+i+" sum= "+ArrayHelper.arraySum(rows)+", avg = "+ArrayHelper.arrayAvg(rows));
	}
	System.out.println("The largest value in the array is = "+ArrayHelper.arrayMax2D(grid));
	System.out.println("The sum for the entire array is = "+ArrayHelper.arraySum2D(grid));
	System.out.println("The average for the entire array is = "+ArrayHelper.arrayAvg2D(grid));
	

}
}