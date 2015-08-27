package colorful;

public class Findword {
	
	public static boolean findWord(char[][] matrix, String word) {
        char[] chars = word.toCharArray();

        int rowLen = matrix.length;
        int colLen = matrix[0].length;

        if (word.length() > rowLen || word.length() > colLen) {
            return false;
        }

        int charPoint = 0,lastindexvisited=0;

        // scan rows
        for (int i = 0; i < rowLen; i++) {
        	lastindexvisited=0;
        	charPoint = 0;
        	
            for (int j = 0; j < colLen; j++) {
            	
    			System.out.println("j loops: "+j);


                if (chars[charPoint] == matrix[i][j]) {
                	
                	System.out.println("Matrix value: and chars "+matrix[i][j]+" chars "+chars[charPoint]);
        			System.out.println("Last visited matched");
                	
                	if(charPoint==0)
                	{
                		System.out.println("First match at J: "+j);
                		charPoint++;
                		lastindexvisited=j;
                		
                		System.out.println("cp and liv are: "+charPoint+" "+lastindexvisited);
                	}
                	
                	else {
                		
                		
                	
                		System.out.println("cp>0 j is "+j);

                		if(lastindexvisited== j-1)
                		
                		{
                			System.out.println("Last visited matched----");
                			charPoint++;
                			lastindexvisited=j;
                		}
                		
                		else
                		{
                			charPoint=0;
                			lastindexvisited=0;
                			System.out.println("not Last visited matched");

                			
                			
                		}
                		
                	}
            }  // end of if condition
        }  // end of inner for loop
            
            if (charPoint == word.length()) {
            	
            	System.out.println("char length: "+ charPoint);
                return true;
            }
            }
		return false;

        // scan cols
      /*  charPoint = 0;
        for (int j = 0; j < colLen; j++) {
            for (int i = 0; i < rowLen; i++) {

                if (chars[charPoint] == matrix[i][j]) {
                    charPoint++;
                    if (charPoint == word.length() - 1) {
                        return true;
                    }
                } else {
                    charPoint = 0;
                }
            }
        }

        // scan diagonal
        charPoint = 0;
        for (int i = 0; i < rowLen; i++) {

            if (chars[charPoint] == matrix[i][i]) {
                charPoint++;
                if (charPoint == word.length() - 1) {
                    return true;
                }
            } else {
                charPoint = 0;
            }
        }

        return false;*/
    }
	
	
	public static void main (String [] args)
	{
		
		char [][] mat = {
				{'h','e','o','w'},
				{'h','x','o','w'},
				{'h','e','y','w'},
				{'h','e','o','w'}
				};
		
		boolean b=findWord(mat,"eow");
		System.out.println(b);

		
		}
		
		
		
	}


