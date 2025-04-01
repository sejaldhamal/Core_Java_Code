
/*34. Find Sum of All Odd Numbers in a Range
Description: Write a program to find the sum of all odd numbers in a range from m to n.
Input: m = 1, n = 10
Output: 25

*/
package BasicArrayCode;

public class Q34SumOddInRange {

	public static void main(String[] args) {
		int m=1,n=10;
		int sum=0;
		for(int i=m ; i<=n ; i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

}
