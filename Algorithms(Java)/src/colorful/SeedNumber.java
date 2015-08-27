package colorful;

public class SeedNumber {
	
	public static void FindSeedNumber(int n)
	{
		
		
		for(int i=1;i<=n/2;i++)
		{
			
			if(n%i==0)
			{
				int temp=i,p=0,result=1;
				
				while(temp!=0)
				{
				  p=temp%10;
				  result*=p;
				  temp=temp/10;
				}
				result= result*i;
				
				if(result==n)
				{
					
					System.out.println("Seed number of "+n+" is "+i);
				}
				
			}
			
			
		}
	}
	
	
	public static void main(String[] args)
	{
		FindSeedNumber(738);
		
	}

}
