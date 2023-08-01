package mostrepeatedquestion;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Disticsubseq {
	public static void main(String[] args) {
		String s = "rabbbit",t = "rabbit";
		int result = distinctsub(s,t);
		System.out.println(result);
	}

	private static int distinctsub(String s, String t) {
		LinkedHashMap<String,Integer> memo = new LinkedHashMap<String,Integer>();
		int res =  countdis(s,t,s.length(),t.length(),memo);
		return res;
	}

	private static int countdis(String s, String t, int m, int n, HashMap<String, Integer> memo) {
		if (n==0)
			return 1;
		
		if(m==0)
			return 0;
		
		String key = s.charAt(m-1)+"-"+s.charAt(n-1);
		if(memo.containsKey(key))
			return memo.get(key);
		int result;
		if(s.charAt(m-1) == t.charAt(n-1)) //m = 7 n = 6
			result = countdis(s,t,m-1,n-1,memo)+countdis(s,t,m-1,n,memo);
		else
			result = countdis(s,t,m-1,n,memo);
		
		memo.put(key, result);
		for(String temp: memo.keySet())
		{
			System.out.println(temp +" "+memo.get(temp));
		}
		System.out.println();
		return result;
	}
}
