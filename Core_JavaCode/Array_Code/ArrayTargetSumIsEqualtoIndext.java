import java.util.*;
public class ArrayTargetSumIsEqualtoIndext
{
public static void main(String x[])
{
Scanner xyz = new Scanner(System.in);
int a[],i,j;

a=new int[5];
boolean flag=false;

System.out.println("Enter the target:");
int target=xyz.nextInt();


System.out.println("Enter the array element:");
for(i=0 ; i<a.length ; i++)
{
 a[i]=xyz.nextInt();
}


for(i=0 ; i<a.length-1 ; i++)
{
  for(j=i+1 ; j<a.length ; j++)
    {
        if(a[i]+a[j]==target)
         {
            flag=true;

System.out.printf("%d %d",i,j);
}
}
}
if(!flag)
{
   System.out.println("NotFound");
     }
}
}




