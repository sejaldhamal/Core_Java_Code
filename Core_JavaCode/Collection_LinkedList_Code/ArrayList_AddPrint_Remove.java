 /*Q1. Basic ArrayList Operations & Create an ArrayList of integers,
     case 1: add some elements
     case 2: print the list
     case 3: remove an element at a specific index.*/
	 
	 import java.util.*;
	 public class ArrayList_AddPrint_Remove
	 {
	    public static void main(String x[])
		{
			Scanner xyz=new Scanner(System.in);
	   ArrayList al=new ArrayList();
	   System.out.println("1.Add Element");
	   System.out.println("2.Print the List");
	   System.out.println("3.Remove element at specific index");
	   
	   do{
	  
	   System.out.print("Enter your Choice: ");
	   int choice=xyz.nextInt();
	   
	   switch(choice)
	   {
	      case 1:
		      System.out.print("Enter the size of the Arraylist: ");
			  int size=xyz.nextInt();
			  
			  for(int i=0; i<size ; i++)
			  {
			     int no=xyz.nextInt();
				 al.add(no);
				 }
			break;
			
		 case 2:
		    Iterator i=al.iterator();
			while(i.hasNext())
			{
			   Object obj=i.next();
			   System.out.println(obj);
			   }
		
		break;
		case 3:
		     System.out.print("Enter the index which u want to remove:");
			 int index=xyz.nextInt();
			 
			 al.remove(index);
			
			break;
			default:
			    System.out.println("Invalid Input");
				break;
				}
			}while(true);
		}
	}
				
				 
				 
				 
				 
