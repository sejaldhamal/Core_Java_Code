import java.util.*;
public class ArrayOddEven
{
public static void main(String x[])
{
Scanner xyz = new Scanner(System.in);
int a[],i,j;
a=new int[5];
System.out.println("Enter the array element:");
for(i=0 ; i<5 ; i++)
{
 a[i]=xyz.nextInt();
}
System.out.print("Even element are:");
for(i=0 ; i<5 ; i++)
{
if(a[i]%2==0)
{
System.out.printf(" %d",a[i]);
}
}
System.out.print("\n

Odd element are:");
for(i=0 ; i<5 ; i++)
{
if(a[i]%2==1)
{
System.out.printf(" %d",a[i]);
}
}
}}