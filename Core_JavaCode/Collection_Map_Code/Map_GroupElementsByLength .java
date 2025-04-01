/*10. Group Elements by Their Length
Write a program that groups strings by their length using a Map<Integer, List<String>>. The key will be the length of the strings, and the value will be a list of strings that have that length.
Example:
Input: ["apple", "banana", "cat", "dog", "elephant"]
Output: {3=["cat", "dog"], 5=["apple"], 6=["banana"], 8=["elephant"]}  */


import java.util.*;
public class Map_GroupElementsByLength 
{
    	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Enter size for add the String");
		int size=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<size;i++)
		{
			String name=sc.nextLine();
			al.add(name);
		}
		System.out.println("Display All Strings");
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Object obj=itr.next();
			System.out.print(obj + "\t");
		}
             HashMap<Integer, List<String>> hm = new HashMap<Integer, List<String>>();

        	for (String str : al)
		{
            		int length = str.length();
			al = new ArrayList<String>();
                	al.add(str);
                	hm.put(length, al);
            	}
		System.out.println("\n"+hm);
       }
}
