import java.util.*;
public class ArrayMinMax
{
public static void main(String x[])
{
Scanner xyz = new Scanner(System.in);
int a[],i,max,min;
a=new int[5];
System.out.println("Enter the array element:");
for(i=0 ; i<5 ; i++)
{
 a[i]=xyz.nextInt();
}

max=a[0];
for(i=0 ; i<5 ; i++)
{

 if(a[i]>max)
{
 max=a[i];
 }
}
System.out.printf("maximun element in array is %d\n",max);
min=a[0];
for(i=0 ; i<5 ; i++)
{

 if(a[i]<min)
{
 min=a[i];
 }
}
System.out.printf("

minimum element in array is %d",min);


}
}
