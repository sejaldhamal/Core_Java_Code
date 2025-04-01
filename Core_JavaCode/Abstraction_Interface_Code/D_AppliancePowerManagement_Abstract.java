
import java.util.*;
abstract class Appliance 
{
  abstract void turnOn(); 
  abstract void getPowerConsumption();
}
class WashingMachine extends Appliance
{
   void turnOn()
   {
	System.out.println("washing machine is running");  
   }  

   void getPowerConsumption() 
   {
	 System.out.println("Power Consumption: 500 watts");   
   } 
}

class Refrigerator extends Appliance
{
	void turnOn()
    {
     System.out.println("refrigerator is cooling");   
    }  

  void getPowerConsumption() 
   {
	  System.out.println("Power Consumption: 150 watts");   
 
   } 
}
public class D_AppliancePowerManagement_Abstract
{
public static void main(String x[])
 {
    WashingMachine w1=new WashingMachine();
	w1.turnOn();
	w1.getPowerConsumption();
	
	Refrigerator r1=new Refrigerator();
	r1.turnOn();
	r1.getPowerConsumption();
 }
}