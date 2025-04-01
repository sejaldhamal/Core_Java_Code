/*Q3. Merging Two Lists
Merge two ArrayList objects into one, making sure that the merged list does not contain duplicates.*/

import java.util.*;
public class ArrayList_MergingTwoList
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		HashSet<Integer> hs=new HashSet<Integer>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Enter Size In FirstArrayList:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			int no=sc.nextInt();
			al.add(no);
		}
		System.out.println("Enter Size In SecondArrayList:");
		int size1=sc.nextInt();
		
		for(int i=0;i<size1;i++)
		{
			int value=sc.nextInt();
			al.add(value);
		}
		System.out.println("Merge two ArrayList ");
                hs.addAll(al);
                
                for (Integer itr : hs) 
		{
            		System.out.println(itr);
       		}
	
	}
}
