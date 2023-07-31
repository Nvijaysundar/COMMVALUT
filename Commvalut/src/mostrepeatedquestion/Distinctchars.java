package mostrepeatedquestion;
import java.util.*;
public class Distinctchars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for(int i = 0;i<t;i++)
		{
			System.out.println("Enter a String");
			String str = sc.nextLine();
			System.out.println("Enter Distinct count");
			int k = Integer.parseInt(sc.nextLine());
			
			int result = counterdistinct(str,k);
			System.out.println(result);
		}
		
	}
	private static int counterdistinct(String str, int k) {
		int n = str.length();
		int count =0;
		for(int i = 0;i<n;i++)
		{
			Map<Character,Integer> freqmap = new HashMap<>();
			int distictcount = 0;
			for(int j=i;j<n;j++)
			{
				char ch = str.charAt(j);
				freqmap.put(ch, freqmap.getOrDefault(ch,0)+1);
				if(freqmap.get(ch)==1)
					distictcount++;
				if(distictcount==k && checkcount(freqmap))
					count++;
				else if (distictcount>k)
					break;
				System.out.println(freqmap.toString());
			}
		}
		return count;
	}
	private static boolean checkcount(Map<Character, Integer> freqmap) {
		for(Character temp:freqmap.keySet())
		{
			if(freqmap.get(temp)>1)
				return false;
		}
		return true;
	}
}
