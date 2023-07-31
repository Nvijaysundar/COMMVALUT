package mostrepeatedquestion;

import java.util.Scanner;

public class MaxSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int j=0;j<n;j++)
				arr[j] = sc.nextInt();
			System.out.println(result(arr));
		}
	}

	private static int result(int[] arr) {
		int curr_sum=0,max=0;
		for(int temp:arr)
			if(temp>-1)
			{
				curr_sum += temp;
			}
			else
			{
				if(max<curr_sum) 
					max = curr_sum;
				curr_sum=0;
			}
		if(max<curr_sum)
			max = curr_sum;
		return max;
	}
}
