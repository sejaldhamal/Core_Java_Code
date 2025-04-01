/*Calculate the nth term of an arithmetic progression (AP)*/
import java.util.*;
public class Arithmetic_Nth_Term_SeriesAP
{
	public static void main(String x[])
	{
		Scanner m=new Scanner(System.in);
		
		System.out.println("Enter difference:");
		int diff=m.nextInt();
		
		System.out.println("Enter term at which want to find the value:");
		int n=m.nextInt();
		
		int c=0;
		for(int i=1;i<=n;i++)
		{
			System.out.print(c+" ");
			if(i==n)
			{
				System.out.println("\n"+n+"th term is:"+c);
			}
			c=c+diff;
		}
		
	}
}
/*
C:\Program Files\Java\jdk1.8.0_202\bin\Series>javac Arithmetic_Nth_Term_Series.java

C:\Program Files\Java\jdk1.8.0_202\bin\Series>java Arithmetic_Nth_Term_Series
Enter difference:
2
Enter term at which want to find the value:
4
0 2 4 6
4th term is:6
*/
