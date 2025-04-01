import java.util.*;
abstract class Shape    //abstract class 
{
 abstract void getArea();    //abstract method
 abstract void getperimeter();   //abstract method
}

class Circle extends Shape   //implementer class circle
{
   float r;
    void setArea(float r)
    {
     this.r=r;
     }
 void getArea()  //return the area of circle
 {
 
  float AreaCircle=3.14f*(r*r);
  System.out.println("Area of Circle is:"+AreaCircle);
 }
 void getperimeter()  //return perimeter of the circle
 {
	 float perimeterCircle=2*3.14f*r;
	 System.out.println("Perimeter of Circle is: "+perimeterCircle);
}

}


class Triangle extends Shape    //implementer class Triangle
{
int l,w;
void setArea(int l,int w)
{
this.l=l;
this.w=w;
}
void getArea()   //returns the area of Triangle
 {
 double AreaTriangle=l*w;
 System.out.println("Area of Triangle is:"+AreaTriangle);
 }
 void getperimeter()   //returns the perimeter of triangle
 {
	 double perimeterTriangle=2*(l+w);
	 System.out.println("Perimeter of triangle is: "+perimeterTriangle);
}
}


public class AbstractShape  //class
 {
 public static void main(String x[])  //main method
 {
 Scanner xyz= new Scanner(System.in);
 System.out.println("Enter the radius: ");
 float r=xyz.nextFloat();
 System.out.println("Enter the length: ");
 int b=xyz.nextInt();
 System.out.println("Enter the Width: ");
 int h=xyz.nextInt();


 Circle a1=new Circle();  //object of Circle
 Shape s1=new Circle();
  s1.setArea(r);
  s1.getArea();
  s1.getperimeter();
 Triangle b1=new Triangle();  //object of triangle
  b1.setArea(b,h);
  b1.getArea();
  b1.getperimeter();
 }
}