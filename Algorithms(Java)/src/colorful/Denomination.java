package colorful;

public class Denomination {

	public static void main(String[] args) {

		
		double amountPaid;
		double itemCost, amountReturned;
		int index = 0;
		double denominations[] = {10, 5, 1, .25, .1, .05, .01};
		itemCost = .52;
		amountPaid = 5;
		amountReturned = amountPaid - itemCost;
		System.out.println("Return a total of $" + amountReturned + ".");
		while(amountReturned > 0 && index<7) {
			int num_denominations = (int) (amountReturned/denominations[index]);
			amountReturned = amountReturned - (num_denominations*denominations[index]);
			System.out.println("Number of $" + denominations[index] + " to be returned: " + num_denominations);
			index++;
		}
	}

}
