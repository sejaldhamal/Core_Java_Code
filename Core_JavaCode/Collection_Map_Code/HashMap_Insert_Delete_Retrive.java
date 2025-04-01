
/*Que 5: HashMap Basic Operations
Create a HashMap to store key-value pairs, and perform operations such as insertion, deletion, and retrieval.*/

  import java.util.*;
	   public class HashMap_Insert_Delete_Retrive
	 {
	    public static void main(String x[])
		{
			Scanner xyz=new Scanner(System.in);
	   
	   HashMap m1=new HashMap();
	   System.out.println("1.Insert Element into Hashmap");
	   System.out.println("2.delete Element from hashmap");
	   System.out.println("3.Retrieve Element from hashmap");
	    
	   
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
			     int key=xyz.nextInt();
				 xyz.nextLine();
				 int value=xyz.nextInt();
				 m1.put(key,value);
				 }
			break;
			
		 case 2:
		    System.out.print("Enter the value u want to delete: ");
			int delete=xyz.nextInt();
			
	        m1.remove(delete);
			break;
		
		case 3:
		    Set keys=m1.keySet();
			Iterator i=keys.iterator();
			while(i.hasNext())
			{
			  Object key=i.next();
			  Object value=m1.get(key);
			  
			  System.out.println(key+"\t"+value);
			}
			break;
			
		default:
			    System.out.println("Invalid Input");
				
				}
			}while(true);
		}
	}
				
				 
				 
				 
				 


