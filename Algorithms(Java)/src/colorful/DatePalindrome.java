package colorful;

public class DatePalindrome {

	public static void main(String[] args) {
		
		genpalindromDate();
	}
		
		public static void genpalindromDate()
		{
		char date[]= new char[9];
		int numofMon[] = { 31,28, 31,30, 31, 30, 31, 31,30, 31, 30, 31};

		for ( int m = 1 ; m <= 12 ; m++)
		for ( int d = 1 ; d <= numofMon[m-1] ; d++)
		for ( int y = 0 ; y <= 2001 ; y++)
		{ 
		String mm,dd,yy;
			if(m<10)
			mm="0"+m;
			else
				mm=String.valueOf(m);
			
			if(d<10)
				dd="0"+d;
			else
				dd=String.valueOf(d);
			if(y<10)
				yy="000"+y;
			else if(y>9 && y<100)
				yy="00"+y;
			else if(y>99 && y<1000)
				yy="0"+y;
			else
				yy=String.valueOf(y);
			
			StringBuilder sb=new StringBuilder(yy);
			sb.reverse();
			if((mm+dd).equalsIgnoreCase(sb.toString()))
				System.out.println("Its palindrome data: "+mm+dd+yy);
			
			
				
			
		}
	}

}
