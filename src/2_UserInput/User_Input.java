import java.util.Scanner;

public class User_Input{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Rectangle Area Calculator App.");
        System.out.print("Please enter the length: ");
        double length = scanner.nextDouble();

        System.out.print("Please enter the width: ");
        double width = scanner.nextDouble();

        System.out.println("Area: " + length * width + "cm2");

        scanner.close();
    }
}
