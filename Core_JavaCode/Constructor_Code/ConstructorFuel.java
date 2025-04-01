/*Create a Car class
Create a Car class with fields speed and fuel.
The default constructor should initialize speed to 60 and fuel to 50.
Add a method drive() to simulate fuel reduction by 10 units per drive, and display the updated fuel level.
Explanation: Simulates state changes in objects through method logic.*/

 class Car {
   
    private int speed;
    private int fuel;

  
     Car() {
        this.speed = 60;  
        this.fuel = 50;   
       }

   
    void drive() {
        if (fuel >= 10) 

         {
               fuel = fuel-10; 
               System.out.println("Driving... Current fuel level: " + fuel + " units.");
             } 
     else {
            System.out.println("Not enough fuel to drive!");
        }
    }
}

     public class ConstructorFuel
     {

       public static void main(String x[])
         {
       
        Car c1 = new Car();

       
        c1.drive(); 
       
    }
}
