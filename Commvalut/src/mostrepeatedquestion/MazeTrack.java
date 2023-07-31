package mostrepeatedquestion;

import java.util.Scanner;

public class MazeTrack {
	static int[] x_dir = {-1,1,0,0}, y_dir = {0,0,-1,1};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(),n = sc.nextInt();
		int arr[][] = new int[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				arr[i][j] = sc.nextInt();
		int start_row= 0,start_col=0,end_row = m-1,end_Col = n-1;
		boolean path = pathfinder(arr,start_row,start_col,end_row,end_Col);
		
		if(path)
			System.out.println("Path is available");
		else
			System.out.println("Path is not available");
		sc.close();
	}
	
	private static boolean pathfinder(int[][] arr, int row, 
			int col, int end_row, int end_Col) {
		if(arr[row][col]==0)
			arr[row][col] = 2;
		else
			return false;
		if(row == end_row && col == end_Col)
			return true;
		for(int i=0;i<4;i++)
		{ 
			int newRow = row+x_dir[i]; 
			int newCol = col+y_dir[i];
			if(isvalid(newRow,newCol,arr) && arr[newRow][newCol]==0)
			{
				if(pathfinder(arr,newRow,newCol,end_row,end_Col))
					return true;
			}
		}
		
		return false;
	}
	private static boolean isvalid(int newRow, int newCol, int[][] arr) {
		
		return 0<=newRow && newRow<arr.length && 0<=newCol && newCol<arr[0].length;
	}
}

//int arr[3][3] -> memory??
//int size = 4 bytes
