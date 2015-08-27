package colorful;

public class EdgeDetection {

	public static int[] processEdges(int[] image, int width, int threshold){
	    //throw out invalid input
	    if(image == null){
	        throw new NullPointerException();
	    }
	    if(width < 1){
	        throw new IllegalArgumentException();
	    }
	    if(image.length < width || image.length % width > 0){
	        throw new IllegalArgumentException();
	    }

	    //create output array and preprocess
	    final int[] output = new int[image.length];
	    final int numRows = image.length / width;
	    int xMin, xMax, yMin, yMax, maxDiff, index, pos;

	    //do the interior of the image
	    for(int row = 0; row < numRows; row++){
	        for(int col = 0; col < width; col++){
	            pos = image[row * width + col];
	            System.out.println("pos: & row & col "+pos+" "+row+" "+col );
	            xMin = (col == 0) ? 0 : col -1;
	            xMax = (col == width -1) ? col : col + 1;
	            yMin = (row == 0) ? 0 : row - 1;
	            yMax = (row == numRows -1) ? row : row + 1;
	            System.out.println("xMin & xMax & yMin & yMax "+ xMin+" "+ xMax+" " + yMin+" " + yMax);

	            if(meetsThreshold(xMin, xMax, yMin, yMax, width, image, pos, threshold)){
	            	
	            	System.out.println("Met threshold");
		            System.out.println("xMin & xMax & yMin & yMax "+ xMin+" "+ xMax+" " + yMin+" " + yMax);

	                output[row * width + col] = pos;
	            }
	        }
	    }
	    return output;
	}

	private static boolean meetsThreshold(int xMin, int xMax, int yMin, int yMax, 
			int width, int[] image, int value, int threshold){
	    int temp;
	    for(int row = yMin; row <= yMax; row++){
	        for(int col = xMin; col <= xMax; col++){
	            temp = Math.abs(value - image[row * width + col]);
	            if(temp >= threshold){
	                return true;
	            }
	        }
	    }
	    return false;
	}

	public static void main(String[] args) {
		int width = 5;
		int image[] = {
				1,1,1,1,1,
				1,9,1,1,1,
				1,1,1,1,1,
				1,1,1,1,1,
				1,1,1,1,1,};
		
		
		int out[] = processEdges(image, width, 2);
		
		for (int i = 0; i < out.length; i++) {
			if (i % width == 0) {
				System.out.println();
			}
			
			System.out.print(" " + out[i]);
		}
		
	}

}
