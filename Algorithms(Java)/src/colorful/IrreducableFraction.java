package colorful;

public class IrreducableFraction {

	public static String getIrreducibleFraction(double num)
	{
		int n = (int) (num * 10000);
		int d = 10000;
         System.out.println(" n and d values are: "+n+ " "+d);
		// get greatest common divisior
		int gcd = getGCD(n, d);
		System.out.println("GCD: "+gcd);

		return ((n / gcd) + "/" + (d / gcd));
	}

	private static int getGCD(int a, int b)
	{
		if (a == 0)
			return b;

		while (a != b)
		{
			if (a > b)
				a = a - b;
			else if (b > a)
				b = b - a;
			else
				return a;
		}
		return a;
	}

	public static void main(String args[])
	{
		System.out.println(getIrreducibleFraction(0.3500));
	}
	
}
