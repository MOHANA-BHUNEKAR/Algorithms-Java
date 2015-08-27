package colorful;

public class StringPermute1 {

	public static void main(String[] args) {

		 char[] input = { 'q', 'e','z','p'};
           
		 permute(input,0,input.length-1);
	}

	private static void permute(char[] input, int k, int n) {

		
		if(k==n)
		{
			
			for(int i=0;i<input.length;i++)
			{
				System.out.print(input[i]);				
			}
			
			System.out.println();
			//return;			
		}
		
		else
		{
								
			for(int i=k;i<=n;i++)
			{
				char temp = input[k];
				input[k]=input[i];
				input[i]=temp;
				
				permute(input,k+1,n);
				
				char temp1 = input[k];
				input[k]=input[i];
				input[i]=temp1;
				
				
			}
			
			
		}
		
		
	}

}
