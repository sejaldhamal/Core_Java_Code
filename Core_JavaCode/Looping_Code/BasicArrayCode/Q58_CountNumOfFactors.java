
/*58. Number of Factors
Description: Write a program to count the number of factors of a number.
Input: n = 12// 1 2 3 4 6 12=6
Output: 6
*/
package BasicArrayCode;

public class Q58_CountNumOfFactors {

	public static void main(String[] args) {
		int count=0;
		int n=12;
		for(int i=1 ; i<=n ; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
	System.out.println(count);
	}

}
