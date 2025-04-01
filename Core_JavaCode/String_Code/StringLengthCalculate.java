/*Q1. WAP to calculate the length of a string without using the length() method?
*/

import java.util.*;
public class StringLengthCalculate
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String to calculate its length:");
		String str=xyz.nextLine();
		str=str+"\0";
		int index=0;
		while(str.charAt(index)!=0){
			index++;
		}
		System.out.println("The length of String is: "+index);
		
		System.out.println("Enter Another string: ");
		String s=xyz.nextLine();
		int i=0;
		try{
			for(;;i++)
				s.charAt(i);
		}
		catch(Exception ex){
		}
		System.out.println("The length of another String is: "+i);
		
	}
}
/*

Enter String to calculate its length:
java
The length of String is: 4
Enter Another string:
karang
The length of another String is: 6

*/
