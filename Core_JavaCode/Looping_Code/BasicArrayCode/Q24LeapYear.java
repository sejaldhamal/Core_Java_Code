/*24. Check Leap Year
Description: Write a program to check if a given year is a leap year.
Input: year = 2020
Output: Leap Year
*/
package BasicArrayCode;
import java.util.*;
public class Q24LeapYear {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=xyz.nextInt();
		if(year%4==0)
		{
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}

	}

}
