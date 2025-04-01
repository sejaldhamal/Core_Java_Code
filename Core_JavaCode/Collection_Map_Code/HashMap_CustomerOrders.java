/*Question5:  Track Customer Orders Using HashMap
 Description: Create a HashMap to store customer names (keys) and their list of ordered items (values).
 Add, remove, and modify orders, and display all orders for a specific customer.*/

import java.util.*;
public class HashMap_CustomerOrders
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		HashMap hm=new HashMap();
		System.out.println("Enter the number of customers:");
        	int size = sc.nextInt();
        	sc.nextLine(); 

        	for (int i = 0; i < size; i++)
		 {
            		System.out.println("Enter Customer Name:");
            		String name = sc.nextLine();
           	        System.out.println("Enter the number of items in the order:");
            		int numItems = sc.nextInt();
            		sc.nextLine(); 

           	        ArrayList items = new ArrayList();
            		for (int j = 0; j < numItems; j++) 
			{
                		System.out.println("Enter item " + (j + 1) + ":");
                		String item = sc.nextLine();
                		items.add(item);
            		}

            		hm.put(name, items);
        	}

        	System.out.println("Enter customer name to remove:");
        	String removeName = sc.nextLine();
		boolean b=hm.containsKey(removeName);
        	if (b) 
		{
            		hm.remove(removeName);
            		System.out.println("Customer removed successfully...");
       	        } 
		else 
		{
            		System.out.println("Customer not found...");
        	}
		System.out.println("After remove Customer Data:");

		Set<Map.Entry> set=hm.entrySet();
		for(Map.Entry m:set)
		{
			System.out.println(m.getKey()+"\t"+m.getValue());
		}
        	System.out.println("Enter customer name to display orders:");
		String displayName = sc.nextLine();
		b = hm.containsKey(displayName);
		if (b) 
		{
    			System.out.println("Orders for " + displayName + ":");
   		        Object  orders= hm.get(displayName);
    			System.out.println(orders);
    			
		} 
		else 
		{
    			System.out.println("Customer not found...");
		}

   	 }
}



