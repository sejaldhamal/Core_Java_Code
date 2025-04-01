
/*32. Multiplication of Numbers from 1 to N
Description: Write a program to find the multiplication of all numbers from 1 to n.
Input: n = 4
Output: 24
*/
package BasicArrayCode;
import java.util.*;
public class Q32MultiplicationofNum {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the Limit number");
		int n=xyz.nextInt();
		int fact=1;
		for(int i=1 ; i<=n ; i++)
		{
			fact=fact*i;
			
		}
    System.out.println(+fact);
	}

}
