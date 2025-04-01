  import java.util.*;
public class CheckArraySortedOrNot
{
	public static void main(String x[])
	{
		Scanner m=new Scanner(System.in);
		
		int a[]=new int[6];
		System.out.println("Enter values in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=m.nextInt();
		}
		
		
		boolean as=true,ds=true;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				as=false;
			}
			if(a[i]<a[i+1])
			{
				ds=false;
			}
		}
		
		if(as)
		{
			System.out.println("Array is sorted in Ascending order...");
		}
		else if(ds)
		{
			System.out.println("Array is sorted in Descending order...");
		}
		else
		{
			System.out.println("Array is not sorted....");
		}
	}
}

