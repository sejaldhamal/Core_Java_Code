
/*17. Sum of First N Odd Numbers
Description: Write a program to calculate the sum of the first n odd numbers.
Input: n = 4


Output: 16
*/




package BasicArrayCode;

public class Q17SumOfOddNum {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1 ; i<=4 ; i++)
		{
			if(i%2==1)
				
			{
				sum=sum+i;
			}
			
		}
		System.out.println(sum);

	}

}
