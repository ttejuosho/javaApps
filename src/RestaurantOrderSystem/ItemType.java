package RestaurantOrderSystem;
import java.util.HashMap;
import java.util.Map;

public class ItemType {
    private static final Map<Integer, String> itemTypeMap = new HashMap<>();
    static {
        itemTypeMap.put(1, "Meal");
        itemTypeMap.put(2, "Swallow");
        itemTypeMap.put(3, "Stew");
        itemTypeMap.put(4, "Beverage");
        itemTypeMap.put(5, "Side");
        itemTypeMap.put(6, "Special");
    }

    public static String getItemType(int itemTypeCode){
        return itemTypeMap.getOrDefault(itemTypeCode, "Unknown");
    }
}
