   import java.util.*;
public class MoveAllZeroesAtEnd
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
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				//to move at the front check a[j]==0
				if(a[i]==0)	//move at the end  
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("Array after moving all zeroes at end:");
		for(int arr:a)
		{
			System.out.print(arr+" ");
		}
	}
}
