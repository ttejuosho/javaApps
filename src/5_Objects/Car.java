import org.w3c.dom.ls.LSOutput;

public class Car {
    int year;
    String make;
    String model;
    double price;
    boolean isRunning = false;

    Car(int year, String make, String model, double price, boolean isRunning){
        this.year = year;
        this.make = make;
        this.model = model;
        this.price = price;
        this.isRunning = isRunning;
    }

    Car mb = new Car(2023, "Toyota", "Highlander", 87450);

    void start (){
        isRunning = true;
        System.out.println("Car is now running.");
    }

    void stop (){
        isRunning = false;
        System.out.println("Car is no longer running.");
    }

    void drive(){
        System.out.println("You're driving the " + model);
    }
}