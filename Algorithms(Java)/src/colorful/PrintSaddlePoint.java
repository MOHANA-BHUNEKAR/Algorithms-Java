package colorful;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class PrintSaddlePoint {

	public static void main(String[] args) {

		
		int input[][] = { 
				{ 2, 3, 1}, 
				{ 4, 5, 6}, 
				{ 9, 8, 9 },
		};
		
		printSaddlePoint(input);
	}

	private static void printSaddlePoint(int[][] input) {

		int nrows = input.length;
		int ncols= input[0].length;
		
		int[] maxrows = new int[nrows];
		int[] mincols = new int[ncols];

		int col=0;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		for(int i=0;i<nrows;i++)
		{
			maxrows[i]=input[i][0];
			for(int j=1;j<ncols;j++)
			{
				if(input[i][j]>maxrows[i])
				{
					maxrows[i]=input[i][j];
					col=j;
				}
				
			}
			System.out.println("Max-Rows: "+maxrows[i]+" "+col);

			hm.put(maxrows[i], col);		
			
		}
		
		
		for(int i=0;i<ncols;i++)
		{
			mincols[i]=input[0][i];
			for(int j=0;j<nrows;j++)
			{
				if(input[i][j]<mincols[i])
				{
					mincols[i]=input[i][j];	
				}
			}
			
			System.out.println("Min cols: "+mincols[i]);
		}
		
		
		for(int i=0;i<maxrows.length;i++)
		     {
			int key= maxrows[i];
			int colvalue= hm.get(key);
			if(key== mincols[colvalue])
			{
				System.out.println(key);
				
			}
		     }
		
	}

}
