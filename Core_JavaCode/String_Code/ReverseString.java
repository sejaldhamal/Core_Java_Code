/*Q4. WAP to input string and reverse it without using inbuilt function and copy the string data in another string?

Program:
*/
import java.util.*;
public class ReverseString
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter string:");
		String s=xyz.nextLine();
		String str=""; // Initialize an empty string to store the reversed string
		int j=0;
		// Loop from the last character to the first
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i); // Get the character at index `i`
			str+=ch; // Concatenate the character to `str`
		}
		System.out.println("Print reverse string: "+str);
	}
}

/*Output:

Enter string:
abcd
Print reverse string: dcba
*/