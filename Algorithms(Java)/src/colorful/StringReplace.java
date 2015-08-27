package colorful;

public class StringReplace {

	public static void main(String[] args) {

		String s="a quick braown fox jumpaed over a bridge on a box";
		
		String s1[] = s.split(" a | A |A |a " );
        int count=0;
		String result="";
		
	//	System.out.println(s.substring(0, 1));
		/*if(s.charAt(0)=='A'|| s.charAt(0) == 'a')
		{
        System.out.print("the ");         
		}*/
		
		for(int j=0;j<s1.length;j++)
		{
			
					if( j==0)
				result = result+s1[j]+"the ";
					else
			result = result+s1[j]+" the ";
					//count++;
			
			//System.out.println("--->"+result+" s1[j]  "+s1[j]);

		}
		
		System.out.println(result);
		int j= -15%10;
		System.out.println(j);
	}

}
