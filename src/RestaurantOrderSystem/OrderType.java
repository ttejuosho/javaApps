package RestaurantOrderSystem;
import java.util.HashMap;
import java.util.Map;

public class OrderType {
    private static final Map<Integer, String> orderTypeMap = new HashMap<>();
     static {
         orderTypeMap.put(1, "Eat In");
         orderTypeMap.put(2, "Take Out");
         orderTypeMap.put(3, "Delivery");
     }

    public static String getOrderType(int orderTypeCode){
        return orderTypeMap.getOrDefault(orderTypeCode, "Unknown");
    }
}
