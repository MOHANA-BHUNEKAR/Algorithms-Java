package colorful;

public class NumberPermutation {
	
	
	public static void main(String[] args) {		
		print("", "0123456789", 4);
	}
	
	private static void print(String res, String digits, int n) {
		if (n == 0)
			System.out.println(res);
		
		else
		{
		//System.out.println("N: "+n);
		for (int i = 0; i < digits.length(); ++i) {
		//	print(res + digits.charAt(i),digits.replace(String.valueOf(digits.charAt(i)), ""),n - 1);
			print(res + digits.charAt(i),digits,n-1); //includes duplicates
		//	System.out.println("N: "+n);

		}
		}
	}
}
