package colorful;

public class SecurityKey {

	public static void main(String[] args) {

		
		String code = "12646";
		String codeentered = "1";
		
		String temp="";
		
		int i=0,j=0;
		
		for( i=0;i<code.length();i++)
		{
			
			if( (j<codeentered.length() && code.charAt(i)== codeentered.charAt(j)))
			{
				j++;
				temp=temp+code.charAt(i);
				
			}
			
			else
			{
				temp=temp+code.charAt(i);

			}
			
			
			
		}
		
		if(j==codeentered.length())
		{
			System.out.println("Sucess");
		}
		
		else
		{
			System.out.println(" Access denied");
		}
	}

}
