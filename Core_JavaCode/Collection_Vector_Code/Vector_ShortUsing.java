import java.util.*;
public class Vector_ShortUsing
{

	public static void main(String args[])
	{
		Vector v = new Vector(5);
		Scanner sc = new Scanner(System.in);

		System.out.println("\n Display element in Vector:");


		for(int i=0;i<5;i++)
		{
			int no = sc.nextInt();
			v.add(no);
		}
		 


		for(int i=0;i<v.size();i++)
		{
			for(int j=i+1;j<v.size();j++)
			{
					if((int)v.get(i)>(int)v.get(j))
					{
						int temp = (int)v.get(i);
							//v[i]=v[j];
							v.set(i,v.get(j));
							v.set(j,temp);
							
							
					}
			}
		}
		System.out.println("After Sorting:"+v);
		
		
	}

}
        
            