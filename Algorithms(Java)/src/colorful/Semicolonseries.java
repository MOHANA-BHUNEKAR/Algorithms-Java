package colorful;

public class Semicolonseries {

	public static void main(String[] args) {

		
		String s="AbcDefljdflsjflmnopflsjflasjftuvWxYz";
		s=s.toLowerCase();
		int i=0,count=0;
		for(i=0;i<s.length()-1;i++)
		{
			char ch1=s.charAt(i);
			char ch2=s.charAt(i+1);
			
			if(ch1==ch2-1)
			{
				
				count=1;
				System.out.print(ch1);
			}
			
			else 
			{
				
				if(count==1 )
				{
					
					System.out.print(ch1);
					System.out.print(";");
					count=0;
				}
			}
			
		}
		
		if(s.charAt(i)==s.charAt(i-1)+1)
		{
			System.out.println(s.charAt(i));
		}
		}
		
	}


