/*Find an element in the array such that it is greater than or equal to its neighbors.*/


  import java.util.*;
public class PeakElement_InArray_Revision
{
	public static void main(String x[])
	{
		Scanner m=new Scanner(System.in);
		
		int a[]=new int[6];
		
		System.out.println("Enter values in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=m.nextInt();
		}
		
		boolean flag=false;
		
		if(a[0]>=a[1])
		{
			flag=true;
			System.out.println(a[0]);
		}
		
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]>=a[i-1] && a[i]>=a[i+1])
			{
				flag=true;
				System.out.println(a[i]);
			}
		}
		
		if(a[a.length-1]>=a[a.length-2])
		{
			flag=true;
			System.out.println(a[a.length-1]);
		}
		
		if(!flag)
		{
		 System.out.println("there is no peak element in array");
		}
	}
}


/*Enter values in array:
4 3 20 4 1 2
4
20
2
*/