/*5. Palindrome Number
Description: Write a program to check if a number is a palindrome.
Input: n = 121 
Output: Palindrome */

package BasicArrayCode;
import java.util.*;
public class Q5PalindromeNumber {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=xyz.nextInt();
		int temp=no;
	int rev=0;	
	while(no>0)
	{
	  int rem=no%10;
	  rev=10*rev+rem;
	  no=no/10;
	}
	System.out.println(rev);
if(rev==temp)
{
	System.out.println("Palindrome");
}
else {
	System.out.println("Not Palindrome");
}
	}

}
