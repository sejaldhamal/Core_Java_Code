/*5. Find the Most Frequent Element in an Array
Write a program to find the most frequent element in an array. Use a Map to store the frequency of each element, and then determine the element with the highest frequency.
Example:
Input: [4, 5, 2, 3, 4, 5, 4]
Output: 4 */

import java.util.*;
public class Map_MostFrequencyUsingHashMap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		TreeMap<Integer, Integer> tm=new TreeMap<Integer, Integer>();
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)// 1 2 3 1 2
		{
                       Integer count=tm.get(a[i]);
                        if(count==null)
                        {
                           count=new Integer(0);
                        }	
                       ++count;   
		   	tm.put(a[i],count);
		}
		
		int maxCount = 0;
        	             int mostFrequentElement = 0;
		Set<Map.Entry<Integer, Integer>> set=tm.entrySet();
		for(Map.Entry<Integer, Integer> m:set)
		{
			 if (m.getValue() > maxCount)
			 {
               			 maxCount = m.getValue();
               			 mostFrequentElement = m.getKey();
            		 }

		}
		System.out.println("Most frequent element: " + mostFrequentElement);

		
	}
}
