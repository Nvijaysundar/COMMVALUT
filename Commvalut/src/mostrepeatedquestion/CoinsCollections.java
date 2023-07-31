package mostrepeatedquestion;
import java.util.Scanner;
public class CoinsCollections {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int m = sc.nextInt(),n = sc.nextInt();
			int arr[][]  = new int[m][n];
			for(int j=0;j<m;j++)
				for(int k=0;k<n;k++)
					arr[j][k] = sc.nextInt();
			System.out.println(collectcoins(arr, m, n));
		}
		sc.close();
	}

	 static int collectcoins(int[][] arr,int m,int n) {
		int coins = 0;
		boolean visited[][] = new boolean[m][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
			{
				if((i==0||j==0||i==m-1||j==n-1)&&!visited[i][j]&&arr[i][j]==1)
				{
					coins +=collect(arr,m,n,i,j,visited,coins);
				}
			}
		}
		return coins;
	}

	private static int collect(int[][] arr, int m, 
			int n,int i,int j,boolean[][] visited,int coins) {
		if(!isvalid(i,j,m,n)||arr[i][j]==0||visited[i][j])
			return 0;
		visited[i][j] = true;
		coins = arr[i][j];
		coins += collect(arr,m,n,i+1,j,visited,coins);
		coins += collect(arr,m,n,i-1,j,visited,coins);
		coins += collect(arr,m,n,i,j+1,visited,coins);
		coins += collect(arr,m,n,i,j-1,visited,coins);	
		return coins;
	}
	private static boolean isvalid(int i, int j, int m, int n) {
		return 0<=i && i<m && 0<=j && j<n;
	}
}
