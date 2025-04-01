package org.collection;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_AddnewelementsInArrayList {

	public static void main(String[] args) {
		
     Scanner xyz=new Scanner(System.in);
      ArrayList al=new ArrayList();
      al.add(100);
      al.add(200);
      al.add(300);
      al.add(400);
      al.add(500);

   do{
	   System.out.println("Array List Operations:");
	   System.out.println("1.Add 10 values ");
	   System.out.println("2.Display all values ");
	   System.out.println("3.Add New Values ");
	   System.out.println("4.Search Value");
	   System.out.println("5.Sort in Ascending order ");
	   System.out.println("6.Sort in Descending order ");
	   System.out.println("7.Find Max Value ");
	   System.out.println("8.Find Min Value ");
	   System.out.println("
	   Update Value ");
	   System.out.println("Delete Value");
	  
	   System.out.println("Enter your Choice: ");
       int choice=xyz.nextInt();

    switch(choice)
    {
     
     case 1:
    	System.out.println("Display all elements in arraylist");
    	System.out.println("ArrayList: " +al);
      break;
     case 2: 
    	 boolean b=al.add(700);
    	 if(b)
    	 {
    		 System.out.println("New Element is add");
    	 }
    	 else {
    		 System.out.println("Some problem is there");
    	 }
    	 
     break;
     case 3:
    	 boolean b1=al.contains(200);
    	 if(b1)
    	 {
    		 System.out.println("Element found");
    	 }
    	 else {
    		 System.out.println("Element not found");
    	 }
    	 
    	break;
    	
     
    
    }
   }while(true);
}
}