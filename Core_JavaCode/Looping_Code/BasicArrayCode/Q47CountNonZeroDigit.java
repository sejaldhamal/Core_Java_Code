/*47. Count Non-Zero Digits
Description: Write a program to count the number of non-zero digits in a number.
Input: n = 1203
Output: 3
*/



package BasicArrayCode;
import java.util.*;
public class Q47CountNonZeroDigit {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=xyz.nextInt();
		int count=0;
		while(no>0)
		{
			int rem=no/10;
			if(rem!=0)
			{
				
				count++;
				
			}
			no=no/10;
			
		}
		System.out.println(count);

	}

}
