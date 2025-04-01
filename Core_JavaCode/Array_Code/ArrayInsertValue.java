import java.util.*;
public class ArrayInsertValue
{
public static void main(String x[])
{
Scanner xyz = new Scanner(System.in);
int a[],i,index,value;
a=new int[6];
System.out.println("Enter the array element:");
for(i=0 ; i<5 ; i++)
{
 a[i]=xyz.nextInt();
}
System.out.println("Enter the Index:");
index=xyz.nextInt();
System.out.println("Enter the value:");
value=xyz.nextInt();

for(i=a.length-1 ; i>index ; i--)
{
  a[i]=a[i-1];
  
}
a[index]=value;
for(i=0 ;i<a.length ; i++)
{
System.out.printf

(" %d",a[i]);
}
}
}