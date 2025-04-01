 /*Q2. Remove Duplicate Names Using Set
 Description: Given a list of names that may contain duplicates, use a HashSet to remove duplicate 
 names and print the cleaned-up list.*/
 
import java.util.*;
public class Hashset_RemoveDuplicateNames
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		HashSet hs=new HashSet();
		System.out.println("Enter Size For Adding The Names");
		int size=sc.nextInt();
		sc.nextLine();

		for(int i=0;i<size;i++)
		{        
                                   System.out.println("Enter a "+ (i+1) +" Name");
			String name=sc.nextLine();
			hs.add(name);
		}
		
		System.out.println("\nDisplay All Names");
		for(Object obj:hs)
		{
			String names=(String)obj;
			System.out.println(names);
		}
	}
}

