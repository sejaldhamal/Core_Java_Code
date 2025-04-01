/*
Reverse the elements of an array */

import java.util.*;
public class Array_Reverse
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
		      
			     int temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
				 
			}
		}
		System.out.println("Array in Reverse is:");
		 for(int i=0 ; i<a.length ; i++)
	    { 
	       System.out.printf("%d ",a[i]);
		}
	}
}