/*1. Vehicle Abstract Class
Problem: Create an abstract class Vehicle that has the following methods:
start() — a method to start the vehicle (returns a String).
stop() — a method to stop the vehicle (returns a String).
fuelEfficiency() — an abstract method to calculate fuel efficiency in kilometers per liter, which will be implemented by subclasses.
Then, create two subclasses:
Car (has a fuelEfficiency() method that returns 15 km/l).
Bike (has a fuelEfficiency() method that returns 30 km/l).
Write a program that demonstrates the behavior of starting and stopping vehicles and prints their fuel efficiency.
Explanation:
The abstract class Vehicle will have common methods start() and stop().
fuelEfficiency() is abstract, forcing subclasses to implement it.
Logical operation: Use start() and stop() for vehicles and show the differences in fuel efficiency based on the type.*/
 
import java.util.*;
abstract class Vehicle
{
  abstract void start();
  abstract void stop();
  abstract int fuelefficiency();
}
class car extends Vehicle
{
  void start()
  {
    System.out.println("car is start");
   }
 void stop()
 {
   System.out.println("car is stop");
   }
int fuelefficiency()
{
  return 15;
}
}  
  class bike extends Vehicle
{
  void start()
  {
    System.out.println("bike is start");
   }
 void stop()
 {
   System.out.println("bike is stop");
   }
int fuelefficiency()
{
  return 30;
}
}  

public class AbstractVehicle_CarBike
{
  public static void main(String x[])
  {
 
Vehicle v1=new car();
v1.start();
v1.fuelefficiency();
System.out.println("Fuel Efficiency: "+ v1.fuelefficiency()+ " km/l");
v1.stop();

Vehicle v2=new bike();
v2.start();
v2.fuelefficiency();
System.out.println("Fuel Efficiency: " +v2.fuelefficiency()+ " km/l");
v2.stop();
}
}
  