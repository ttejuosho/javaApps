package RestaurantOrderSystem;

public class OrderItem {
    int itemNumber;
    String itemName;
    String itemType;
    String itemDescription;
    double price;

    // Constructor
    public OrderItem(int itemNumber, String itemName, String itemType, String itemDescription, double price) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemDescription = itemDescription;
        this.price = price;
    }

    // Getters
    public int getItemNumber() {
        return itemNumber;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemType() {
        return itemType;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemType(String itemType) {
        this.itemName = itemType;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Item #" + itemNumber + ": " + itemName + " ( " + itemDescription + " )" + " - $" + price;
    }
}
