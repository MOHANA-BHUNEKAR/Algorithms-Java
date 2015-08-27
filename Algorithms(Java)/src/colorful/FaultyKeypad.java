package colorful;

public class FaultyKeypad {

	public static void main(String[] args) {

		if( matchPasword("18684","1"))
			System.out.println("Matched");
		else
		System.out.println("failed");
		
	}

	private static boolean matchPasword(String actual, String entered) {
		
		String enteredpwd = entered;
		if(entered.length()> actual.length())
			return false;
		
		if(actual.equals(entered))
		return true;
		
		// Identify first mismatch
		
		for(int i=0; i<entered.length();i++)
		{
			char ac = actual.charAt(i);
			char en = entered.charAt(i);
			System.out.println("ac and en: "+ac+" "+en);
			if( ac != en)
			{
				// Now check whether that entered char is in actual char
				for(int j=0;j<actual.length();j++)
				{
					
					if(en == actual.charAt(j))
					{
						System.out.println("entered here");
						
						String new1= actual.replaceAll(ac+"","");
						System.out.println("new1: "+new1);
						System.out.println("entered pwd: "+entered);
						if(new1.equals(enteredpwd))
						{
							System.out.println("Match----");
							return true;
						
						}
					}
				}
				
			}
			
			
		}
		

		
		
		return false;
	}

}
