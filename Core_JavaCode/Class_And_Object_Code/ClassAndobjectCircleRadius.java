import java.util.*;
class Circle
{
 float r;
 void setRadius(float r)
 {
  this.r=r;
 }

 void showArea()
 {
 
 float area=3.14f*(r*r);
 System.out.printf("Area of Circle is %f",area);
 }

}
public class ClassAndobjectCircleRadius
{
public static void main(String x[])
{
Circle c1=new Circle();

Scanner xyz=new Scanner(System.in);
System.out.println("Enter the Radius:");
int r=xyz.nextInt();


c1.setRadius(r);
c1.showArea();
}
}

