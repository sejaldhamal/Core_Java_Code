/*Q2. WAP to store 10 string values in Vector and search string whose length is more than three and ends with sh */

import java.util.*;
public class CollectionVector_String_Search_Length
{
   public static void main(String x[])
   {
       Scanner xyz=new Scanner(System.in);
	   Vector v=new Vector();
	   
	   v.add("Sejal");
	   v.add("sneha");
	   v.add("akash");
	   v.add("Prajkta");
	   v.add("reva");
	   v.add("Ramesh");
	   ArrayList al= new ArrayList();
	   Iterator i=v.iterator();
	   while(i.hasNext()){
		   String temp = (String)i.next();
		   if(temp.length()>3 && temp.endsWith("sh"))
		   {
			   al.add(temp);
		   }
	   }
	   System.out.println("After Checked :"+al);
   }
}