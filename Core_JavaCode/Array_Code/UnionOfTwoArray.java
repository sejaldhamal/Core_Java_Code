import java.util.*;
public class UnionOfTwoArray
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
			
		int c[]=new int[10];
		int k=0;
		for(int i=0;i<a.length;i++,k++)
		{
			c[k]=a[i];
		}
		
		for(int i=0;i<b.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				c[k]=b[i];
				k++;
			}
		}
		
		System.out.println("Union of array is:");
		for(int i=0;i<k;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}

