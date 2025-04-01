/*Sum of elements in an array
Calculate the sum of all elements in the array.*/

import java.util.*;
public class Array_Sum
{
    public static void main(String x[])
	{
	 Scanner xyz=new Scanner(System.in);
	 int sum=0;
	 int a[]=new int[5];
	 System.out.println("Enter the Array Elements:");
	 for(int i=0 ; i<a.length ; i++)
	 { 
	    a[i]=xyz.nextInt();
		}
		
		for(int i=0 ; i<a.length ; i++)
		{
		   sum=sum+a[i];
		  }
		System.out.println("Sum of Array is:"+sum);
		
	}
}
