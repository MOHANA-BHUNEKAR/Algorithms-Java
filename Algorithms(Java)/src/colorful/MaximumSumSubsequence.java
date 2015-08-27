package colorful;

public class MaximumSumSubsequence {

	public static void main(String[] args) {

		
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -8,4,-1,-2,1,3};
		
		int sum = maxSumSubsequence(a);
		
		System.out.println(sum);
		
	}

	private static int maxSumSubsequence(int[] a) {

		
		int sum=0,ans=0,start=0,end=0,count=0;
		for(int i=0;i<a.length;i++)
		{
			if(sum+a[i]>0)
			{
				if(count==0)
				start=i;
				count=1;
				sum=sum+a[i];
				
				System.out.println("sum---"+sum);
			}
			
			else
			{
				sum=0;
				count=0;
			}
			
			if(ans>sum)
			{
				end=i-1;
				ans=ans;
			}
			
			else
			{
				ans=sum;
			}
		//	ans=Math.max(ans, sum);
					
			System.out.println("---------------ans: "+ans);
			
		}
		
		System.out.println("[ "+start+"-"+end+" ]");
		return ans;
		
		
	}

}
