/*
57. Sum of Divisors
Description: Write a program to calculate the sum of divisors of a number.
Input: n = 12
Output: 28
*/
package BasicArrayCode;

public class Q57_SumOfDivisor {

	public static void main(String[] args) {
		int sum=0;
	int n=12;
	for(int i=1 ; i<=n ; i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
	}
	
System.out.println(sum);
	}

}
