package colorful;

public class LookAndSaySequence {

	public static void main(String[] args) {

		String result="1",j="";
		
       for(int i=0;i<10;i++)
       {
    	   j=result;
    	   
    	   System.out.println(j);
    	   result = LookAndSay(j);
    	   
    	   
       }
		
		
	}

	private static String LookAndSay(String num) {
		
		StringBuilder sb = new StringBuilder();
		int count;
		for(int i=0;i<num.length();i++ )
		{
			count=1;
			
			
			while((i+1)<num.length() && num.charAt(i+1)== num.charAt(i) )
			{
				count++;
				i++;		
				
				
					}
			
			sb.append(count).append(num.charAt(i));
		}
		
		return sb.toString();
	}

}
