package colorful;

public class PrintContinuousSeries {

	public static void main(String[] args) {
		
		
		char [] ch= "aBCdEfljdflsjflmnopflsjflasjftuvwxyz".toLowerCase().toCharArray();
		
		print(ch);

		
		
		
	}

	private static void print(char[] ch) {

		String res="";int count=0;
		
		for(int i=0;i<ch.length;i++)
		{
			boolean b= false; 
			while( (i+1)<ch.length && ch[i]== ch[i+1]-1)
			{
				res = res+ch[i];
				i++;
				b=true;
			}
			if(b)
			{
			count++;	
			res=res+ch[i]+";";
			}
		}
		
		
		
		System.out.println(res.substring(0, res.length()-1));

		
		
	}

}
