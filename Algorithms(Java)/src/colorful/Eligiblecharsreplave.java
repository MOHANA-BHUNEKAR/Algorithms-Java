package colorful;

public class Eligiblecharsreplave {

	public static void main(String[] args) {

		
		int i, length=0;
		int count=0;
		// Bad, Idea. Just for here. Dont enter a string bigger than 100 chars
		String s="aeiouffffaeiou";
		length = s.length();
		for (i=0; i<length; i++)
		{
			
			char ch=s.charAt(i);
		if((ch== 'A') ||
		(ch == 'E') ||
		(ch == 'I') ||
		(ch == 'O') ||
		(ch == 'U') )
		{
		count++;
		}
		}

		if(count <= 7)
		count = count - 3;
		else
		count =4;

System.out.println(count);
		for (i=length; i>0; i--)
		{
		if(count>0)
		{
			char ch=s.charAt(i);
			if((ch== 'A') ||
			(ch == 'E') ||
			(ch == 'I') ||
			(ch == 'O') ||
			(ch == 'U') )
			{

		ch = (char) ((char)ch +'a'-'A');
		System.out.print(ch);
		count--;
		}

		}
		}

		//printf("Its %s",a);
		} 
	}


