
/*Generate a series based on the powers of 2 (2^0, 2^1, 2^2, ... up to N).*/


import java.util.*;
public class Powerof2_SeriesQue10
{
	public static void main(String x[])
	{
		Scanner m=new Scanner(System.in);
		
		System.out.println("Enter limit:");
		int n=m.nextInt();
		
		System.out.println("Enter Number to find power:");
		int no=m.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int p=1;
			for(int j=1;j<=i;j++)
			{
				p=p*no;
			}
			System.out.print(p+" ");
		}
	}
}
/*
C:\Program Files\Java\jdk1.8.0_202\bin\Series>java Power_Series
Enter limit:
10
Enter Number to find power:
2
2 4 8 16 32 64 128 256 512 1024
*/

