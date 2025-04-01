/*
60. Power of a Number
Description: Write a program to calculate the power of a number x^y.
Input: x = 2, y = 3
Output: 8
*/
package BasicArrayCode;

public class Q60_PowerOfNumber {

	public static void main(String[] args) {
		int x=2,y=3,power=1;
		for(int i=1 ;i<=y ; i++)
		{
			power=power*x;
		}
  System.out.println(power);
	}

}
