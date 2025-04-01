/*Q3.Check if a String Contains Only Digits ?
Input: "12345"
Output: true

*/

import java.util.*;
public class CheckStringContainOnlyDigits
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s=xyz.nextLine();
		
		boolean result=false;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=48&&ch<=57){
				result=true;
			}
			else{
				result=false;
				break;
			}
		}
		System.out.println("String contain Only Digits: "+result);
	}
}

