
  
     import java.util.*;
public class TargetSumArrayRevision
{
	public static void main(String x[])
	{
		Scanner m=new Scanner(System.in);
		
		int a[]=new int[5];
		
		System.out.println("Enter values in array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=m.nextInt();
		}
		
		System.out.println("Enter target value:");
		int val=m.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==val)
				{
					System.out.println(a[i]+"+"+a[j]+"---->"+val);
				}
			}
		}
	}
}

/*
C:\Program Files\Java\jdk1.8.0_202\bin\ArrayCode>javac TargetSum.java

C:\Program Files\Java\jdk1.8.0_202\bin\ArrayCode>java TargetSum
Enter values in array:
1 2 3 4 5
Enter target value:
5
1+4---->5
2+3---->5
*/
