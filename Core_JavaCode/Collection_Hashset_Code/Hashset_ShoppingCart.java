/*Question4:  Unique Items Shopping Cart Using Set
  Description: Use a HashSet to manage a shopping cart where no duplicate items are allowed. 
  Add items, remove an item, and check if a specific item is already in the cart.*/

import java.util.*;
public class Hashset_ShoppingCart
{
    public static void main(String args[]) 
	{
        	Scanner sc = new Scanner(System.in);
        	HashSet hs = new HashSet();

       		System.out.println("Enter the number of items to add:");
        	int size = sc.nextInt();
        	sc.nextLine(); 

        	for (int i = 0; i < size; i++) 
		{
           		 System.out.println("Enter item " + (i + 1) + ":");
           		 String item = sc.nextLine();
			 boolean b=hs.add(item);
            		 if (b) 
			 {
               			 System.out.println("Item added successfully...");
            		 } 
			else 
			{
                		System.out.println("Item already exists in the cart...");
            		}
        	}

        	
        	System.out.println("Enter item to remove:");
       		String removeItem = sc.nextLine();
		boolean b=hs.remove(removeItem);
        	if (b) 
		{
            	System.out.println("Item removed successfully...");
        	            } 
	else 
		{
            	System.out.println("Item not found in the cart...");
       		 }

                System.out.println("Enter item to check:");
        	String checkItem = sc.nextLine();
		b=hs.contains(checkItem);
        	if (b) 
		{
            		System.out.println("Item exists in the cart...");
        	} 
		else 
		{
            		System.out.println("Item not found in the cart...");
       		 }
           }
}


