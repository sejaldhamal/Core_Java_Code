    import java.util.*;
public class LongestIncreasingSubsequence
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
		
		int c=1;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
				c++;
			}
		}
		System.out.println("Count of longest increasing subsequence:"+c);
	}
}
