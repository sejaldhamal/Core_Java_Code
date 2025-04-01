 /*Q3. Merging Two Lists
Merge two ArrayList objects into one, making sure that
 the merged list does not contain duplicates.*/
 import java.util.*;
 public class MergeArrayList
 {
  public static void main(String x[])
  { 
       
      ArrayList al=new ArrayList();
	  al.add(10);
	  al.add(20);
	  al.add(10);
	 System.out.println("First ArrayList Elements are: "+al);
	 

	 ArrayList al2=new ArrayList();
	  al2.add(60);
	  al2.add(70);
	  al2.add(80);
	  	 System.out.println("Second ArrayList Elements are: "+al2);
	  
	  ArrayList al3=new ArrayList();
	  al3.addAll(al);
	  al3.addAll(al2);
	  
	  LinkedHashSet l=new LinkedHashSet();
	  l.addAll(al3);
	  System.out.println("Merged array is: "+l);
	 }
}	 

