import java.util.Scanner;

public class EstoreAppV6 {

    public static void main(String[] args) {

        int itemCounter = 0;
        int total = 0;
        int pricePointForDiscountAllowed = 200;

        System.out.println("\nWelcome to Estore");

        Scanner input = new Scanner(System.in);

        System.out.print("\nENTER CUSTOMER NAME: ");
        String customerName = input.nextLine();

        System.out.println("\nEnter Cost of items below\n");

        String itemNames;
        String itemNameList = "";

        do {
            System.out.printf("\nPLEASE ENTER NAME OF ITEM %d enter \"quit\" to exit: ", itemCounter + 1);
            itemNames = input.nextLine();

            if (!itemNames.equalsIgnoreCase("quit")) {
                System.out.printf("\nENTER COST FOR ITEM %d enter \"quit\" to exit: ", itemCounter + 1);
                int costOfItem = Integer.parseInt(input.nextLine());

                itemNameList += itemNames + ", ";
                total += costOfItem;
                itemCounter++;
            }
        } while (!itemNames.equalsIgnoreCase("quit"));

        double discountedCost = total;

        if (total >= pricePointForDiscountAllowed) {
            System.out.print("\nENTER DISCOUNT PERCENTAGE: ");
            int discountGiven = input.nextInt();

            double discountPercentage = discountGiven / 100.0;
            discountedCost = total - (discountPercentage * total);
        }

        System.out.printf("%nCustomer Name: %s%n", customerName);
        System.out.printf("Item Name(s): %s%n", itemNameList);
        System.out.printf("Total Cost: %d%n", total);

        if (total >= pricePointForDiscountAllowed) {
            System.out.printf("Discounted Cost: %.2f%n", discountedCost);
        } else {
            System.out.println("No discount applied.");
        }

        System.out.println("Thank you for your patronage!");
        input.close();
    }
}
