import java.util.Scanner;

public class EstoreAppV1 {

	public static void main(String[] args) {

		int itemCounter = 1;
		int total = 0;
		int costOfItem = 0;
		int pricePointForDiscountAllowed = 200;

		double discount = 0;
		double percentage = 0.1;

		System.out.println("\nWelcome to Estore");

		Scanner input = new Scanner(System.in);

		System.out.print("\nENTER CUSTOMER NAME: " + " ");
		String customerName = input.nextLine();
		
		System.out.println("\nEnter Cost of items below\n");		
		
		while (itemCounter <= 4) {

			System.out.printf("ENTER COST FOR ITEM %d:" + " ",  itemCounter);
			 costOfItem = input.nextInt();

			total += costOfItem;

			itemCounter++;
		}


		if (total >= pricePointForDiscountAllowed) {	

			discount = total * percentage; 

		System.out.printf("%nCustomer Name: %s%nOriginal cost: NGN %d%nDiscounted amount is: %.2f(Discount added)%nThank you for your patronage!%n", customerName, total, discount);

		} 
		
		else {

			System.out.printf("%nCustomer Name: %s%nOriginal cost: NGN %d%nDiscounted amount is: %.2f(No discount added)%nThank you for your patronage!%n", customerName, total, discount);

		}

	}
}