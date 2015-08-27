package colorful;

import java.util.Stack;

public class EvaluateExpression {

	
	public static String InfixtoPostfix(String exp)
	{
		
		Stack<Character> stk = new Stack<Character>();
		String result ="";
		
		for (int i=0;i<exp.length();i++)
		{
			
			if( !isOperator( exp.charAt(i)))
			{
				System.out.println("It's not operator");
				result= result+exp.charAt(i);
				System.out.println(" Value of Result after adding "+exp.charAt(i)+" "+result);

			}
			
			else
			{
				if( isOperator( exp.charAt(i))) {
					System.out.println("Is operator "+exp.charAt(i));
				if (!stk.isEmpty() &&  operatorPrecedence(stk.peek(),exp.charAt(i)))
				{
					System.out.println("stack not empty");
					result= result+stk.peek();
					stk.pop();		
					System.out.println("And result: "+result);
					while(!stk.isEmpty())
					{
						result= result+stk.peek();
						stk.pop();
						System.out.println("Inside while loop till stk empty: "+result);
	
					}
					
					
					
				}
				
				stk.push(exp.charAt(i));
				
			}
			}
				
			
			
		}
		
		while(!stk.isEmpty())
		{
			result= result+stk.peek();
			stk.pop();
			
			
		}
		
		
		
		
		return result;
		
		
	}

	private static boolean operatorPrecedence(Character tos, char c) {
		// TODO Auto-generated method stub
		
		int tos1=precedenceLevel( tos);
		int c1=precedenceLevel( c);
		
		if(tos1>=c1)
			return true;

		return false;
	}

	private static int precedenceLevel(char op) {
		// TODO Auto-generated method stub
		
		switch (op) {
        case '+':
        case '-':
            return 0;
        case '*':
        case '/':
            return 1;
        case '^':
            return 2;
        default:
            throw new IllegalArgumentException("Operator unknown: " + op);
    }
	}

	private static boolean isOperator(char c) {
		
		if (c=='+'|| c=='-'||c=='*'||c=='/')
		return true;
		
		return false;
	}
	
	public static void main(String[] args)
	{
		
		String result=InfixtoPostfix("1+2*4/5-7+3/6");
		char f=EvalPostfix(result);
		
		
		System.out.println("---"+f);
		
	}

	private static Character EvalPostfix(String exp) {
		// TODO Auto-generated method stub
		
		Stack<Character> stk = new Stack<Character>();
String result ="";
		
		for (int i=0;i<exp.length();i++)
		{
			
			if( !isOperator( exp.charAt(i)))
			{
		
				stk.push(exp.charAt(i));
				System.out.println("pushed element: "+stk.peek());
	         }
			else
			{
				if( isOperator( exp.charAt(i))) {
					
				//	int op2= Integer.parseInt(stk.pop().toString());
					//int op1= Integer.parseInt(stk.pop().toString());
					
					int op2=  stk.pop()-48;
					int op1 = stk.pop()-48;
					
				//	System.out.println("op1 and op2 are: "+op1+" "+op2);
					char operator=exp.charAt(i);
					int res=0;
					if(operator == '+')
						res= op1+op2;
					if(operator == '-')
						res= op1-op2;
					if(operator == '*')
						res= op1*op2;
					if(operator == '/')
						res= op1/op2;
				//	System.out.println("result getting pushed after operation: "+res);

					String s1= String.valueOf(res);
					Character ch=  (char) res;
				//	System.out.println("value getting pushed after operation: "+ch);
					stk.push(ch);
					
				}
				}
	
}
		return stk.peek();}}
