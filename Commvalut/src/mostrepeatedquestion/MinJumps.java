package mostrepeatedquestion;
import java.util.Scanner;
public class MinJumps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<n;j++)
			{
				arr[j] = sc.nextInt();
			}
			System.out.println(minimumjump(arr));
		}
	}
	private static int minimumjump(int[] arr) {
		int n = arr.length;
		int[] jumps = new int[n];
		
		jumps[0] = 0;
		for(int i=1;i<n;i++) {
			jumps[i] = Integer.MAX_VALUE;
			for(int j=0;j<i;j++)
				if(arr[j]>=i-j)
					jumps[i] = Math.min(jumps[i], jumps[j]+1);
			for(int k=0;k<jumps.length;k++)
				System.out.print(jumps[k]+ " ");
			System.out.println();
		}
		
		return jumps[n-1];
	}
}
