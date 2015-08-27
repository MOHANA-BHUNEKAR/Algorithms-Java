package colorful;

public class NTicTacToe {

	static class Cell {
		int x;
		int y;
		char val;
		boolean visited;
	}

	private static int Xscore;
	private static int Oscore;

	private static Cell[][] board;

	private static int n;


	public static void main(String[] args) {

		n = 10;
		board = new Cell[n][n];

		Cell c;

		for(int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				c = new Cell();
				c.x = i;
				c.y = j;
				c.visited = false;

				if ( ((int)(Math.random()*10)) % 2 == 1)
					c.val = 'X';
				else
					c.val = 'O';

				board[i][j] = c;

				System.out.print(c.val + "\t");
			}
			System.out.println("");
		}
		
		
		Xscore = 0;
		Oscore = 0;

		findWinner();

		System.out.println("Xscore = " + Xscore);
		System.out.println("Oscore = " + Oscore);

	}

	public static void findWinner() {

		for(int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (!board[j][i].visited)
				{
					findNeighbors(i, j);
				}
			}			
		}

	}

	public static void findNeighbors(int x, int y) {

		for(int dx = -1; dx <=1; dx++)
		{
			for(int dy = -1; dy <=1; dy++)
			{	
				char _val = board[y][x].val;		
				if( isValid(x + dx, y + dy) && board[y +dy][x + dx].val == board[y][x].val && !(dx == 0 && dy ==0) )
					score( countPattern(_val, x, y, dx, dy), _val );
			}
		}

	}

	public static int countPattern(char _val, int x, int y, int dx, int dy) {

		int ctr = 0;

		while( isValid(x, y) && board[y][x].val == _val ) {
			ctr++;
			board[y][x].visited = true;
			x += dx;
			y += dy;
		}

		return ctr;

	}

	public static void score( int length, char _val ) {

		if( _val == 'X' ) {
			if( length >= 6 )
				Xscore += 3;
			else if( length >= 3 )
				Xscore += 1;
		}
		else {
			if( length >= 8 )
				Oscore += 3;
			else if( length >= 3 )
				Oscore += 1;
		}
	}

	public static boolean isValid(int x, int y) {
		return (x < n && x >= 0 && y < n && y >= 0);
	}		

}

