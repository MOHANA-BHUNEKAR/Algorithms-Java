package colorful;

public class StringPermute {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		
		for(int i=65;i<91;i++)
		{
			char ch =(char) i;
			sb.append((ch));
		}
		for(int i=97;i<123;i++)
		{
			char ch =(char) i;
			sb.append((ch));
		}
System.out.println(sb.toString());		
		print("",sb.toString(), 4);

	}

	private static void print(String result, String input, int n) {

		if( n==0)
		{
			if(isWellOrdered(result))
			{
			System.out.println(result);
			}
		}
		
		else
		{
			for(int i=0;i<input.length();i++)
			{
				
				print(result+input.charAt(i),input,n-1);
			}
			
		}
		
	}

	private static boolean isWellOrdered(String result) {

		result= result.toUpperCase();
		for(int i=0;i<result.length()-1;i++)
		{
			if(!(result.charAt(i+1)>result.charAt(i)))
			{
				return false;
				
			}
			
		}
		return true;
	}

}
