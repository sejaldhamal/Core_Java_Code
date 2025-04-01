/*Q2. WAP to create a vector and store 5 values in it and search value by using its id.*/

 import java.util.*;
  public class Vector_SearchValueById
  {
    public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
	  Vector<Integer> v=new Vector<>();
	  v.add(10);
	  v.add(30);
	  v.add(40);
	  v.add(50);
	  v.add(60);
	  
	 System.out.println("Enter the search index");
	 int search=xyz.nextInt();
	 if(search>=0 && search<v.size())
	 {
	   int value=v.get(search);
	   System.out.println("value at index "+search+" is "+value);
	   }
	  }
	 }
