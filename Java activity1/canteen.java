import java.util.Scanner;

public class canteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char orderAgain = 'Y';

        while (orderAgain == 'Y' || orderAgain == 'y') {
            // 1. Display Menu Header & Items
            System.out.println("=====     M E N U     =====");
            System.out.println("1. Burger        - $80.00");
            System.out.println("2. Pizza         - $120.00");
            System.out.println("3. Pasta         - $100.00");
            System.out.println("4. Sandwich      - $70.00");
            System.out.println("5. Milk Tea      - $90.00\n");

            // 2. Accept User Input
            System.out.print("Enter item number: ");
            int itemNum = scanner.nextInt();

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Are you a student? (Y/N): ");
            char studentChar = scanner.next().charAt(0);
            boolean isStudent = (studentChar == 'Y' || studentChar == 'y');

            // 3. Match Item Number to Price
            double pricePerItem = 0.0;
            switch (itemNum) {
                case 1: pricePerItem = 80.00; break;
                case 2: pricePerItem = 120.00; break;
                case 3: pricePerItem = 100.00; break;
                case 4: pricePerItem = 70.00; break;
                case 5: pricePerItem = 90.00; break;
                default:
                    System.out.println("Invalid item number chosen!");
                    continue; // Restarts the loop if input is bad
            }

            // 4. Calculate Subtotal and Discounts
            double subtotal = pricePerItem * quantity;
            double discountRate = 0.0;

            if (isStudent && subtotal >= 500) {
                discountRate = 0.15; // Student + $500 or more
            } else if (isStudent) {
                discountRate = 0.10; // Student only
            } else if (subtotal >= 500) {
                discountRate = 0.05; // $500 or more only
            }

            double discountAmount = subtotal * discountRate;
            double orderTotal = subtotal - discountAmount;

            // 5. Display Formatted Calculation Details
            System.out.println();
            System.out.printf("Subtotal: $%.2f\n", subtotal);
            System.out.printf("Discount: $%.2f\n", discountAmount);
            System.out.printf("Order total: $%.2f\n\n", orderTotal);

            // 6. Check for repetition
            System.out.print("Do you want to order again? (Y/N): ");
            orderAgain = scanner.next().charAt(0);
            System.out.println(); // Prints an empty line for cleaner formatting
        }

        System.out.println("Thank you for ordering!");
        scanner.close();
    }
}
