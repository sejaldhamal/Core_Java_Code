/*6. Implement a Simple Phonebook Using Map
Write a program that implements a simple phonebook system. Store names as keys and phone numbers as values using a Map<String, String>. Provide methods to add, remove, and lookup a phone number.
Example:
Input: add("Alice", "1234567890");
Output: {"Alice": "1234567890"} */

import java.util.*;
public class Map_PhoneBookUsingHashMap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		HashMap hm=new HashMap();
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++)
		{
			sc.nextLine();
			String name=sc.nextLine();
			/int key=sc.nextInt();
			hm.put(name,key);
		}
		System.out.println("Display person's name and  is their phone number");
		Set<Map.Entry> set=hm.entrySet();
		for(Map.Entry m:set)
		{
			System.out.println(m.getKey()+"\t\t"+m.getValue());
		}

	}
}
