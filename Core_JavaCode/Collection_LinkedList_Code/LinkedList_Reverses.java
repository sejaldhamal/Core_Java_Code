/*Q7. List Reversal Using LinkedList
Write a program that reverses the order of elements in a LinkedList using an iterator.
Program:*/

import java.util.*;
public class LinkedList_Reverses
{
	
    public static void main(String args[])
   {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> l1 = new LinkedList<>();

        System.out.println("Enter Size:");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) 
	{
            int no = sc.nextInt();
            l1.add(no);
        }

        System.out.println("Display List Elements without Reverse:");
        for (Integer value : l1) 
	{
            System.out.println(value);
        }

        System.out.println("Display List Elements with Reverse:");
        for (int i = l1.size() - 1; i >= 0; i--) 
	{
            System.out.println(l1.get(i));
        }
    }
}
