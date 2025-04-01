 /* Q3.Stack Implementation - Implement a stack using Stack 
  case 1: push()
  case 2: pop()
  case 3: peek() operations.
  case 4: display stack value using last in first out */
  
  import java.util.*;
	   public class Collection_Push_Pop_Peek_StackValue
	 {
	    public static void main(String x[])
		{
			Scanner xyz=new Scanner(System.in);
	   Stack s1=new Stack();
	   System.out.println("1.Using push()method");
	   System.out.println("2.Using pop()method");
	   System.out.println("3.Using peek()Operation");
	   System.out.println("4.Display stack value using last in first out");
	   
	   do{
	  
	   System.out.print("Enter your Choice: ");
	   int choice=xyz.nextInt();
	   
	   switch(choice)
	   {
	   case 1:
	        System.out.print("Enter how many value u want to add: ");
			int size=xyz.nextInt();
			
			for(int i=0 ; i<size ; i++)
			{
			     int no=xyz.nextInt();
				 s1.push(no);
				 }
			break;
	    case 2:
		   boolean b=s1.empty();
				    
			  if(b) {
					System.out.println("Stack is underflow");
				}
				else {
					Object obj=s1.pop();
				   System.out.println("Removed data from stack: "+obj);
				}
				break;
			case 3:
			 b=s1.empty();
			 
			 if(b){
			      System.out.println("Stack is underflow");
				  }
				 else{
				 Object obj=s1.peek();
				 System.out.println("Last Element from stack is: "+obj);
				 }
				 break;
				
              case 4:
			  ListIterator li=s1.listIterator(s1.size());
			  
			  while(li.hasPrevious())
			  {
			     Object obj=li.previous();
				 System.out.println(obj);
				 }
				break;
				
				case 5:
				System.exit(0);
			
			    default:
				System.out.println("Wrong choice");
				break;
			}
		} while (true);

	}
}

			

