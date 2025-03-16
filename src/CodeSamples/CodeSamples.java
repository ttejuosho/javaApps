import java.util.Scanner;

public class CodeSamples{
    public static void main(String[] args){
        // Enhanced Switch
        int side = 1;

        switch(side){
            case 1, 2 -> System.out.println("No shapes with 1 or 2 sides");
            case 3 -> System.out.println("Triangle");
            case 4 -> System.out.println("Rectangle or Square");
            case 5 -> System.out.println("Pentagon");
            case 6 -> System.out.println("Hexagon");
            case 7 -> System.out.println("Heptagon");
            default -> System.out.println("Unknown Shape");
        }

        // For Loop
        for (int i = 0; i < 3; i++){
            System.out.println(i + 1 + " $$$");
            // break - Stops
            // continue - Skips
        }

        // While Loop
        Scanner scanner = new Scanner(System.in);
        String username = "";

        while(username.isEmpty()){
            System.out.print("Please enter your name: " + username);
            username = scanner.nextLine();
        }

        System.out.println("Welcome " + username);
        scanner.close();


    }
}