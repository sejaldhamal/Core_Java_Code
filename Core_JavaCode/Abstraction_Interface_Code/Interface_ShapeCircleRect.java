
import java.util.*;
interface Shape
{
  double calculateArea();
 }
 
 class Circle implements Shape
 {
    private double radius;
	public Circle(double radius)
	{
	   this.radius=radius;
	 }
	 
	 public double calculateArea()
	 {
	   return Math.PI*radius*radius;
	 
	  }
  }
  
  class Rectangle implements Shape
 {
    private double length;
	private double width;
	 public Rectangle(double length,double width)
	{
	   this.length=length;
	   this.width=width;
	 }
	 
	public double calculateArea()
	 {
	   return length*width;
	 
	  }
  }
  
public class Interface_ShapeCircleRect
{
  public static void main(String x[])
  {
    Shape c1=new Circle(5);
    Shape r1=new Rectangle(4,2);

   System.out.println("Area of Circle is: " +c1.calculateArea());
    System.out.println("Area of Rectangle is: " +r1.calculateArea());
  }
}  