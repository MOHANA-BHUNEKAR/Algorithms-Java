package colorful;

import java.util.ArrayList;
import java.util.HashMap;

public class CowsAndBullsGame {

	public static int[] getBullsAndCows(String A, String B) {
		int bulls = 0;
		int cows = 0;
		HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
		A = A.toLowerCase();
		B = B.toLowerCase();
		for(int i=0; i<A.length(); i++) {
			int a = A.charAt(i);
			System.out.println("---"+a);
			if(!hm.containsKey(a)) {
				ArrayList<Integer> array = new ArrayList<Integer>();
				array.add(i);
				hm.put(a, array);
			}
			else {
				System.out.println("++++"+ hm.get(a));
				ArrayList<Integer> array = hm.get(a);
				array.add(i);
				hm.put(a, array);
			}
		}
		for(int i=0; i<B.length(); i++) {
			int b = B.charAt(i);
			if(hm.containsKey(b)) {
				ArrayList<Integer> array = hm.get(b);
				if(array.contains(i)) {
					bulls++;
				}
				else {
					cows++;
				}
			}
		}
		int res[] = new int[2];
		res[0] = bulls;
		res[1] = cows;
		return res;
	}
	public static void main(String args[]) {
		int array[] = getBullsAndCows("Foooooooorum", "fooooooour");
		System.out.println("Bulls = " + array[0] + "," + "Cows =" + array[1]);
	}
}
