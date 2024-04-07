import java.util.Scanner;

public class EstoreAppV4 {

	public static void main(String[] args) {

		int itemCounter = 2;
		int total = 1;
		int pricePointForDiscountAllowed = 200;
		double percentage = 100.00;
		double discount = 0;


		int flagValue = -1;

		System.out.println("\nWelcome to E-store");

			Scanner input = new Scanner(System.in);


			System.out.print("\nPLEASE ENTER CUSTOMER NAME: ");
			String customerName = input.nextLine();			

			System.out.print("\nPlease enter number of item purchased: ");
			int itemsBought = input.nextInt();	


		System.out.println("\nEnter Cost of items below\n");


			System.out.print("PlEASE ENTER COST FOR ITEM 1: ");

				int costOfItem = input.nextInt();
		
				total = 1 + costOfItem;

		for (;itemsBought >= itemCounter;) {

			System.out.printf("PLEASE ENTER COST FOR ITEM %d:" + " ",  itemCounter);

				costOfItem = input.nextInt();

			total += costOfItem;

		itemCounter++;
		}


		if (total >= pricePointForDiscountAllowed) {

			System.out.print("\nENTER DISCOUNT PERCENTAGE: ");

			int discountGiven = input.nextInt();

			double discountedCost =  total - ((discountGiven / percentage) * total);


		System.out.printf("%nCustomer Name: %s%nNumber of item(s) bought: %d%nPercentage discount: %d%nOriginal cost: NGN %d%nDiscounted cost is: NGN %.2f%nThank you for your patronage!%n", customerName, itemsBought, discountGiven, total, discountedCost);

		} 
		
		else if (total <= pricePointForDiscountAllowed) {

			System.out.printf("%nCustomer Name: %s%nNumber of item(s) bought: %d%nOriginal cost: NGN %d%nDiscounted cost: %f%nThank you for your patronage!%n", customerName, itemsBought, total, discount);

		}

	}
}