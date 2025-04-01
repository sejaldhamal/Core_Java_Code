/*Find the number of even and odd numbers in an array
Count how many even and odd numbers are in an array.
*/

import java.util.*;
 public class EvenOddArrayElement
 {
    public static void main(String x[])
    {
     int a[],i,j;
      a=new int[5];                  
      Scanner xyz=new Scanner(System.in);

      System.out.printf("Enter the Array: ");
      for(i=0 ; i<a.length ;i++)
      {
          a[i]=xyz.nextInt();
        }
		System.out.print("Even Numbers in Array are: ");
		 for(i=0 ; i<a.length ;i++)
         {
		    if(a[i]%2==0)
			{
			  System.out.printf("%d ",a[i]);
	         }
			
		}
		System.out.print("\nOdd Numbers in Array are: ");
		 for(i=0 ; i<a.length ;i++)
         {
		    if(a[i]%2==1)
			{
			  System.out.printf("%d ",a[i]);
	         }
			
		}
	}
	
 }