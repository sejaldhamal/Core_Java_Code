interface Transport
{
 void move();
 void stop();
}

abstract class Vehicle implements Transport
{
 abstract public void move();//abstract method
  {
  }
   public void stop() //Concrete method -having body
   {
     System.out.println("Vehicle has stop");
   }
}

class Car extends Vehicle
{
  public void move()
  {
    System.out.println("The Car is moving");
  }
  
  public void stop()
  {
     System.out.println("The Car has stopped");
  }
}  

class Bus extends Vehicle
{
   public void move()
   {
     System.out.println("The Bus is moving");
   }
   
  public void stop()
  {
   System.out.println("The Bus has stopped");
  }
}

public class D_Transportation_System_AbstractInterface
{
   public static void main(String x[])
   {
	 Transport t1[]=new Transport[2];// array of interface class 
    	 t1[0]=new Car();
         t1[0].move();
         t1[0].stop();	

          t1[1]=new Bus();
          t1[1].move();
          t1[1].stop(); 		  
   }   
}