
/*37. Print Square Star Pattern
Description: Write a program to print a square pattern using stars.
Input: n = 4
Output:
****
****
****
****
*/
package BasicArrayCode;

public class Q37SquarePattern {

	public static void main(String[] args) {
		for(int i=1 ; i<=4 ; i++)
		{
			for(int j=1 ; j<=4 ; j++)
			{
                System.out.print("*");
			}
			System.out.println();
	}

}
}