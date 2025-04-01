import java.util.*;
class NumberChecker
{
    int no;
   void setNum(int no)
   {
      this.no=no;
   
   }
   
  void isEven()
  {
     if(no%2==0)
     {
       System.out.println("Number is Even");
     }
     
     else
     {
        System.out.println("Number is Odd");
     }
     

  }
}

public class classobjectNumChecker
{
  public static void main(String x[])
{
   Scanner xyz=new Scanner (System.in);

NumberChecker n1=new NumberChecker();

System.out.println("Enter the number: ");
int no=xyz.nextInt();



n1.setNum(no);
n1.isEven();
}
}

