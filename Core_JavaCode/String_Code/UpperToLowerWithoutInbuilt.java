/*Q3. WAP to convert uppercase string to lowercase without using inbuilt function?
*/

import java.util.*;
public class UpperToLowerWithoutInbuilt
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String: ");
		String s1=xyz.nextLine();
		String s2="";
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z'){
				char lower=(char)((int)s1.charAt(i)+32);
				s2+=lower;
			}
			else if(s1.charAt(i)==' ')
                                   {
				s2+=' ';
			}
			else{
				s2+=s1.charAt(i);
			}
		}
		System.out.println("String Upper case to Lower case: "+s2);
	}
}		
/*

Enter String:
java IS N123 * Yes YASS
String Upper case to Lower case: java is n123 * yes yass
*/