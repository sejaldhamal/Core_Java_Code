import java.util.*;
class Sum
{
  int x[];
void calSum(int ...x)
{
 
 int sum=0;
 for(int i=0 ; i<x.length ; i++)
  {
    sum=sum+x[i];
      }
    System.out.println("Sum of all elements is: "+sum);
       }
    }

public class ClassObject_Que5_SumElement_UsingVarArgument
{
 public static void main(String x[])
{
 int a[]=new int[3];
  Scanner xyz= new Scanner(System.in);
  for(int i=0 ; i<a.length ; i++)
  {
     a[i]=xyz.nextInt();
   }

 Sum s1=new Sum();
 s1.calSum(a);
 }
}

