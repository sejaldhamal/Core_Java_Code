/*Q3. WAP to input the string and find the number of words in the string without using the split() method?
Program:
*/
import java.util.*;
public class NumWordsInString
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter string:");
		String s=xyz.nextLine();
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' '){
				count++;
			}
		}
		System.out.println("Word count: "+count);
	}
}

/*Output:

Enter string:
usii udiiwu uqii kak
Word count: 4   */

