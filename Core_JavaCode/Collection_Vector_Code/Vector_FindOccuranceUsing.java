
import java.util.*;
public class Vector_FindOccuranceUsing
{

	public static void main(String args[])
	{
		List v = new Vector(5);
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			int no = sc.nextInt();
			v.add(no);
		}
		System.out.println("\nOccurrence of every element in Vector:");

		for(int i=0;i<v.size();i++)
		{
			int count=1;
			for(int j=i+1;j<v.size();j++)
			{
				if(v.get(i).equals(v.get(j)))
				{
					count++;
					//v[j]=-1;
					v.set(j,-1);
				}
			}
			if(count>0 && (int)v.get(i)!=-1)
			{
				System.out.println(v.get(i)+"=======>"+count);
			}
		}
		
	}
}	
		
		
 
