import java.util.*;
class Rectangle
{
  int len,wid;
void setLengthWidth(int len,int wid)
{
  this.len=len;
  this.wid=wid;
}

 void showArea()
 {
  int area=(len*wid);
  System.out.printf("Area of Rectangle is %d",area);
 }
}

public class ClassObject_Que2_RectangleArea
{
public static void main(String x[])
{
 Scanner xyz= new Scanner(System.in);

 System.out.println("Enter the length of triangle:");
 int len=xyz.nextInt();

 System.out.println("Enter the width of triangle:");
 int wid=xyz.nextInt();

 Rectangle r1= new Rectangle();
 r1.setLengthWidth(len,wid);
 r1.showArea();
}
}




