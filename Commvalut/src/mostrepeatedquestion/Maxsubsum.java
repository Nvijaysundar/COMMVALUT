package mostrepeatedquestion;
import java.util.Scanner;
public class Maxsubsum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int m = sc.nextInt();
			int arr[] = new int[m];
			for(int j=0;j<m;j++)
				arr[j] = sc.nextInt();
			System.out.println("Max: "+Maxls(arr));
		}
		sc.close();
	}
	static int Maxls(int[] arr) {
		int n = arr.length;
		int[] dp = new int[n];
		int maxsum = arr[0];
		
		for(int i=0;i<n;i++)
		{
			dp[i] = arr[i];
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j])
					dp[i] = Math.max(dp[i],arr[i]+dp[j]);
			}
			maxsum = Math.max(maxsum, dp[i]);
		}
		for(int temp:dp)
			System.out.print(temp+" ");
		System.out.println();
		return maxsum;
	}
}
