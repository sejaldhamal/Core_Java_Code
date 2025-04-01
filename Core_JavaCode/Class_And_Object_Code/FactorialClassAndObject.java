import java.util.*;
class Factorial{
int no;
void setValue(int x)
{
no=x;
}

void showFactorial()
{  int fact=1;
for(int i=1 ; i<=no ;i++ )
{
 fact=fact*i;
}
System.out.printf("Factorial is %d",fact);
}
}
public class FactorialClassAndObject
{
public static void main(String x[])
{
Factorial f1= new Factorial();

Scanner xyz= new Scanner(System.in);
System.out.println("Enter Number");
int no=xyz.nextInt();


f1.setValue(no);
f1.showFactorial();
}
}