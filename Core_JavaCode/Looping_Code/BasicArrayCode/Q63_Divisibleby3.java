/*63. Count Digits Divisible by 3
Description: Write a program to count the digits divisible by 3 in a number.
Input: n = 123456
Output: 2
*/
package BasicArrayCode;

public class Q63_Divisibleby3 {

	public static void main(String[] args) {
		int no=123456;
		int count=0;
		while(no>0)
		{
			int rem=no%10;
			if(rem%3==0)
			{
				count++;
			}
			no=no/10;
		}
		System.out.println(count);
	}

}
