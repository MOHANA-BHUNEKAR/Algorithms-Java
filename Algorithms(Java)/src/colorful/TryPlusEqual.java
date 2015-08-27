package colorful;

public class TryPlusEqual {
	 public static int count = 0; 
	public static void main(String[] args) throws NumberFormatException{

		
		String f = "122032";
		int n = f.length()/2;
		System.out.println(n);
		for(int i=0;i<n;i++)
		for(int j=i+1;j<n+i+1;j++)
		{
		int num1 = Integer.parseInt(f.substring(0, i+1));
		int num2 = Integer.parseInt(f.substring(i+1, j+1));
		
		try
		{
		int num3 = Integer.parseInt(f.substring(j+1,f.length()));
		
		
		
		
		
		//System.out.println("num1 -- num2 -- num3  "+num1+" "+num2+"  "+num3);
		int temp = check(num1,num2,num3);
		if(temp == 0)
		continue;
		else
		break;
		}
		catch(NumberFormatException e)
		{
			//System.out.println("");
		}

		}
		System.out.println(count);
		}

	private static int check(int n1, int n2, int n3) {
		// TODO Auto-generated method stub
		count++;
		if(n1+n2==n3)
		{
		System.out.println(n1+"+"+n2+"="+n3);
		return 1;
		}
		else if(n2 + n3 == n1)
		{
		System.out.println(n2+"+"+n3+"="+n1);
		return 2;
		}
		else if(n1+n3==n2)
		{
		System.out.println(n1+"+"+n3+"="+n2);
		return 3;
		}
		else
		return 0; 	} 
	}


