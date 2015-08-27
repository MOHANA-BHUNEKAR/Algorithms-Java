package colorful;

import java.util.Scanner;

public class WellOrderedPassword {

	
	
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	       
	       System.out.print("Enter password length: ");
	       int  len = in.nextInt();
	       
	       printPasswords(len);
		
	}

	private static void printPasswords(int len) {
		
		long min = (long) Math.pow(10,len-1);
		long max = (long) Math.pow(10,len)-1;
		
		System.out.println("Min and Max: "+min +"  "+max);
		//int j;
		for(long i=min;i<=max;i++ )
		{
//			String num = String.valueOf(i);			
	//		j=0;
			
			//System.out.println("Retrieved num: "+num);
			/*while( (j+1)!= num.length() && num.charAt(j)<num.charAt(j+1) )
			{
				
				j++;
			       if(j+1== num.length())
			      System.out.println(num);
			       
			}
			*/
			
			
			char [] ch = String.valueOf(i).toCharArray();
			
			for(int j=0;j<ch.length-1;j++)
				
			{
				if(!(ch[j+1]>ch[j]))
				{
					
					break;
				}
					
				if(j==ch.length-2)
					System.out.println(i);
				
				
			}
			
		}

		
	}
}
