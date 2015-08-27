package colorful;

public class FinndWord {

	public static void main(String[] args) {

		
		char [][] mat = {
				{'h','e','o','w'},
				{'h','x','o','w'},
				{'h','e','y','w'},
				{'h','e','o','w'}
				};
		
		boolean b=findWord(mat,"he");
		System.out.println(b);

	}

	private static boolean findWord(char[][] mat, String word) {

		
		StringBuilder [] rows = new StringBuilder[mat.length];
		
		StringBuilder [] cols = new StringBuilder[mat.length];

		for(int i=0;i<mat.length;i++)
		{
		rows[i]=new StringBuilder("");	
			for(int j=0;j<mat.length;j++)
			{

				rows[i].append(mat[i][j]+"");
				
			}
			
			System.out.println(rows[i]);
			
		}
		
		for(int i=0;i<mat.length;i++)
		{
		cols[i]=new StringBuilder("");	
			for(int j=0;j<mat.length;j++)
			{

				cols[i].append(mat[j][i]+"");
				
			}
			
			System.out.println(cols[i]);
			
		}
		
		for(int i=0;i<rows.length;i++)
		{
			
			if(rows[i].toString().contains(word))
			{
				
				System.out.println("Matched");
				return true;
			}
			
		}
		
		return false;
	}

}
