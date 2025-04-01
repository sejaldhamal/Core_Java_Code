/*Q4.  Set Operations: Create a HashSet to store unique elements
 case 1: add elements to the set
 case 2: checking if an element exists
 case 3: finding the size of the set.*/
 
 import java.util.*;
	   public class Collection_Hashset_Add_SearchElement_Size
	 {
	    public static void main(String x[])
		{
			Scanner xyz=new Scanner(System.in);
	   
	   HashSet hs=new HashSet();
	   System.out.println("1.Add Element to set");
	   System.out.println("2.Checking if an Element exists");
	   System.out.println("3.find the size of the set");
	    
	   
	   do{
	  
	   System.out.print("Enter your Choice: ");
	   int choice=xyz.nextInt();
	   
	   switch(choice)
	   {
	  
	   case 1:
		      System.out.print("Enter the size of the Hashset: ");
			  int size=xyz.nextInt();
			 
			  
			  for(int i=0; i<size ; i++)
			  {
			     int no=xyz.nextInt();
				 hs.add(no);
				 }
			break;
			
		 case 2:
		    System.out.print("Enter the value u want to search: ");
			int search=xyz.nextInt();
			
			boolean b=hs.contains(search);
			if(b)
			{
			   System.out.println("Value found");
			   }
			 else{
			      System.out.println("Value not found");
			   }
			break;
		
		case 3:
		    int count=hs.size();
			System.out.println("Size of the set is: "+count);
			
			break;
			
		default:
			    System.out.println("Invalid Input");
				break;
				}
			}while(true);
		}
	}
				
				 
				 
				 
				 


