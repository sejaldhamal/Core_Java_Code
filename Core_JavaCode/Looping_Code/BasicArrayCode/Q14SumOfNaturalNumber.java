/*14. Sum of Natural Numbers
Description: Write a program to find the sum of the first n natural numbers.
Input: n = 5

Output: 15
*/
package BasicArrayCode;
import java.util.*;
public class Q14SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		int n=5;
		int sum=0;
		for(int i=1 ; i<=n ; i++)
		{
			sum=sum+i;
			
		}
       System.out.println(sum);
	}

}
