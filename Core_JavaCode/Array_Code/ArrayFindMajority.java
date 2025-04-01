import java.util.*;
public class ArrayFindMajority
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
  
     for(int i=0;i<a.length;i++)     
     {
       int count=1;
       for(j=i+1 ; j<a.length ; j++)
       {
           if(a[i]==a[j])
           {
               count++;
          }
    }
}
      if(count>a.length/2)
      {
        System.out.println("Majority Element Found");
      } 
  }
}