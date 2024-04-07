import java.util.Scanner;

public class EstoreAppV5 {

	public static void main(String[] args) {

		int itemCounter = 1;
		int total = 0;
		int pricePointForDiscountAllowed = 200;
		double percentage = 100.00;
		double discount = 0;


		int flagValue = -1;

		System.out.println("\nWelcome to Estore");

			Scanner input = new Scanner(System.in);


			System.out.print("\nENTER CUSTOMER NAME: ");
			String customerName = input.nextLine();			

			System.out.print("\nNumber of items bought: ");
			int itemsBought = input.nextInt();	


		System.out.println("\nEnter Cost of items below\n");


				System.out.print("ENTER COST FOR ITEM 1 or -1 to quit: ");
				int costOfItem = input.nextInt();

			do {
				total += costOfItem;
				itemCounter++;

				System.out.printf("ENTER COST FOR ITEM %d or -1 to quit:" + " ",  itemCounter);
				costOfItem = input.nextInt();

			} while (costOfItem != -1);


		if (total >= pricePointForDiscountAllowed) {

			System.out.print("\nENTER DISCOUNT PERCENTAGE: ");
			int discountGiven = input.nextInt();

			double discountedCost =  total - ((discountGiven / percentage) * total);


		System.out.printf("%nCustomer Name: %s%nNumber of item(s) bought: %d%nPercentage discount: %d%nOriginal cost: NGN %d%nDiscounted cost is: %.2f%nThank you for your patronage!%n", customerName, itemsBought, discountGiven, total, discountedCost);

		} 
		
		else if (total <= pricePointForDiscountAllowed) {

			System.out.printf("%nCustomer Name: %s%nNumber of item(s) bought: %d%nOriginal cost: NGN %d%nDiscounted cost: %f%nThank you for your patronage!%n", customerName, itemsBought, total, discount);

		}

	}
}