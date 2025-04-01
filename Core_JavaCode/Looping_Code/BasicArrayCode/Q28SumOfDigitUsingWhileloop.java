/*28. Sum of Digits Using While Loop
Description: Write a program to calculate the sum of digits using a while loop.
Input: n = 123


Output: 6
*/
package BasicArrayCode;
import java.util.*;
public class Q28SumOfDigitUsingWhileloop {

	public static void main(String[] args) {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter number");
	int no=xyz.nextInt();
	int sum=0,rem;
	while(no>0)
	{
		rem=no%10;
		sum=sum+rem;
		no=no/10;
	}
	System.out.println(sum);
	}

}
