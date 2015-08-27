package colorful;

import java.util.LinkedList;
import java.util.Queue;

public class ChineseFormat {
	
	public static void main(String[] args) {
		String string="epic is a healthcare company";
		printVertical(string);
		}
		public static void printVertical(String input){
		Queue<String> stringQueue=new LinkedList<String>();
		String [] string=input.split(" ");
		for (int i = 0; i <string.length ; i++) {
		stringQueue.add(string[i]);
		}
		for (int i = 0; i <string.length ; i++) {
		String stringPrint=stringQueue.poll();
		System.out.printf("%s\n",stringPrint);
		}

}
}