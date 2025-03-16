package RestaurantOrderSystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderItemMapping {
    public static Map<Integer, OrderItem> orderItemMap = new HashMap<>();

    // Constructor
    public OrderItemMapping() {

        // Adding sample restaurant items
        // Single Items
        addItem(new OrderItem(1, "Amala", "Swallow", "", 8.99));
        addItem(new OrderItem(2, "Eba", "Swallow", "",12.99));
        addItem(new OrderItem(3, "Pounded Yam", "Swallow", "",7.49));
        addItem(new OrderItem(4, "Semo", "Swallow", "",9.99));
        addItem(new OrderItem(5, "Wheat", "Swallow", "",9.99));
        addItem(new OrderItem(6, "Egusi", "Stew", "",9.99));
        addItem(new OrderItem(7, "Efo Riro", "Stew", "",9.99));
        addItem(new OrderItem(8, "Red Stew", "Stew", "",9.99));
        addItem(new OrderItem(9, "Aya Mase", "Stew", "",9.99));
        addItem(new OrderItem(10, "White Rice", "Rice", "",9.99));
        addItem(new OrderItem(11, "Jollof Rice", "Rice", "",9.99));
        addItem(new OrderItem(12, "Fried Rice", "Rice", "",9.99));
        addItem(new OrderItem(13, "Beans", "Side", "",9.99));
        addItem(new OrderItem(13, "Aganyin Beans", "Special", "",9.99));
        addItem(new OrderItem(14, "Plantain", "Side", "",9.99));
        addItem(new OrderItem(15, "Meat", "Side", "1 piece of meat",4.99));
        addItem(new OrderItem(16, "Fish", "Side", "1 piece of fish",4.99));
        addItem(new OrderItem(17, "Egg", "Side", "1 hard boiled Egg",2.99));
        addItem(new OrderItem(18, "Ewedu", "Stew", "Ewedu with Gbegiri option",9.99));


        // Meals 2XX
        addItem(new OrderItem(201, "Eba/Ewedu", "Meal", "Eba with Ewedu & assorted protein combo",29.99));
        addItem(new OrderItem(202, "Eba/Egusi", "Meal", "Eba with Egusi & assorted protein combo",29.99));
        addItem(new OrderItem(203, "Eba/Efo Riro", "Meal", "Eba with Efo riro & assorted protein combo",29.99));
        addItem(new OrderItem(211, "Amala/Ewedu", "Meal", "Amala with ewedu/gbegiri & meat combo",29.99));
        addItem(new OrderItem(212, "Pounded Yam", "Meal", "Iyan with Egusi/Efo riro & meat combo",29.99));
        addItem(new OrderItem(213, "Semo/Egusi", "Meal", "Semo with Egusi/Efo riro & meat combo",29.99));
        addItem(new OrderItem(214, "Wheat/Egusi", "Meal", "Wheat with Egusi/Efo riro & meat combo",29.99));
        addItem(new OrderItem(225, "Jollof Rice", "Meal", "Jollof rice, served with plantains/meat/fish",29.99));
        addItem(new OrderItem(225, "Fried Rice", "Meal", "Fried rice, served with meat/fish",29.99));
        addItem(new OrderItem(226, "White Rice/Red Stew", "Meal", "White rice & red stew served with proteins",29.99));
        addItem(new OrderItem(227, "White Rice/Aya Mase", "Meal", "White rice & aya mase stew served with proteins",29.99));
        addItem(new OrderItem(237, "Yam & Egg", "Meal", "4 Pieces of Boiled Yam & 3 Fried Eggs",35.99));

        // Drinks 3XX
        addItem(new OrderItem(30, "Can Pepsi", "Beverage", "Pepsi Can Drink 25cl",1.99));
        addItem(new OrderItem(31, "Bottle Pepsi", "Beverage", "Pepsi Bottle Drink 50cl",2.99));
        addItem(new OrderItem(32, "Can Coke", "Beverage", "Coke 25cl",1.99));
        addItem(new OrderItem(33, "Bottle Coke", "Beverage", "Bottle Coke 50cl",2.99));
        addItem(new OrderItem(34, "Purified Water", "Beverage", "Purified Water 50cl",0.99));
        addItem(new OrderItem(35, "Maltina", "Beverage", "Maltina",3.99));
        addItem(new OrderItem(36, "Vita Malt", "Beverage", "Vita Malt",3.99));
        addItem(new OrderItem(37, "Odogwu Bitters", "Beverage", "Odogwu Bitters",5.99));

        // Special Items
        addItem(new OrderItem(65, "Moi Moi", "Side", "",11.49));
        addItem(new OrderItem(66, "Chocolate Cake", "Side", "",5.99));
    }

    // Method to add an item
    public void addItem(OrderItem item) {
        orderItemMap.put(item.getItemNumber(), item);
    }

    // Method to get an item by item number
    public OrderItem getItem(int itemNumber) {
        return orderItemMap.get(itemNumber);
    }

    // Get Order Items by ItemType
    public List<OrderItem> getAllItems(){
        return OrderItemMapping.orderItemMap.values().stream().toList();
    }

    // Method to check if an item exists
    public boolean itemExists(int itemNumber) {
        return orderItemMap.containsKey(itemNumber);
    }

    // Method to remove an item
    public void removeItem(int itemNumber) {
        orderItemMap.remove(itemNumber);
    }

    // Method to display all items
    public void displayItems() {
        for (OrderItem item : orderItemMap.values()) {
            System.out.println(item);
        }
    }
}
