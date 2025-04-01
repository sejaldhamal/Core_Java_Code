import java.util.*;
class Power{
int b,i;
void setValue(int base, int index)
{

b=base;
i=index;
}

void showPower()
{  int pow=1;
for(int a=1 ; a<=i ;a++ )
{
 pow=pow*b;
}
System.out.printf("power is %d",pow);
}
}
public class PowerClassAndObject
{
public static void main(String x[])
{
Power p1= new Power();

Scanner xyz= new Scanner(System.in);
System.out.println("Enter Base");
int b=xyz.nextInt();
System.out.println("Enter Index");
int i=xyz.nextInt();


p1.setValue(b,i);
p1.showPower();
}
}