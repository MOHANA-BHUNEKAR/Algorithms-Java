package colorful;

public class SubstringAddition1 {
	
	public static void main(String[] args) {
		
		int [] arr = {1, 7, 6, 3, 5, 8,9};
		int sum = 16;
		SubAdd(arr,sum);
	}

	private static void SubAdd(int[] arr, int sum) {

	    int count=0;	
		for(int i=0;i<arr.length;i++)
		{
			int sumarr=0;
			for(int j=i;j<arr.length;j++)
			{
				sumarr=sumarr+arr[j];
				
				if(sumarr== sum)
				{
					System.out.println("[ "+i+" - "+j+" ]");
					count++;
				}
				
				else
				{
					if(sumarr>sum)
						break;
				}
				
				
			}
			
			
		}
		
		if(count==0)		
		System.out.println("Not found");
	}

}
