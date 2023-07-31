package mostrepeatedquestion;
import java.util.Arrays;
import java.util.Scanner;
public class Longsubseq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int m = sc.nextInt();
			int arr[] = new int[m];
			for(int j=0;j<m;j++)
				arr[j] = sc.nextInt();
			System.out.println("length: "+lis(arr));
		}
		sc.close();
	}
	private static int lis(int[] arr) {
		int n = arr.length;
		int maxlen[] = new int[n];
		Arrays.fill(maxlen, 1);
		for(int i=1;i<n;i++)
		{	
			for(int j=0;j<i;j++)
			{
				if(arr[i]>arr[j])
				{
					maxlen[i] = Math.max(maxlen[i],maxlen[j]+1);
				}
			}
		}
		for(int temp: maxlen)
			System.out.print(temp+" ");
		System.out.println();
		int max = maxlen[0];
		for(int temp: maxlen)
			max = Math.max(max, temp);
		
		return max;
	}
}
