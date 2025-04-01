import java.util.*;
class Power
{
int ind,b;
Power(int ind,int b)
{
this.ind=ind;
this.b=b;
}
 int getPower()
{
int p=1;
for(int i=1 ;i<=ind; i++)
{
 p=p*b;
}
return p;
}
}

public class PowerConstructorApp
{
public static void main(String x[])
{
Scanner xyz =new Scanner(System.in);
System.out.println("Enter the base of number:");
int b=xyz.nextInt();

System.out.println("Enter the Index of number:");
int ind=xyz.nextInt();

Power p1=new Power(ind,b);
System.out.println("Power of the number is: "+p1.getPower());


}
}

