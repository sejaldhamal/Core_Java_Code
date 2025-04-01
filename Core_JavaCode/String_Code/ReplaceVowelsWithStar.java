/*Q2.Replace All Vowels with a Specific Character ?
Input: "hello", replacement = '*'
Output: "h*ll*"

*/

import java.util.*;
public class ReplaceVowelsWithStar
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=xyz.nextLine();
		String result="";   //take empty string and store the resultant string 
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);  //extract the character from string
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				result+="*";           //if vowels then store * at that position
			}
			else{
				result+=ch;            //store as it is character at that position
			}
		}
		System.out.println("Final output after Replacement of vowels: "+result);
	}
}
