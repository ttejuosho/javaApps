package Variables;

public class Variables {
    public static void main (String[] args){
        // Primitive - int, double, char,  boolean stored directly in memory
        // Reference Stack - Heap, stored by Memory address
        int age = 30;
        int year = 1985;
        double price = 19.99;
        char yes = 'y';
        char no = 'n';
        boolean fasting = true;

        String month = "Ramadan";
        String name = "Taiwo Tejuosho";
        String date = "March 6th, 2025.";

        System.out.println("Hello " + name + ".");
        System.out.println("Welcome to your Java Tutorial.");
        System.out.println("Today's date is " + date);
        System.out.println("The year is " + year + " and im " + age + " years old.");
        System.out.println("Grapes now cost $" + price + " at the store.");
        System.out.println("Choose an answer. Enter " + yes + " for Yes and " + no + " for No.");

        if(fasting){
            System.out.println("It is " + month + ".");
        } else {
            System.out.println("This is NOT " + month + ".");
        }

    }
}
