/*8. Remove Entries with Specific Values in a Map
Write a program that removes entries from a map that have a specific value.
Example:
Input: Map<String, Integer> map = {"a": 1, "b": 2, "c": 1};
Output after removing value 1: {"b": 2} */

import java.util.*;
public class Map_RemovewithSpecificValueMap
{
	public static void main(String args[]) 
	{
        	Scanner sc = new Scanner(System.in);
        	TreeMap<String, Integer> tm = new TreeMap<String, Integer>();

        	System.out.println("Enter size For First TreeMap");
        	int size = sc.nextInt();
       		sc.nextLine(); 
	        for (int i = 0; i < size; i++)
		 {
           		 System.out.println("Enter A Character and Thier Value:");
           		 String key = sc.nextLine();
            		 int value = sc.nextInt();
            		 sc.nextLine(); 
	                 tm.put(key, value);
       		 }

		System.out.println("Display Data From  Map");
		Set<Map.Entry<String, Integer>> set=tm.entrySet();
		for(Map.Entry<String, Integer> m:set)
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		
                          System.out.println("Display Data From After removing value Map");
		set=tm.entrySet();
		for(Map.Entry<String, Integer> m:set)
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}

	}
}
