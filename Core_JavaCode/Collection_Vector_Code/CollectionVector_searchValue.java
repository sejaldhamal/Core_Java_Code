/*
Q1. WAP to store 5 values in Vector and search value present in vector without usign 
any inbuilt methods like as contains() or indexOf() 
Note: we can use get() method 
*/

import java.util.*;
public class CollectionVector_searchValue
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		Vector v=new Vector();
		v.add(100);
		v.add(200);
		v.add(300);
		v.add(400);
		v.add(500);
		
		System.out.println("Enter search elemnt: ");
		int num=xyz.nextInt();    
		
		
		
		Iterator itr=v.iterator();
		boolean flag=false;
		while(itr.hasNext()){
			Object obj=itr.next();
			if((int)obj == num){
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.println("Found data");
		}
		else{
			System.out.println("Not Found data");
		}
	}
}