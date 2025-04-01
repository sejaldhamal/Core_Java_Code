/*1. Find the Frequency of Elements in an Array
Write a program to find the frequency of each element in a given array of integers. Use a Map<Integer, Integer> to store the frequency of each element.
Example:
Input: [1, 2, 2, 3, 3, 3, 4, 4, 4, 4]
Output: {1=1, 2=2, 3=3, 4=4} */

import java.util.*;
public class HashMap_frequencyofNumber{
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter values in array");
		for (int i = 0; i < a.length; i++) {
			a[i] = xyz.nextInt();
		}
	LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			Integer count = map.get(a[i]);
			if (count == null) {
				count = new Integer(0);
			}
			System.out.printf("%d ", a[i]);
			++count;
			map.put(a[i],count);
		}
		System.out.println();
		Set<Map.Entry<Integer, Integer>> set = map.entrySet();
		for (Map.Entry<Integer, Integer> m : set) {
			System.out.println(m.getKey() + "\t" + m.getValue());
		}
	}
}


