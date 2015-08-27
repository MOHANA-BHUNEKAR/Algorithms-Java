package colorful;

public class CounterSpiral {

	public static void main(String[] args) {
		
		
		char a[][]= {
				   {'a','b','c','d'} ,
				   {'e','f','g','h'},
				   {'i','j','k','l'},
				   {'m','n','o','p'}
				};
		
		printSpiral(a);

	}

	private static void printSpiral(char [][] a) {

		int N=a.length;
		System.out.println("N: "+N);
		int T=0,B=N-1,L=0,R=N-1,dir=0;
		
		while(T<=B && L<=R)
		{
			
			if(dir==0)
			{
				for(int i=R;i>=L;i--)
					System.out.print(a[T][i]+"\t");
				
				System.out.println();

				T++;dir=1;				
			}
			
			if(dir==1)
			{
				for(int i=T;i<=B;i++)
					System.out.print(a[i][L]+"\t");
				System.out.println();

				L++;dir=2;				
			}
			
			if(dir==2)
			{
				for(int i=L;i<=R;i++)
					System.out.print(a[B][i]+"\t");
				
				System.out.println();

				B--;dir=3;				
			}
			
			if(dir==3)
			{
				//System.out.println("B: "+B);
				for(int i=B;i>=T;i--)
					System.out.print(a[i][R]+"\t");
				
				//System.out.println();

				R--;dir=0;				
			}
			
		
			
			
			
		}
	}

}
