package colorful;

public class Prev2Sum {
	
	
	public static void main(String [] args)
	{
	printvalues(11,99999);
	}

	private static void printvalues(int min, int max) {
		
		
		for (int i=min;i<max;i++)
		{
			
			int p=i,count=0;
			
			while(p!=0)
			{
				
			count++;
			p=p/10;
				
			}
			p=i;
			int [] iarr = new int[count];
			//System.out.println(p+"-->");

			for(int j=count-1;j>=0 ;j--)
			{

				if(p!=0)
				{
				iarr[j]= p%10;
				//System.out.print(iarr[j]);

				p=p/10;
				}
				
			}
			//System.out.println();
			

			if(iarr[0]== iarr[1])
			{
		
			
		//	System.out.println("Matched are: "+i);
			for (int k=2;k<iarr.length;k++)
			{
				
			//System.out.println("firsr two match:i and k are "+i+" "+k);

					if(iarr[k]==iarr[k-1]+iarr[k-2])
					{
						
						//System.out.println("Inner match "+i);

						if(k==iarr.length-1)
						{
							System.out.println("finally: "+i);
							
							
						}
						
					}
					
					else
					{
						break;
					}
					
				}
				
			}}
			
			
			
			
			
		}
		
		
		
	}


