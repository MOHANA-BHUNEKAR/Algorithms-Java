package colorful;

public class PrintSeries {

	
	
	public static void main(String[] args)
	{
		
		String[] series=new String[10];
		String s="1";
		System.out.println(s);
		for (int i=0;i<10;i++)
		{
		series[i]= printSeries(s);
		s=series[i];
		System.out.println(""+s);
		}
		
		
		
	}

	private static String printSeries(String str) {
		
		
			
			StringBuilder sb= new StringBuilder();
			int len=str.length();
			int count=1;

			for(int i=0;i<len;i++)
			{
				int c= str.charAt(i);
				c=c-48;
			
			while(((i+1)<str.length()) && str.charAt(i)==str.charAt(i+1))
			{
				
				i++;
				count++;
				
			}
			
			sb.append(count).append(c);
			
			count=1;
			}
			
			return sb.toString();
			
		}

		
		
		
	}

