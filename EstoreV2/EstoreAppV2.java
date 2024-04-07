import java.util.Scanner;

public class EstoreAppV2 {

	public static void main(String[] args) {

		int itemCounter = 1;
		int total = 0;
		int costOfItem = 0;
		int pricePointForDiscountAllowed = 200;
		double percentage = 100.00;
		double discount = 0;

		System.out.println("\nWelcome to Estore");

			Scanner input = new Scanner(System.in);


			System.out.print("\nENTER CUSTOMER NAME: ");
			String customerName = input.nextLine();

			System.out.print("\nHow many items do you want to calculate? ");
			int amountOfItemsInput = input.nextInt();			


		System.out.println("\nEnter Cost of items below\n");		


		while (amountOfItemsInput == amountOfItemsInput) {

			System.out.printf("ENTER COST FOR ITEM %d:" + " ",  itemCounter);
				costOfItem = input.nextInt();

			total += costOfItem;
			
			if (itemCounter == amountOfItemsInput) {
				
				break;
			}


		itemCounter++;
		}


		if (total >= pricePointForDiscountAllowed) {

			System.out.print("ENTER DISCOUNT PERCENTAGE: ");
			int discountGiven = input.nextInt();

			double discountedCost =  total - ((discountGiven / percentage) * total);


		System.out.printf("%nCustomer Name: %s%nNumber of item(s) bought: %d%nPercentage discount: %d%nOriginal cost: NGN %d%nDiscounted cost is: %.2f(Discount added)%nThank you for your patronage!%n", customerName, amountOfItemsInput, discountGiven, total, discountedCost);

		} 
		
		else if (total <= pricePointForDiscountAllowed) {

			System.out.printf("%nCustomer Name: %s%nOriginal cost: NGN %d%nDiscounted cost: %.2f(No discount added)%nThank you for your patronage!%n", customerName, total, discount);

		}

	}
}