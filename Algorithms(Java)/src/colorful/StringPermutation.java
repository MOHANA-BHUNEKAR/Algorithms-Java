package colorful;

public class StringPermutation {

	public static void main(String[] args) {

		 char[] input = { 'q', '1', 'e','R','z','p'};
		 
		 int count=0;
		 for(int i=0;i<input.length;i++)
		 {
			 
			if (input[i]>=97 && input[i]<=123)
			{
				
				count++;
				
			}
			 
			 
		 }
		 
		 System.out.println("count: "+count);
		 
		 int[]  arr1= new int[count];
		 char[] arr2= new char[count];
		 
		 for(int i=0,j=0;i<input.length;i++)
		 {
			 
			if (input[i]>=97 && input[i]<=123)
			{
				
               arr1[j]= i;  // store indices
               arr2[j]= input[i]; // store value at that index
                
              System.out.println("index and value: "+arr1[j]+"  "+arr2[j]); 
              j++;
                
			}
			 
			 
		 }

		 
		 
		    permute(arr2, 0,arr2.length-1,arr1,input);
		
		
	}

	private static void permute(char[] arr2, int k, int n,int[] arr1,char[] input) {
		
		if(k==n)
		{
			printArray(input,arr1,arr2);
		}
		
		else
		{
			for(int i=k;i<=n;i++)
			{
             char temp= arr2[i];
             arr2[i]=arr2[k];
             arr2[k]=temp;	
             
             permute(arr2,k+1,n,arr1,input);
             
             char temp1= arr2[i];
             arr2[i]=arr2[k];
             arr2[k]=temp1;	

           
				
				
			}
			
		}

		
		
	}

	

	private static void printArray(char[] input,int[] arr1,char[] arr2) {

		for (int i = 0,j=0; i < input.length; i++) {
			
			if(arr1[j]==i)
			{
		        System.out.print(arr2[j] + ";  ");
		        j++;
			}
			else	
			{
	        System.out.print(input[i] + ";  ");
			}
	    }
	    System.out.println();
	}

}
