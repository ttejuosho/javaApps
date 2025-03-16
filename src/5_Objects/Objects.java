
public class Objects{
    public static void main(String[] args){
        Car car1 = new Car(2023, "Toyota", "Highlander", 34900, false);

        System.out.print(car1.year + " ");
        System.out.print(car1.make + " ");
        System.out.println(car1.start(true));
        System.out.println(car1.drive());

        // Using Overloaded Constructor
        Car car2 = new Car(2025, "Hyundai", "Palisade", 4526, false);
        System.out.print(car2.year + " ");
        System.out.print(car2.make + " ");
        System.out.print(car2.model + " with a mileage of " + car2.mileage + " miles\n");
        System.out.println("=====================================");
        System.out.println("=====================================");

        // Array of Objects
        Car car3 = new Car(2021, "Lexus", "RX350", 52123, false);

        Car[] cars = {car1, car2, car3};
        for (Car car : cars){
            System.out.println(car.year + " " + car.model + " " + car.make + " with a mileage of " + car.mileage + " miles");
        }

        // Inheritance
        //Truck truck1 = new Truck(2024, "Ford", "F450", 89563, "Diesel");
        //System.out.println(truck1.engineType);
    }
}