import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class StoreFrontApp {
    public static void main (String[] args){

        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);
        char currency = '$';

        // App Greeting
        System.out.println("  Welcome to the Store Front !!");
        System.out.println("===================================");

        // Accept Input for Products and Prices.
        System.out.print("What are you buying today? ");
        String item = scanner.nextLine();

        System.out.print("Please enter a price for your item: ");
        double itemPrice = scanner.nextDouble();

        System.out.print("How many of them item (" + item + ") are you buying ? ");
        int qty = scanner.nextInt();

        double totalPrice = Math.round(itemPrice * qty * 100.0) / 100.0;
        BigDecimal totalPriceFormatted = new BigDecimal(totalPrice).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Amount Due: $" + totalPrice);

        System.out.println("How would you like to pay. We accept cash and all major credit cards.");
        System.out.print("Please enter 1 for Cash or 2 for Credit Card: ");
        int paymentType = scanner.nextInt();

        if(paymentType == 1){
            System.out.println("How much cash are you tendering? ");
            double tenderedCash = scanner.nextDouble();
            double change = tenderedCash - totalPrice;

            System.out.println("Here's your change: $" + change + ". Please come back again.");
        }
        if(paymentType == 2)
        {
            System.out.print("Please enter your credit card number: ");
            BigInteger creditCardNumber = scanner.nextBigInteger();


            System.out.print("Please enter your card expiration (MMYY): ");
            String creditCardExpiration = scanner.nextLine();
            scanner.nextLine();

            System.out.print("Please enter the 3 or 4 digit CVV: ");
            int cardCvv = scanner.nextInt();


            System.out.println("Thank you.");
            System.out.println("Processing ..");
            System.out.println("Please wait...");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore the interrupt status
                System.out.println("Thread interrupted!");
            }

            System.out.println("Transaction Successful !!");
            System.out.println("$" + totalPrice + " has been charged to your card. Thank you.");
        }

        // Dispose Scanner
        scanner.close();
    }
}