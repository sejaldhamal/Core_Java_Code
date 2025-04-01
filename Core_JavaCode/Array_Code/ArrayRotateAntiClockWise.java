
import java.util.*;
public class ArrayRotateAntiClockWise
{
public static void main(String x[])
{
Scanner xyz = new Scanner(System.in);
int a[],i,j,temp=0;
a=new int[6];

System.out.println("Enter the array element:");
for(i=0 ; i<a.length ; i++)
{
 a[i]=xyz.nextInt();
}

System.out.println("Enter the number of rotation:");
int n=xyz.nextInt();


for(j=0 ; j<n ; j++)
{
 temp=a[0];

for(i=0 ;i<a.length ; i++)
{
  a[i]=a[i+1];
  }

a[a.length-1]=temp;
}

for(i=0 ; i<a.length ; i++)
{
  System.out.printf("%d ",a[i]);
}
}
}


