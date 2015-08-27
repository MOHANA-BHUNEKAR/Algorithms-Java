package colorful;

import java.util.ArrayList;
import java.util.List;

public class ColorfulNum {

	public static void main(String[] args) {

		
		if(isColorful(3245))
		System.out.println("colorful");
	}
	
	
	public static boolean isColorful(int number){
		if(number < 10) return true;
		
		String colorString = String.valueOf(number);
		int length = colorString.length();
		
		List<Integer> colorMap = new ArrayList<Integer>();
		
		for(int i =  1; i < length; i++){
			for (int j = 0;  j+i <= length; j++){
				
			//	String s=String.valueOf(j+i);
			//	System.out.println(" j and j+1 "+j+"  "+s);
				String sub = colorString.substring(j, j+i);
				int product = getProduct(Integer.parseInt(sub));
				if(colorMap.contains(product)) return false;
				else{
					colorMap.add(product);
				}
			}
		}
		return true;
	}

	private static int getProduct(int digits) {
		if(digits < 10) return digits;
		int num = digits;
		int product = 1;
		while(num > 0){
			product = product * (num % 10);
			num = num / 10;
		}
		return product;
	}

}
