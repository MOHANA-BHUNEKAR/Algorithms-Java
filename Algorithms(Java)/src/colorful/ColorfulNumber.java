package colorful;

import java.util.HashSet;
import java.util.Set;

public class ColorfulNumber {

	
	public static void main(String[] args) {
		   System.out.println(isColorful(32455));
		   System.out.println(isColorful(326));
		}
		
		static boolean isColorful(int number){
			
			Set<Integer> s = new HashSet<Integer>();
			String num = number+"";
			int[] digits = new int[num.length()];
			for(int i=0;i<num.length();i++){
				digits[i]=Integer.parseInt(num.charAt(i)+"");
				s.add(digits[i]);
			}
			
			for(int i=2;i<num.length();i++){
				for(int j=0;j<digits.length-i+1;j++){
					int tempi=i;
					int tempj=j;
					int product=1;
					while(tempi>0){
						product*=digits[tempj++];
						tempi--;
					}
					if(s.add(product)==false){
						return false;
					}
				}
			}
			
			
			return true;
		}

	
}
