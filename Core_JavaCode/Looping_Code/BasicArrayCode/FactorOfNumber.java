/*2. Factorial of a Number
Description: Write a program to compute the factorial of a given number n.
Input: n = 4


Output: 24
.  */

package BasicArrayCode;
import java.util.*;
public class FactorOfNumber {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=xyz.nextInt();
		int fact=1;
		for(int i=1 ; i<=n ; i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
