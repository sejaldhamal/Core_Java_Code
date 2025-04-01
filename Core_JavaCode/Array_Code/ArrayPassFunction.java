import java.util.*;
public class ArrayPassFunction
{
  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
    
     int a[];
      
    a=new int[5];

    System.out.println("Enter the Array Elemant:");
    for(int i=0;i<a.length;i++)     
    {
      a[i]=xyz.nextInt();
     }

   findEvenOdd(a);
}




 public static void findEvenOdd(int a[])
 {

   System.out.println("Even Numbers in array are: ");
     for(int i=0;i<a.length;i++)     
     {
      if(a[i]%2==0)
       {
          System.out.println(+a[i]);
          }
       }
   
    
    System.out.println("Odd Numbers in array are: ");
     for(int i=0;i<a.length;i++)     
     {
      if(a[i]%2==1)
       {
          System.out.println(+a[i]);
          }
       }
   
   }
} 