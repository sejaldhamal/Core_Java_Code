import java.util.*;
public class ArrayInAscendingOrder
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
System.out.printf("Display the array elements in Asccending order:");
for(i=0 ; i<5 ; i++)
{
 for(j=i+1 ; j<5 ; j++)
{
if(a[i]>a[j])
{
 int temp=a[i];
 a[i]=a[j
 
a[j]=temp;
}
}
}
for(i=0 ; i<5 ; i++)
{
System.out.printf(" %d",a[i]);
}

System.out.printf("\n Display the array elements in descending order:");
for(i=0 ; i<5 ; i++)
{
 for(j=i+1 ; j<5 ; j++)
{
if(a[i]<a[j])
{
 int temp=a[i];
 a[i]=a[j];
a[j]=temp;
}
}
}

for(i=0 ; i<5 ; i++)
{
System.out.printf(" %d",a[i]);
}
}
}

