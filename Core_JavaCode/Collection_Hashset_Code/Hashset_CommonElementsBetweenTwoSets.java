/*Q4. Finding Common Elements Between Two Sets
Write a program that takes two HashSet objects and prints the elements that are common to both*/

import java.util.*;
public class Hashset_CommonElementsBetweenTwoSets
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		HashSet hs1=new HashSet();
		System.out.println("Enter Size for First HashSet:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			int no=sc.nextInt();
			hs1.add(no);
		}
		HashSet hs2=new HashSet();
		System.out.println("Enter Size for Second HashSet:");
		int size1=sc.nextInt();
		for(int i=0;i<size1;i++)
		{
			int no=sc.nextInt();
			hs2.add(no);
		}
		System.out.println("Common Elements Between Two Sets:");
		for (Object obj : hs1) 
		{
            		if (hs2.contains(obj)) 
			{
                		System.out.println(obj);
            		}
        	}

       		/* for (Object obj : hs1) 
		 {
           		 boolean flag = false;
           		 for (Object obj2 : hs2) 
			 {
                		if (obj.equals(obj2)) 
				{
                    			flag = true;
                    			break;
                		}
            		}
            		if (flag) 
			{
                		System.out.println(obj);
            		}
       		 }*/
	

	}
}

