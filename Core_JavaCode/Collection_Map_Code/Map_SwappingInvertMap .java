/*9. Invert a Map
Write a program to invert a Map. This means swapping the keys with the values. If the values are not unique, decide on a policy for handling the duplication (for example, store multiple values in a List).
Example:
Input: {"a": 1, "b": 2, "c": 3}
Output: {1="a", 2="b", 3="c"}  */


import java.util.*;
public class Map_SwappingInvertMap 
{
    	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        	HashMap<String, Integer> hm = new HashMap<String, Integer>();

       		 System.out.println("Enter Size for Add Data:");
        	int size = sc.nextInt();
        	sc.nextLine(); 
       		 for (int i = 0; i < size; i++) 
		{
            		System.out.println("Enter A Character and Value:");
            		String key = sc.nextLine();
            		int value = sc.nextInt();
            		sc.nextLine(); 
	                hm.put(key, value);
        	}

       		 System.out.println("Original Map");
        	 Set<Map.Entry<String, Integer>> set = hm.entrySet();
        	 for (Map.Entry<String, Integer> m : set) 
		{
            		System.out.println(m.getKey() + "\t" + m.getValue());
        	}

        	HashMap<Integer, String> hm2 = new HashMap<Integer, String>();
		set = hm.entrySet();

        	for (Map.Entry<String, Integer> m :set) 
		{
            		int value = m.getValue();
            		String key = m.getKey();
            		hm2.put(value, key);
		}

        	System.out.println("Inverted Map");
        	Set<Map.Entry<Integer, String>> s = hm2.entrySet();
        	for (Map.Entry<Integer, String> m : s) 
		{
            		System.out.println(m.getKey() + "\t" + m.getValue());
                   }	   
          }      
 }
