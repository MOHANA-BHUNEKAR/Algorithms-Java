package colorful;

public class RectPerm {

	public static void main(String[] args) {

		printVertices(0,0,1);
		printVertices(1,2,1);
		
	}

	private static void printVertices(int x1, int y1, int area) {


		
		Double d = Math.sqrt(area);
		int high = d.intValue();
		for(int i = 1; i <= high; i++) {
			int length, breadth;
			if ( area % i == 0){
				length = i;
				breadth = area/i;
				ouputVertices(x1, y1, length, breadth);
				ouputVertices(x1, y1, -1*length, breadth);
				ouputVertices(x1, y1, length, -1*breadth);
				ouputVertices(x1, y1, -1*length, -1*breadth);
			}
		}
	}

	private static void ouputVertices(int x1, int y1, int l, int b) {

		System.out.println("("+(x1+l)+","+y1+"),"+"("+(x1)+","+(y1+b)+"),"+"("+(x1+l)+","+(y1+b)+")" );
	}

}
