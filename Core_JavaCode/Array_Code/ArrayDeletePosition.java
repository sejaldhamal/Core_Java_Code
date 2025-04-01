import java.util.*;
public class ArrayDeletePosition
{
public static void main(String x[])
{
Scanner xyz = new Scanner(System.in);
int a[],i,delete;
a=new int[5];
System.out.println("Enter the array element:");
for(i=0 ; i<a.length ; i++)
{
 a[i]=xyz.nextInt();
}
System.out.print("Before the delete Array:");
for(i=0 ; i<a.length ; i++)
{
System.out.printf(" %d",a[i]);
}

System.out.print("\nEnter delete Element at the desired position:");
delete=xyz.nextInt();

System.out.print("After the delete Array:");
for(i=delete ; i<a.length-1 ; i++)
{
 a[i]=a[i+1];
}

for(i=0 ; i<a.length-1 ; i++)
{
System.out.printf(" %d",a[i]);
}
}
}
