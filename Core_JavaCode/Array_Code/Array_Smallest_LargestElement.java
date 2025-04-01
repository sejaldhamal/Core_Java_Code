
/*Find the largest and smallest element in an array
Write a program to find the maximum and minimum value in an unsorted array.
*/

import java.util.*;
public class Array_Smallest_LargestElement
{
   public static void main(String x[])
   {
      Scanner xyz=new Scanner(System.in);
	  int a[]=new int[5];
	  System.out.println("Enter the Array Elements: ");
	  for(int i=0; i<a.length ; i++)
	  {
	     a[i]=xyz.nextInt();
		 }
		 int min=a[0];
		 int max=a[0];
		 for(int i=0 ; i<a.length ; i++)
		 {
		 
              if(a[i]>max)
              {
                 max=a[i];
               }
              if(a[i]<min)
              {
                 min=a[i];
               }
          }
    
	System.out.println("max value in array is:"+max);
	System.out.println("min value in array is:"+min);
	}
	}