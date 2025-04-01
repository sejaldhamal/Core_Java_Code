/*Find the missing number in an array
Given an array of size n-1 with numbers from 1 to n, find the missing number.
*/


import java.util.*;
public class Missing_Elements_In_Array
{
    public static void main(String x[])
	{
	 Scanner xyz=new Scanner(System.in);
	 int a[]=new int[5];
	 System.out.println("Enter the Array Elements:");
	 for(int i=0 ; i<a.length ; i++)
	 { 
	    a[i]=xyz.nextInt();
		}
		
		
		
		for(int i=0 ; i<a.length ; i++)
		{
		   for(int j=i+1 ; j<a.length ; j++)
		   {
		       if(a[i]>a[j])
			   {
			     int temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
				} 
		   }
		}
		for(int i=0 ; i<a.length-1 ; i++)
		{
		   for(int j=a[i]+1 ; j<a[i+1] ; j++)
		   {
		     System.out.printf("%d ",j);
           }
         }	
   }
}   