import java.util.*;
public class ArrayPairWithGivenSum
{
public static void main(String x[])
{
int a[],i,j,num,sum;
a=new int[5];
Scanner xyz=new Scanner(System.in);

System.out.printf("Enter the Array: ");
for(i=0 ; i<a.length ;i++)
{
 a[i]=xyz.nextInt();
}

System.out.printf("Enter the Sum: ");
num=xyz.nextInt();

for(i=0 ; i<a.length ;i++)
{
for(j=i+1 ; j<a.length ; j++)
{
 sum=a[i]+a[j];
if(sum==num)
{
System.out.println(i+" "+j);
      }
    }
  }
 }
}

