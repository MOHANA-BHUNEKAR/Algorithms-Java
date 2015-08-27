package colorful;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {

	public static void main(String[] args) throws IOException {

		
		char ch='A';
		int vch = ((ch-64)*4)%3;
		System.out.println(vch);
		
		int i= Math.abs('A'-'B');
		System.out.println(i);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String ss= br.readLine();
		
		System.out.println(ss);
	}

}
