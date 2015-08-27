package colorful;

public class SMSProblem {

	public static void main(String[] args) {

		String s=getSMSText("22#2");
		System.out.println(s);
	}

	private static String getSMSText(String str) {
		
		String patterns[]={"10", "ABC2", "DEF3", "GHI4", "JKL5", "MON6",
				"PQRS7", "TUV8", "WXYZ9", " *","#"};
				int possitions[]={2,4,4,4,4,4,5,4,5,2,1};
				StringBuilder ParsedString = new StringBuilder();


				Character c = str.charAt(0);
				int counter=0;
				int index = 0;
				int possition = 0;
				for(int i=1;i<str.length();i++)
				{
				//System.out.println(c);
				if(str.charAt(i) == c)
				{
				counter++;
				}
				else
				{
				if(c!='#')
				{
				if(c=='*') index=9;
				else index = ((int)c-48)-1;
				possition = counter%possitions[index];
				char toAdd = patterns[index].charAt(possition);
				if(toAdd!='0')
				ParsedString.append(toAdd);
				c=str.charAt(i);
				counter=0;
				}else
				{
				c=str.charAt(i);
				}
				}
				}
				if(c!='#')
				{
				if(c=='*') index=9;
				else
				index = ((int)str.charAt(str.length()-1)-48)-1;
				possition = counter%possitions[index];
				ParsedString.append(patterns[index].charAt(possition));
				}
				return ParsedString.toString(); 
		
	}

}
