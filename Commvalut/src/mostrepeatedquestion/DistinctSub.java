package mostrepeatedquestion;

public class DistinctSub {
	public static void main(String[] args) {
		String s = "rabbbit",t = "rabbit";
		int result = distinct(s,t);
		System.out.println(result);
		result = distinct("babgbag","bag");
		System.out.println(result);
	}

	private static int distinct(String s, String t) {
		int m = s.length(),n = t.length();
		int dp[][] = new int[m+1][n+1];
		for(int i=0;i<=m;i++) {
			dp[i][0] = 1;
		}
		
		for(int i=1;i<=m;i++)
		{
			for(int j=1;j<=n;j++)
			{
				//i =1,j = 1  0    0
				if(s.charAt(i-1)==t.charAt(j-1))
				{
					dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
				}
				else
				{
					dp[i][j] = dp[i-1][j];
				}
					
			}
		}
		for(int[] temp : dp)
		{
			for(int temp2: temp)
				System.out.print(temp2 +" ");
			System.out.println();
		}
		return dp[m][n];
	}
}
