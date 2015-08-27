package colorful;

public class MountainPoint {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix =
				
			{
				{1,2,3,4,5},
			    {4,7,6,3,5},
				{5,6,4,8,4},
				{3,4,5,6,2},
				{3,4,56,4,5}
				
			};
		
		
		PrintMountainPoint(matrix);
	}
	
	public static void PrintMountainPoint(int[][] matrix) {
		// start from the second element in the second row
		for (int i = 1; i < matrix.length - 1; i++) {
			for (int j = 1; j < matrix[0].length - 1; j++) {
			     if (matrix[i][j] > matrix[i - 1][j - 1]
				        && matrix[i][j] > matrix[i - 1][j]
				        && matrix[i][j] > matrix[i - 1][j + 1]
				        && matrix[i][j] > matrix[i][j - 1]
                        && matrix[i][j] > matrix[i][j + 1]
				        && matrix[i][j] > matrix[i + 1][j - 1]
				        && matrix[i][j] > matrix[i + 1][j]
				        && matrix[i][j] > matrix[i + 1][j + 1]) {
                    System.out.println("(" + i + "," + j + ")");
                    j++; //skip the next column
                 }	
            }
        }

}}
