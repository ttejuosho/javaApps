import org.w3c.dom.ls.LSOutput;

public class Car {
    int year;
    String make;
    String model;
    double price;
    int mileage;
    boolean isRunning;

    Car(int year, String make, String model, double price, int mileage, boolean isRunning){
        this.year = year;
        this.make = make;
        this.model = model;
        this.price = price;
        this.isRunning = isRunning;
    }

    boolean start (boolean isRunning){
        System.out.println("Car is now running.");
        return isRunning;
    }

    boolean stop (boolean isRunning){
        System.out.println("Car is no longer running.");
        return isRunning;
    }

    boolean drive(){
        System.out.println("You're driving the " + model);
        return true;
    }

    // Overloaded Constructor
    Car(int year, String make, String model, int mileage, boolean isRunning){
        this.year = year;
        this.make = make;
        this.model = model;
        this.mileage = mileage;
    }
}