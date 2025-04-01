import java.util.*;
class Calculator
{
   int a,b;
void setNum(int a,int b)
{
   this.a=a;
   this.b=b;
}
 
void Add()
{
   System.out.printf("Addition of number is: %d ",a+b);
}

void Sub()
{
   System.out.printf("\nSubtration of number is: %d ",a-b);
}

 void Mul()
{
   System.out.printf("\nMultiplication of number is: %d ",a*b);
}

void Div()
{
   System.out.printf("\nDivision of number is: %d ",a/b);
}
}

public class classobjectaddmuldiv
{
   public static void main (String x[])
{
   Scanner xyz=new Scanner(System.in);
  Calculator c1=new Calculator();

  System.out.println("Enter the value of a: ");
  int a=xyz.nextInt();
    
  System.out.println("Enter the value of b: ");
  int b=xyz.nextInt();
 c1.setNum(a,b);
 c1.Add();
 c1.Sub();
 c1.Mul();
 c1.Div();
}
}