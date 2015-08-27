package colorful;

import java.io.InputStreamReader;
import java.util.Scanner;

public class PhoneNumberNew {

	public static void main(String[] args) {

		
		int n1,n2,n3,len;
		Scanner sc = new Scanner( new InputStreamReader(System.in));
		System.out.println(" Enter the 3 disallowed digits: ");
		n1= sc.nextInt();
		n2= sc.nextInt();
		n3= sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<10;i++)
		{
			if( !(i==n1 || i==n2 || i==n3))
			{
				sb.append(i);
				
			}
		}
		
		System.out.println("Enter the lenght of phone number you wish: ");
		len= sc.nextInt();
		
		System.out.println("Digits: "+sb.toString());
		
		findPermutation("",sb.toString(),len);

		
		
		

	}

	private static void findPermutation(String result, String digits, int len) {

		if(len == 0)
		{
			String num = result;
			
			if(!hasAdjecentdigits(num))
			{
				
				//System.out.println("------");
			System.out.println(num);
			}
			
		}
		
		else
		{
			
			for(int i=0;i<digits.length();i++)
			{
				
				findPermutation(result+digits.charAt(i),digits,len-1);
			}
			
			
		}
		
		
	}

	private static boolean hasAdjecentdigits(String num) {
		
		char[] ch = num.toCharArray();
		
		//System.out.println("Number: "+num);
		
		if(num.contains("4"))
		{
			if((num.charAt(0)!='4'))
			{
				
				//System.out.println("--"+num);

				return true;
				
			}
			
			
			
		}
		
		for(int i=0;i<ch.length-1;i++)
		{
			if(ch[i]==ch[i+1])
			{
				//System.out.println("Number: ch[i] and ch[i+1] "+num+" "+ch[i]+" "+ch[i+1]);

				//System.out.println("Reached");
				return true;
			}
			
		}
		
		return false;
	}

}
