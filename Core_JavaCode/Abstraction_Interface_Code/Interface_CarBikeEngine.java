
import java.util.*;
interface Vehicle
{
   void startEngine();
   void stopEngine();
 }
 
 class Car implements Vehicle
 {
    String model;
	Car(String model)
	{
	 this.model=model;
	 } 
	  
	public void startEngine()
	  {
	    System.out.println("Car " +model+ " Engine started" );
		}
	public void stopEngine()
	  {
	   System.out.println("Car " +model+ " Engine stopped" );
		}
	}
	
	
	 class Bike implements Vehicle
    {
    String brand;
	Bike(String brand)
	{
	 this.brand=brand;
	 } 
	  
	public void startEngine()
	  {
	    System.out.println("Bike " +brand+ " Engine started" );
		}
	public void stopEngine()
	  {
	   System.out.println("Bike " +brand+ " Engine stopped" );
		}
	}
	
	
	public class Interface_CarBikeEngine
   {
  public static void main(String x[])
  {
    
    Vehicle c1=new Car("Toyoto");
    Vehicle b1=new Bike("Yamaha");

   c1.startEngine();
   c1.stopEngine();
   
   b1.startEngine();
   b1.stopEngine();
  }
}  
	
	