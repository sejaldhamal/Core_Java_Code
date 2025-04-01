/*Q2. WAP to convert lowercase string to uppercase without using inbuilt function?
*/

import java.util.*;
public class LowerToUpperWithoutInbuilt
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter String: ");
		String str=xyz.nextLine();
		String newStr="";
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='a'&& str.charAt(i)<='z'){
				char upper =(char)((int)str.charAt(i)-32);
				newStr+=upper;
			}
			else if(str.charAt(i)==' ')
                                    {
				newStr+=' ';
			}
			else{
				newStr+=str.charAt(i);
			}
		}
		System.out.println("New String after converting Lowercase to uppercase: "+newStr);
	}
}
/*

Enter String:
java IS OPP
New String after converting Lowercase to uppercase: JAVA IS OPP
*/