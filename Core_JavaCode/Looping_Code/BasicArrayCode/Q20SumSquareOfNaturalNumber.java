
/*20. Sum of Squares of First N Natural Numbers
Description: Write a program to calculate the sum of squares of the first n natural numbers.
Input: n = 3
Output: 14
*/

package BasicArrayCode;
import java.util.*;
public class Q20SumSquareOfNaturalNumber {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the limit number:");
		int no=xyz.nextInt();
		int i=1;
		int sum=0;
		while(i<=no)
		{
			sum=sum+(i*i);
			i++;
		}
		System.out.println(sum);

	}

}
