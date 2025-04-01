/*Q2. Remove Duplicates Using Set
Write a program that removes duplicate elements from a List using a HashSet and prints the cleaned list.*/

import java.util.*;
public class Hashset_RemoveDuplicates
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		HashSet<Integer> hs=new HashSet<Integer>();
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			int no=sc.nextInt();
			hs.add(no);
		}
		System.out.println("Display The Element");
		for(Integer itr:hs)
		{
			System.out.println(itr);
		}
	
	}
}


