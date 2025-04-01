/*Q4. Finding Common Elements Between Two Sets
Write a program that takes two HashSet objects and prints the
 elements that are common to both*/
 
 import java.util.*;
 public class CommonElement_Find_Using_Hashset
 {
    public static void main(String x[])
	{
	  HashSet h1=new HashSet();
	  h1.add(10);
	  h1.add(20);
	  h1.add(30);
	  h1.add(40);
	  System.out.println("First Hashset Elements are: "+h1);
	  HashSet h2=new HashSet();
	  h2.add(10);
	  h2.add(50);
	  h2.add(30);
	    System.out.println("Second Hashset Elements are: "+h2);
	  h1.retainAll(h2);
	  
	  System.out.println("Common Elements are: "+h1);
	  }
	 }
