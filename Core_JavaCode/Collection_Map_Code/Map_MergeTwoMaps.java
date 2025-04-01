/*4. Merge Two Maps
Write a program that merges two Map objects. If the same key exists in both maps, sum their values.
Example:
Map<String, Integer> map1 = Map.of("a", 1, "b", 2);
Map<String, Integer> map2 = Map.of("b", 3, "c", 4);
Output: {"a": 1, "b": 5, "c": 4}  */


import java.util.*;
public class Map_MergeTwoMaps
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
           		 System.out.println("Enter A Character and Their Value:");
           		 String key = sc.nextLine();
            		 int value = sc.nextInt();
            		 sc.nextLine(); 
	                 tm.put(key, value);
       		 }

        	            TreeMap<String, Integer> tm1 = new TreeMap<>();

     		System.out.println("Enter size For Second TreeMap");
       		int size1 = sc.nextInt();
               	sc.nextLine(); 
        	            for (int i = 0; i < size1; i++) 
		{
           		 System.out.println("Enter A Character and Thier Value:");
           		 String key = sc.nextLine();
            		 int value = sc.nextInt();
           		 sc.nextLine(); 
	                 tm1.put(key, value);
       		 }

        	            System.out.println("Merge To Map");
		
		Set<Map.Entry<String, Integer>> s = tm1.entrySet();
		for (Map.Entry<String, Integer> m : s)
		{
            		String key = m.getKey();
                	int value = m.getValue();

            		if (tm.containsKey(key)) 
			{
                		tm.put(key, tm.get(key) + value);
            		} 
			else 
			{
                		tm.put(key, value);
           		}
        	}

        	Set<Map.Entry<String, Integer>> set = tm.entrySet();
        	for (Map.Entry<String, Integer> m : set) 
		{
            		System.out.println(m.getKey() + "\t" + m.getValue());
        	        }
    	}
}
