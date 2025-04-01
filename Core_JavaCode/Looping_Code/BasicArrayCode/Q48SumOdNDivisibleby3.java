
/*48. Sum of First N Divisible by 3
Description: Write a program to calculate the sum of the first n numbers divisible by 3.
Input: n = 4
Output: 18
*/
package BasicArrayCode;
import java.util.*;
public class Q48SumOdNDivisibleby3 {

	public static void main(String[] args) {
	Scanner xyz=new Scanner(System.in);
	System.out.println("Enter the limit number");
	int limit=xyz.nextInt();
	int sum=0;
	int count=0;
	int i=1;
	while(count<limit)
	{
		if(i%3==0)
		{
		sum=sum+i;
		count++;
		}
		i++;
	}
	
	System.out.println(sum);
	}

}
