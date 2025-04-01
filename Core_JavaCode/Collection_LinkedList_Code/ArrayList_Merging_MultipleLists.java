/*Q3. Merging Multiple Lists
 Description: Merge two ArrayLists into one while ensuring no duplicates are present.
 Print the merged list sorted by item names.*/

import java.util.*;
public class ArrayList_Merging_MultipleLists
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		HashSet<String> hs=new HashSet<String>();
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Enter Size For First ArrayList Items:");
		int size=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter a "+ (i+1) +" item");
			String item=sc.nextLine();
			al.add(item);
		}
		
		System.out.println("Enter Size For Second ArrayList Items:");
		int size1=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<size1;i++)
		{
			System.out.println("Enter a "+ (i+1) +" item");
			String item=sc.nextLine();
			al.add(item);
		}
		
		System.out.println("\Merge Two ArrayList");
		hs.addAll(al);
		ArrayList<String> list = new ArrayList<String>(hs);
        	           Collections.sort(list);

                       for(String items:list)
		{
			System.out.println(items);		
      }      }
}
