import java.util.*;
public class ArrayFindMissingElement
{
public static void main(String x[])
{
Scanner xyz = new Scanner(System.in);
int a[],i,j;
a=new int[5];
System.out.println("Enter the array element:");
for(i=0 ; i<a.length ; i++)
{
 a[i]=xyz.nextInt();
}

System.out.println("Missing Element in array are :");
for(i=0; i<a.length-1; i++)
{
 for(j=a[i]+1 ; j<a[i+1] ; j++)
  {
    System.out.println(+j);
     }
   }
 }
}