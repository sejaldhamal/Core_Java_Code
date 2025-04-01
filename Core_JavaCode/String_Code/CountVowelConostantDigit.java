/*Q2. WAP to input the string from the keyboard and count the vowels , constant and digit as well as special characters from the string?

Program:
*/

import java.util.*;
public class CountVowelConostantDigit
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter string:");
		String s=xyz.next();
		int vowel=0,consonant=0,digit=0,special=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				Vowel ++;
			}
			else if(((ch>='A' && ch<='Z')&& ch!='A'&& ch!='E'&& ch!='I' && ch!='O' && ch!='U') ||((ch>='a' && ch<='z')&& ch!='a'&& ch!='e'&& ch!='i'&& ch!='o'&& ch!='u'))
			{
				consotant++;
			}
			else if(ch>=48 && ch<=57){
				digit++;
			}
			else{
				special++;
			}
		}
		System.out.println("Count of vowels: "+vowel+"\nCount of consotant: "+consotant+"\nCount of digit: "+digit+"\nCount of special characters :"+special);
	}
}

/*Output:

Enter string:
absjskd893kl=30-392
Count of vowels: 1
Count of consonant: 8
Count of digit: 8
Count of special characters :2*/

