/*Q6. Implementing a Simple Phone Book Using HashMap
Create a simple phone book program using a HashMap where the key is a person's name and the value is their phone number.*/

import java.util.*;
public class Hashmap_PhoneBook
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
			int key=sc.nextInt();
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

