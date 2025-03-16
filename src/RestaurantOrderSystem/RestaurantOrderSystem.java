package RestaurantOrderSystem;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static RestaurantOrderSystem.ItemType.getItemType;
import static RestaurantOrderSystem.OrderType.getOrderType;

public class RestaurantOrderSystem{
    public static void main(String[] args){

        // Greeting
        System.out.println("********************************************");
        System.out.println("  Welcome to the Mama-Put Ordering System  ");
        System.out.println("********************************************");

        // Initialize Scanner
        Scanner scanner = new Scanner(System.in);
        int navigateOption = 1;

        // Initialize Cart variable
        List<OrderItem> cart = new ArrayList<>();

        // Order type - Eat In or Take Out (Delivery ?)
        int orderTypeCode;
        String orderType;

        // Loop until a valid order type is selected
        do {
            // Get the input code
            orderTypeCode = getOrderTypeInput(scanner);

            // Convert to string
            orderType = getOrderType(orderTypeCode);

            // If input is invalid, display error and present options again
            if (orderType.equals("Unknown")) {
                System.out.println("Error: Invalid entry. Please try again.");
            }
        } while (orderType.equals("Unknown"));

        // Get Payment Option
        int paymentTypeInput;

        do{
            paymentTypeInput = getPaymentTypeInput(scanner);
            if(paymentTypeInput < 1 || paymentTypeInput > 2){
                System.out.println("Error: Invalid entry. Please try again");
            }
        }
        while(paymentTypeInput < 1 || paymentTypeInput > 2);

        // See Quick Menu, Build your meal
        int itemTypeCode;
        String itemType;

        do{
            // Get item type Input
            itemTypeCode = getItemTypeInput(scanner);

            // Convert to String
            itemType = getItemType(itemTypeCode);

            if(itemType.equals("Unknown")){
                System.out.println("Error: Invalid entry. Please try again");
            }

        } while (itemType.equals("Unknown"));

        // Load up all the Order Menu Items
        List<OrderItem> allMenuItems = new OrderItemMapping().getAllItems();

        // Filter by the item type selected above
        List<OrderItem> filteredMenuItems = getOrderItemsByItemType(allMenuItems, itemType);

        do{
            // Display Food Menu
            displayMenuItems(filteredMenuItems);

            int menuItemNumberInput;
            boolean isEntryInvalid = false;

            do{
                // Get menu item number input and reassign to final variable
                menuItemNumberInput = getMenuItemNumberInput(scanner);
                int selectedMenuItemNumber = menuItemNumberInput;

                // Check if supplied code exists in the filtered menu items
                isEntryInvalid = filteredMenuItems.stream().noneMatch(item -> item.itemNumber == selectedMenuItemNumber);

                // Display error if invalid
                if(isEntryInvalid){
                    System.out.println("Error: Invalid entry. Please try again");
                }
            }
            while(isEntryInvalid);

            int finalSelectedMenuItemNumber = menuItemNumberInput;

            // Get Selected Menu Item with selectedMenuItemNumber
            OrderItem selectedMenuItem = getOrderItemByNumber(filteredMenuItems, finalSelectedMenuItemNumber);

            // Add selected menu item number to cart
            if(selectedMenuItem != null){
                cart.add(selectedMenuItem);
            }

            // Confirm add to cart
            assert selectedMenuItem != null;
            System.out.println("#" + selectedMenuItem.getItemNumber() + " ( " + selectedMenuItem.getItemDescription() + " ) has been added to your cart.");

            // Go back to previous menu - Display filteredMenuItems
            System.out.println("\nPress 1 to go back to the previous menu.");

            // Go back to choose Menu Option
            System.out.println("Press 2 to go back to the Menu Options");

            // Payment option
            System.out.println("Press 3 to checkout");

            // View Cart
            System.out.println("Press 0 at anytime to view cart");

            System.out.print("Your response: ");
            navigateOption = scanner.nextInt();
        }
        while(navigateOption == 1);

        if(navigateOption == 0){
            displayCartItems(cart);
        }

        //if nav option is 2 -- run getItemTypeInput
        if(navigateOption == 2){
            getItemTypeInput(scanner);
        }

        System.out.println("\n--------------------");
        System.out.println("( Selected Options )");
        System.out.println("--------------------");
        System.out.println("Order Type: " + orderType);
        System.out.println("Payment Type: " +  ( paymentTypeInput == 1 ? "Cash" : "Credit Card" ));
        System.out.println("Item Type: " + itemType);

        // Close Scanner
        scanner.close();
    }

    // Get Payment Type
    private static int getPaymentTypeInput(Scanner scanner){
        System.out.println("\nHow would you like to pay today. We accept cash and all major credit cards.");
        System.out.print("Please enter 1 for Cash or 2 for Credit Card: ");
        return scanner.nextInt();
    }

    // Calculate Order total
    private static String getOrderTotal(List<OrderItem> orderItems){
        double totalPrice = orderItems.stream()
                .mapToDouble(OrderItem::getPrice)
                .sum();
        double pricePlusTax = totalPrice + (totalPrice*0.0886);
        return String.format("%.2f", pricePlusTax);
    }

    // Get order item by item number
    public static OrderItem getOrderItemByNumber(List<OrderItem> orderItems, int itemNumber) {
        return orderItems.stream()
                .filter(item -> item.getItemNumber() == itemNumber)
                .findFirst()
                .orElse(null); // Return null if not found
    }

    // Display cart items
    private static void displayCartItems(List<OrderItem> cartItems){
        String totalPrice = getOrderTotal(cartItems);
        System.out.println("\n----------------------");
        System.out.println("( Your Shopping Cart )");
        System.out.println("----------------------");
        for(OrderItem item : cartItems){
            System.out.println(item);
        }
        System.out.println("Order total: $" + totalPrice);
    }

    // Method to display menu items
    public static void displayMenuItems(List<OrderItem> menuItems) {
        System.out.println();
        System.out.println("***************");
        System.out.println("  Order Menu  ");
        System.out.println("***************\n");

        for (OrderItem item : menuItems) {
            System.out.println(item.itemNumber + ". " + item.itemName + " (" + item.itemDescription + ") $" + item.price);
        }
    }

    // Get Order Items by ItemType
    private static List<OrderItem> getOrderItemsByItemType(List<OrderItem> allMenuItems, String itemType){
        List<OrderItem> filteredItems = new ArrayList<>();

        for (OrderItem item : allMenuItems) {
            if (item.itemType.equalsIgnoreCase(itemType)) {
                filteredItems.add(item);
            }
        }

        return filteredItems;
    }

    // Get Item Type Input
    private static int getItemTypeInput(Scanner scanner){
        System.out.println("\nPress 1 for the quick menu (meals).");
        System.out.println("Press 2 for swallow.");
        System.out.println("Press 3 for rice.");
        System.out.println("Press 4 to build a meal.");
        System.out.print("Your response : ");

        return scanner.nextInt();
    }

    // Get Order Type Input
    private static int getOrderTypeInput(Scanner scanner){
        System.out.println("\nPress 1 for Eat In");
        System.out.println("Press 2 for Take Out");
        System.out.println("Press 3 for Delivery");
        System.out.print("Please choose your order type: ");

        return scanner.nextInt();
    }

    // Get Menu Item Number
    private static int getMenuItemNumberInput(Scanner scanner){
        System.out.println("\n");
        System.out.print("Enter item number to add to cart : ");

        return scanner.nextInt();
    }
}