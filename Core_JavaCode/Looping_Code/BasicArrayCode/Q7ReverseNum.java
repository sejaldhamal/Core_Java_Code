/*7. Reverse a Number
Description: Write a program to reverse the digits of a given number.
Input: n = 12345


Output: 54321
*/


package BasicArrayCode;
import java.util.*;
public class Q7ReverseNum {
    
	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=xyz.nextInt();
	int rev=0;	
	while(no>0)
	{
	  int rem=no%10;
	  rev=10*rev+rem;
	  no=no/10;
	}
	System.out.println(rev);

	}

}
