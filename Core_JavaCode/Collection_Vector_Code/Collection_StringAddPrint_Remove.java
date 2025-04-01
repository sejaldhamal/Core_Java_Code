/*Q2. LinkedList Implementation
      Create a LinkedList of strings, 
      case 1: add some element
      case 2: print the list
      case 3: remove elements from the front and rear.*/
	  
	   import java.util.*;
	   public class Collection_StringAddPrint_Remove
	 {
	    public static void main(String x[])
		{
			Scanner xyz=new Scanner(System.in);
	   LinkedList al=new LinkedList();
	   System.out.println("1.Add Element");
	   System.out.println("2.Print the List");
	   System.out.println("3.Remove element from front and rear");
	   
	   do{
	  
	   System.out.print("Enter your Choice: ");
	   int choice=xyz.nextInt();
	   
	   switch(choice)
	   {
	      case 1:
		      System.out.print("Enter the size of the Arraylist: ");
			  int size=xyz.nextInt();
			  xyz.nextLine();
			  
			  for(int i=0; i<size ; i++)
			  {
			     String str=xyz.nextLine();
				 al.add(str);
				 }
			break;
			
		 case 2:
		    
			   
			   for(Object obj: al)
			   {
				   String data=(String)obj;
				   System.out.println(obj+"\t");
			   }
		
		break;
		case 3:
		     al.removeFirst();
			 al.removeLast();
			 
			 System.out.println("Successfully Remove element from front and rear");
			
			break;
			default:
			    System.out.println("Invalid Input");
				break;
				}
			}while(true);
		}
	}
				
				 
				 
				 
				 

