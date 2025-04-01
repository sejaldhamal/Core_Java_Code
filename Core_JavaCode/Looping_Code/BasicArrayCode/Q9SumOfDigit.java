/*9. Sum of Digits
Description: Write a program to calculate the sum of digits of a given number.
Input: n = 234
Output: 9*/
package BasicArrayCode;
import java.util.*;
public class Q9SumOfDigit {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=xyz.nextInt();
	int sum=0;	
	while(no>0)
	{
	  int rem=no%10;
	 sum=sum+rem;
	  no=no/10;
	}
	System.out.println(sum);

	


	}

}
