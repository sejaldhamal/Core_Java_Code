import java.util.*;
class NumberComparison
{
    int num1,num2;
   void setNum(int num1,int num2)
   {
      this.num1=num1;
      this.num2=num2;
   }
   
  void compare()
  {
     if(num1==num2)
     {
       System.out.println(num1+ " is equal to " +num2);
     }
      else if(num1>num2)
     {
       System.out.println(num1+ " is greater than " +num2);
     }
   
     else
     {
       System.out.println(num1+ " is less than " +num2);
     }

  }
}

public class classobjectNumComparison
{
  public static void main(String x[])
{
   Scanner xyz=new Scanner (System.in);

NumberComparison n1=new NumberComparison();

System.out.println("Enter the num1: ");
int num1=xyz.nextInt();

System.out.println("Enter the num2: ");
int num2=xyz.nextInt();

n1.setNum(num1,num2);
n1.compare();
}
}




