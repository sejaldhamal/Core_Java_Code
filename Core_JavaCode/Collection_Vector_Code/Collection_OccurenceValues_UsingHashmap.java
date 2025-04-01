/*Write a program that takes an array of integers and counts the frequency of each element using a HashMap.*/



import java.util.*;
public class Collection_OccurenceValues_UsingHashmap {
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
			System.out.printf("%d\t", a[i]);
			++count;
			map.put(a[i], count);
		}
		System.out.println();
		Set<Map.Entry<Integer, Integer>> set = map.entrySet();
		for (Map.Entry<Integer, Integer> m : set) {
			System.out.println(m.getKey() + "\t" + m.getValue());
		}
	}
}
