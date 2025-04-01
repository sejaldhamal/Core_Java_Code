import java.util.*;
public class TestRotateArrayFromNthPosition
{
public static void main(String x[])
{
int a[],i,j,position,first;
a=new int[5];
Scanner xyz=new Scanner(System.in);
System.out.printf("Enter the Array: ");
for(i=0 ; i<a.length ;i++)
{
 a[i]=xyz.nextInt();
}

System.out.printf("Enter the position you want to Rotate Array: ");
position=xyz.nextInt();

first=a[0];


for(j=0 ; j<a.length-1 ; j++)
{
  a[j]=a[j+1];
}
a[a.length-1]=first;

System.out.printf("\nRotate Array is:");
for(i=0 ; i<a.length ;i++)
{
System.out.printf(" %d",a[i]);
}
}
}