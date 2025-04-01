/*Q5.  Map to List Conversion
Write a program that converts a HashMap to a list of entries and then sorts the list by the keys.*/

import java.util.*;
public class Hashmap_SortsKeys
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		HashMap hm=new HashMap();
		List l1=new ArrayList();
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			int value=sc.nextInt();
			sc.nextLine();
			String key=sc.nextLine();
			hm.put(value,key);
		}
		l1.addAll(hm.entrySet());
			
		l1.sort(Map.Entry.comparingByKey());
		System.out.println(l1);
	}
}
