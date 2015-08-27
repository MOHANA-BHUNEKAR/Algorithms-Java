package colorful;

public class PrintSequence {

	public static void main(String[] args) {

		

		//output: 6789;123;56;0123;56
		PrintSequence("4678912385156012356");
		
	}

	private static void PrintSequence(String S) {

		char [] ch = S.toCharArray();
		int count=0;
		for(int i=0;i<ch.length-1;i++)
		{
			//count=0;
			if(ch[i] == ch[i+1]-1)
			{
				System.out.print(ch[i]);
				count=1;
				
				if(i==ch.length-2)
					System.out.print(ch[i+1]);// just print not println

			}
			else
			{
				if(count==1 )
				{
					System.out.print(ch[i]);
					System.out.print(";");
					count=0;
				}
				
				
			}
			
			
			
			
			
		}
		
	}

}
