package mostrepeatedquestion;
import java.util.*;
public class Slidingmax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t--!=0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
			{	
				arr[i] = sc.nextInt();
			}
			List<Integer> result = Slidemax(arr,k);
			System.out.println(result.toString());
		}
	}
	private static List<Integer> Slidemax(int[] arr, int k) {
		int n = arr.length;
		List<Integer> result = new ArrayList<Integer>();
		int max = get_max(arr,0,k-1);
		result.add(max);
		for(int i=1;i<n-k+1;i++)
		{
			if (arr[i-1]==max)
			{
				max = get_max(arr,i,i+k-1);
			}
			else
			{
				max = Math.max(max,arr[i+k-1]);
			}
			result.add(max);
		}
		
		return result;
	}

	private static int get_max(int[] arr, int i, int j) {
		int max = arr[i];
		for(int k=i+1;k<=j;k++)
		{
			max = Math.max(max, arr[k]);
		}
		return max;
	}

}
