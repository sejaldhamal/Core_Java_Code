import java.util.*;
class SimpleInterest
{
  double p,r,t;
void setValue(double p,double r,double t)
{
  this.p=p;
  this.r=r;
  this.t=t;
}
  
void calculateSI()
{
   System.out.println("Simple interest is: "+(p*r*t));
}
}

public class ClassobjectSimpleInterest
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);

SimpleInterest s1=new SimpleInterest();

System.out.println("Enter the Principle: ");
double p=xyz.nextDouble();

System.out.println("Enter the Rate: ");
double r=xyz.nextDouble();

System.out.println("Enter the Time: ");
double t=xyz.nextDouble();

s1.setValue(p,r,t);
s1.calculateSI();
}
}



