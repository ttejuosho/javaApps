public class Objects{
    public static void main(String[] args){
        Car car = new Car(2023, "Toyota", "Highlander", 34900);
        
        System.out.print(car.year + " ");
        System.out.print(car.make + " ");
        System.out.println(car.model);
    }
}