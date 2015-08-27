package colorful;

public class SubstringAddition {

	public static void main(String[] args) {

		int [] arr = {1, -5, 9, 11, 2, 14};
		int sum = 15;
		SubAdd(arr,sum);
	}

	private static void SubAdd(int[] arr, int sum) {

		
		//int j = 0;
		int k = 0;
		int sumarr = 0;
		for(int i=0,j=0; j < arr.length; i++ ) {
			if(i < arr.length) {
				sumarr += arr[i];
				k++;
			}
			if(sumarr > sum) {
				
				sumarr = sumarr - arr[j];
				j++;
			}
			if(sumarr == sum){
				System.out.println((j+1) +"-"+ k);
				break;
			}
			if(arr.length-1 == i) {
				System.out.println("Nothing found");
			}
		}
	}

}
