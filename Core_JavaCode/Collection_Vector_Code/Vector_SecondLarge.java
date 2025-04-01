import java.util.*;
public class Vector_SecondLarge 
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector v=new Vector(5);
		System.out.println("\n ADD element in Vector:");

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


		 int max=(int)v.get(0);
            	 for (int i = 0; i < v.size(); i++)
		 {
        		if((int) v.get(i)< max)
       			 {
         			System.out.println("\nSecond large vector="+v.get(i));
         			break;
        		  }
         	}
	}
}
	
