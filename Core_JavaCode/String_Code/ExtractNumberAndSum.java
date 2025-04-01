/*Q1. WAP program input the string from keyboard and extract number from string and calculate its sum?
Example: abc123mno45stv
Output: Sum is 15

Program:*/

import java.util.*;
public class ExtractNumberAndSum
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter string : ");
		String s=xyz.next();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=48 && ch<=57){
				sum=sum+(ch-48);
			}
		}
		System.out.println("Sum of digits is: "+sum);
	}
}
