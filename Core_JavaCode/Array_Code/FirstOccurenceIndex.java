import java.util.*;
public class FirstOccurenceIndex
{
	public static void main(String x[])
	{
		Scanner m=new Scanner(System.in);
		
		int a[]=new int[5];
		System.out.println("Enter values in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=m.nextInt();
		}
		
		System.out.println("Enter element to find occurrence:");
		int val=m.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==val)
			{
			System.out.println("Index of first of occurrence of "+val+" is :"+i);
		           break;
			}
		}
	}
}
