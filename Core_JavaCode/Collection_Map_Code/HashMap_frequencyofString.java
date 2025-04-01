/*2. Count Words in a String
Write a program to count the occurrences of each word in a given string. Use a Map<String, Integer> to store the word and its count.
Example:
Input: "this is a test this is a test"
Output: {this=2, is=2, a=2, test=2} */

   import java.util.*;
   public class HashMap_frequencyofString{
	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		int a[] = new int[10];
		System.out.println("Enter values in array");
		for (int i = 0; i < a.length; i++) {
			a[i] = xyz.nextInt();
		}
	   LinkedHashMap<String, Integer> map = new LinkedHashMap<String,Integer>();
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
		Set<Map.Entry<String,String>> set = map.entrySet();
		for (Map.Entry<String,String> m : set) {
			System.out.println(m.getKey() + "\t" + m.getValue());
		}
	}
}




