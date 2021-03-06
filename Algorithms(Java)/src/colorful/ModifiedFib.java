package colorful;

public class ModifiedFib {

	private int MAX;
	private int MIN;
	public ModifiedFib(int min, int max)
	{
		this.MIN=min;
		this.MAX=max;
	}
	public void generateFib(int n1,int n2, String newNum)
	{
		int num=n1+n2;
		if(newNum.length()==0)
		{
			newNum=n1+""+n2+""+num;
			//newNum =n1+n2+num+"";
		} 
		else {
			newNum=newNum+num;
		}
		int value=Integer.parseInt(newNum);
		if(value>MAX)
		{
			return;
		}
		if(value>=MIN && value<=MAX)
			System.out.print(newNum+" ");
		generateFib(n2,num,newNum);
	}
	
	public static void main(String[] args) {
		ModifiedFib mFib=new ModifiedFib(1, 5000000);
		for(int i=1;i<500;i++)
		{
			//System.out.print("i: "+i);
			mFib.generateFib(i,i, "");
			System.out.println("-----");
		}
	}}
