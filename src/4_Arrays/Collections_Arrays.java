import java.util.Arrays;

public class Collections_Arrays{
    public static void main (String[] args){
        // Arrays
        String[] fruits = {"Apple", "Orange", "Banana", "Coconut"};
        int[] studentAges = {9,4,6,3,2,7,5,8};

        Arrays.sort(fruits);
        System.out.println(fruits.length);

        System.out.println(fruits[2]); // Logs Banana
        int fruitCount = fruits.length;

        // Enhance For Loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        String [] models = new String[5];
        for (int i = 0; i < models.length; i++){
            models[i] = "Akara " + ( i + 1 );
        }

        for (String model : models) {
            System.out.println(model);
        }
    }
}