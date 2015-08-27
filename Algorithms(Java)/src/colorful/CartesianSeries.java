package colorful;

import java.util.Scanner;

public class CartesianSeries {
	
	
	 public static void main(String args[])
	    {
	    			    
	       Scanner in = new Scanner(System.in);
	       
	       System.out.print("Enter a number: ");
	       int  num = in.nextInt(), count=0;
	       
	       int p=num;
	       while(p!=0)
	       {
	    	   p=p/10;
	    	   count++;  	    	   
	       }
	       
 String []  s1 = {null,"vtfrq","ftk","wzbg","rs",null,"fir","p","lo","p"};
 
          printt("",s1,Integer.toString(num),count);

	    
	    }

	private static void printt(String result, String[] s1, String num, int count) {
		
		
		if(count==0)
			System.out.println(result);
		
		else
		{
			
		int x = Integer.parseInt(num.charAt(0)+"");
		
		String digit = s1[x];
		
		if(digit != null) {
		
		for (int j=0;j<digit.length();j++)
		{
			printt(result+digit.charAt(j),s1,num.substring(1,num.length()),count-1);		
			
		}
			
		}	
		
		else
		{
			
	printt(result,s1,num.substring(1,num.length()),count-1);		

			
		}
			
		}
		
	}

}
