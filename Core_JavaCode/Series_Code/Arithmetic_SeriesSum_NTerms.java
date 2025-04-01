/*Calculate the sum of the first N terms of an arithmetic series.*/

import java.util.*;
public class Arithmetic_SeriesSum_NTerms
{
	public static void main(String x[])
	{
		Scanner m=new Scanner(System.in);
		
		System.out.println("Enter the limit:");
		int n=m.nextInt();
		
		System.out.println("Enter the difference:");
		int diff=m.nextInt();
		
		int sum=0,c=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print(c+" ");
			sum=sum+c;
			c=c+diff;
		}
		System.out.println("\nSum of first "+n+" terms:"+sum);
	}
}

/*
C:\Program Files\Java\jdk1.8.0_202\bin\Series>javac Sum_Arithmetic_NTerms.java

C:\Program Files\Java\jdk1.8.0_202\bin\Series>java Sum_Arithmetic_NTerms
Enter the limit:
10
Enter the difference:
2
0 2 4 6 8 10 12 14 16 18
Sum of first 10 terms:90

*/

