/* Car Mileage Calculator
Create a Car class with fields make, model, milesDriven, and fuelUsed. Add a method to calculate mileage (milesDriven / fuelUsed).
Explanation: Ensure proper handling of edge cases like zero fuel.*/


  class Car {
 
    private String make;
    private String model;
    private double milesDriven;
    private double fuelUsed;

    
     Car(String make, String model, double milesDriven, double fuelUsed) {
        this.make = make;
        this.model = model;
        this.milesDriven = milesDriven;
        this.fuelUsed = fuelUsed;
    }

    
     double calculateMileage() {
        if (fuelUsed == 0) {
            System.out.println("Error: Fuel used cannot be zero.");
            return 0;
        }
        return milesDriven / fuelUsed; 
    }

   
    public void displayCarDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Miles Driven: " + milesDriven);
        System.out.println("Fuel Used: " + fuelUsed);
        double mileage = calculateMileage();
        if (fuelUsed != 0) {
            System.out.println("Mileage: " + mileage + " miles per gallon.");
        }
    }
}
    public class ConstructorCarMileage
    {
    public static void main(String[] args) {
    
        Car car1 = new Car("Toyota", "Corolla", 300, 15);
        car1.displayCarDetails(); 

        System.out.println();

        Car car2 = new Car("Honda", "Civic", 500, 0);
        car2.displayCarDetails(); 
    }
}
