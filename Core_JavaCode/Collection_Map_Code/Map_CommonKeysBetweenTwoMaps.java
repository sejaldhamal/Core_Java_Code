/*7. Find the Common Keys Between Two Maps
Write a program that finds the common keys between two Map objects and outputs them in a set.
Example:
Map<String, Integer> map1 = Map.of("a", 1, "b", 2, "c", 3);
Map<String, Integer> map2 = Map.of("b", 3, "c", 4, "d", 5);
Output: {"b", "c"}  */


import java.util.*;
public class Map_CommonKeysBetweenTwoMaps
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

        	TreeMap<String, Integer> tm1 = new TreeMap<String, Integer>();

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
		System.out.println("Display Data From First Map");
		Set<Map.Entry<String, Integer>> set=tm.entrySet();
		for(Map.Entry<String, Integer> m:set)
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
		System.out.println("Display Data From Second Map");
		 set=tm1.entrySet();
		for(Map.Entry<String, Integer> m:set)
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}


		System.out.println("common keys between two Map");
		Set<Map.Entry<String, Integer>> s = tm1.entrySet();
		for (Map.Entry<String, Integer> m : s)
		{
            		String key = m.getKey();
                	int value = m.getValue();

            		if (tm.containsKey(key)) 
			{
                		System.out.println(m.getKey());
            		         } 
	}         }
}
