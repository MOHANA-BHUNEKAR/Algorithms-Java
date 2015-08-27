package colorful;

public class Encryption {

	
	public static void main(String [] args)
	{
		
		String enc = encrypt("AbcZK",6);
		
		System.out.println("Encrypted : "+enc);
		
		
	}

	private static String encrypt(String input,int n) {
		
		StringBuilder result = new StringBuilder();
		
		for(int i=0;i<input.length();i++)
		{
			
			char ch= input.charAt(i);
			
			if(ch>='A' && ch <='Z')
			{
				int x=  ((ch-64)*n)%26;
				
				System.out.println(x);
				result.append(x);
			}
			
			else
			{			
			result.append(ch);
			}
		}

		
		
		return result.toString();
	}
}
