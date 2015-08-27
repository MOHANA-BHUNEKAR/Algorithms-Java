package colorful;

import java.util.Arrays;

public class StringTrans2 {
	
	public static void main(String[] args) {
		
		char[] ch1 = "TEHUNOOL".toCharArray();
		char[] ch2= "ONLEHTUO".toCharArray();
		
		transpose(ch1,ch2);

		
	}

	private static void transpose(char[] s1, char[] s2) {

		
		int j=0,i=s1.length-1;
		
		while(j<s2.length)
		{
			//System.out.println("Match found i & j are: "+i+" "+j);

			if(s1[j] == s2[j])
			{
				
				System.out.println("----Match found i & j are: "+i+" "+j);
				j++;
				i=s1.length-1;
				
			}
			
			else
			{
				if(i>j)
				{
					System.out.println("Match found i & j before: "+i+" "+j);

					char temp = s1[i];
					s1[i]=s1[i-1];
					s1[i-1]=temp;
					
					System.out.println("s1[i-1] & s1[i]: "+s1[i-1]+"  "+s1[i]);

					i--;
					System.out.println("Match found i & j after: "+i+" "+j);
					System.out.println("s1[j] and s2[j]: "+s1[j]+" "+s2[j]);
					

				}
				
			}
		}
		
		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s2));
	}

	
	
}
