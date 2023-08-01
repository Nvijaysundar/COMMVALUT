package mostrepeatedquestion;
public class Wordfinder {
	public static void main(String[] args) {
		char[][] board = {
				  {'A', 'B', 'C', 'E'},
				  {'S', 'F', 'C', 'S'},
				  {'A', 'D', 'E', 'E'}
				};
		
		String word = "ABCEE";
		boolean result = exists(board,word);
		System.out.println(result);
	}

	private static boolean exists(char[][] board, String word) {
		int row = board.length,col = board[0].length;
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
			{
				if(travel(board,word,i,j,0))
					return true;
			}
		return false;
	}

	private static boolean travel(char[][] board, String word, 
			int i, int j, int index) {
		int row = board.length,col = board[0].length;
		if(index == word.length())
			return true;
		if(i<0 || i>=row || j<0 || j>=col || board[i][j]!=word.charAt(index))
			return false;
		
		char temp = board[i][j];
		board[i][j] = '#';
		boolean result = travel(board,word,i-1,j,index+1)||
						travel(board,word,i+1,j,index+1)||
						travel(board,word,i,j-1,index+1)||
						travel(board,word,i,j+1,index+1);
		
		board[i][j] = temp;
		return result;
	}
}
