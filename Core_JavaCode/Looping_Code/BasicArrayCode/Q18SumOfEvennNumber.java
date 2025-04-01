

/*18. Sum of First N Even Numbers
Description: Write a program to calculate the sum of the first n even numbers.
Input: n = 4


Output: 20
*/


package BasicArrayCode;
public class Q18SumOfEvennNumber {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1 ; i<=4 ; i++)
		{
			if(i%2==0)
				
			{
				sum=sum+i;
			}
			
		}
		System.out.println(sum);


	}

}
