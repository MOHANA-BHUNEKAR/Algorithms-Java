package colorful;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Seriestillzero {

	
	public static void main( String[] args)
	{
		
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		     String input="",num="";
		     int count=0;
		     
		     while(!num.equals("0"))
		     {
		    	 System.out.println("Enter number ");
			     num = sc.next();
		    	 if(count==0)
		    	 {
		    		 input=num;
		    		 count++;
		    	 }
		    	 else
		    	 {
		    	 input = input+":"+num;

		    	 }
		     }
		     
		     System.out.println("INPUT: "+input);
		     String [] sequence= input.split(":");
		
	}
}
