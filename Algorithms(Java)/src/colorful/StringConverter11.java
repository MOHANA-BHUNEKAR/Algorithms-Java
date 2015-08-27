package colorful;

public class StringConverter11 {

	public static void main(String[] args) {

		strConverter("Abcdefghz");
		
	}

	private static void strConverter(String str) {

		
		StringBuilder newStr = new StringBuilder();
	    int shift = 2; // shift value

int pp= 'Z'-'A';
System.out.println(pp);

	for(int i=0;i< str.length();i++)
	{
	char ch = str.charAt(i);
	// perform Caesar shift
	if((ch >= 'a') && (ch <= 'z'))
	//ch = (char)('a'+(ch-'a'+shift)%26);
	
	ch=(char)('a'+(ch+shift)%26);
	//ch = (char)((ch+shift));

	else if((ch >= 'A') && (ch <= 'Z'))
	//	ch = (char)((ch+shift));
		ch=(char)('A'+(ch+shift)%26);

//	ch = (char)('A'+(ch-'A'+shift)%26);
	// build the string with the shifted char
	newStr.append(ch);
	}
	
	System.out.println(newStr.toString());

	

	
}
}
