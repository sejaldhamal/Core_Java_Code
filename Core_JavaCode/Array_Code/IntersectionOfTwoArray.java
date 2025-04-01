
       import java.util.*;
public class IntersectionOfTwoArray
{
	public static void main(String x[])
	{
		Scanner m=new Scanner(System.in);
		
		int a[]=new int[5];
		int b[]=new int[5];
		
		System.out.println("Enter values in first array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=m.nextInt();
		}
		
		System.out.println("Enter values in second array");
		for(int i=0;i<b.length;i++)
		{
			b[i]=m.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j] && !flag)
				{
					System.out.print(a[i]+" ");
					flag=true;
				}
			}
		}
	}
}
