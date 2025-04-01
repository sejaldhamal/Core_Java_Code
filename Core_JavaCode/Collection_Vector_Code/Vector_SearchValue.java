import java.util.*;
public class Vector_SearchValue
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		System.out.println("Display Vector:");
		for(int i=0;i<v.size();i++)
		{
			Object obj = v.get(i);
			System.out.print(obj + "\t");
		}

		System.out.println("\nEnter value for search");
		int value=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<v.size();i++)
		{
			if((int)v.get(i)==value) 
			{
				flag=true;
				break;						
			}
		}
		if(flag)
		{
			System.out.println("Vector Value Present");
		}
		else
		{
			System.out.println("Vector Value not Present");

		}

	}
}
