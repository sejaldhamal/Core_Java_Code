import java.util.*;
class Area
{
   Area(int r)
   {
	System.out.println("Area of Circle is: "+r*r*3.14);  
   }   
   
   Area(int b,int l)
   {
	System.out.println("Area of Rectangle is: "+b*l);    
   }   
   
   Area(int h,float b)
   {
	System.out.println("Area of Triangle is: "+0.5*b*h);   
	}  
}
public class D_ConstructOverLoadArea
{
 public static void main(String x[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the radius");
  int r=s.nextInt();
  Area a1=new Area(r);
  
  System.out.println("Enter the Breadth");
  int b=s.nextInt();
  
  System.out.println("Enter the length");
  int l=s.nextInt();
  Area a2=new Area(b,l);
  
  System.out.println("Enter the height");
  int h=s.nextInt();
  
  System.out.println("Enter the base");
  float bs=s.nextFloat();
  Area a3=new Area(h,bs);
 }
}