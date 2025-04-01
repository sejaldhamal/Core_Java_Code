/*Q1. WAP to create Vector and store 5 values in it and display it */
  
  import java.util.*;
  public class VectorStoreValue
  {
    public static void main(String x[])
	{
	  Vector v=new Vector();
	  v.add(10);
	  v.add(30);
	  v.add(40);
	  v.add(50);
	  v.add(60);
	  
	 Iterator i=v.iterator();
	 while(i.hasNext())
	 {
	    Object obj=i.next();
		System.out.println(obj);
		}
	  }
	}
	  
	  
	   
