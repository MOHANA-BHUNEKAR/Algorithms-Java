package colorful;

public class IncreasingSequences {
	
	public static int temp1, temp2 = 0;
	public static int seq[]= {5,4,7,8,2,3,6,9,8,6,2,3,4,5};
	
	public static void main(String[] args) 
	{
		for(int i=1;i<seq.length;i++)
		{
			
			temp1 = seq[i-1];
			temp2 = seq[i];
			if (temp1<= temp2)
			{
				System.out.print(seq[i-1]+" ");
				if(i == seq.length-1) System.out.print(seq[i]);
			}
			else
			{
				System.out.print(seq[i-1]+" ");
				System.out.print("; ");
				if(i == seq.length-1) System.out.print(seq[i]);
			}
					
		}
		
	}

}
