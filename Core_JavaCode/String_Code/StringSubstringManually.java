/*Q8. WAP to implement the substring() method manually?


*/
import java.util.*;
public class StringSubstringManually
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter input string:");  //input string 
		String str=xyz.nextLine();
		System.out.println("Enter index of substring starting and last till substring: ");
		int sIndex=xyz.nextInt();  //starting index of substring
		int lIndex=xyz.nextInt();  //ending index of substring
		
		String result="";  //empty string for store resultant string
		
		for(int i=sIndex;i<lIndex;i++)
		{
			result+=str.charAt(i);  //add characters in result according to index 
		}
		System.out.println("Resultant Substring is: "+result);
	}
}
/*

Enter input string:
morning
Enter index of substring starting and last till substring:
1
4
Resultant Substring is: orn
*/
