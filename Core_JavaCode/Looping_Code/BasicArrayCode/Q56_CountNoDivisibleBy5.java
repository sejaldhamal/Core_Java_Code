/*
56. Count Numbers Divisible by 5
Description: Write a program to count the numbers divisible by 5 between 1 and n.
Input: n = 20
Output: 4
*/
package BasicArrayCode;

public class Q56_CountNoDivisibleBy5 {

	public static void main(String[] args) {
		int count=0;
		for(int i=0 ;i<20 ; i++)
		{
			if(i%5==0)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
