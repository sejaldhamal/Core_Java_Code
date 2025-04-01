/*59. Print Hollow Square
Description: Write a program to print a hollow square pattern.
Input: n = 5


Output:
 *****
*   *
*   *
*   *
*****

*/

package BasicArrayCode;

public class Q59Hollow_Pattern {

	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=5 ; j++)
			{
				if(j==1 || j==5 || i==1 || i==5)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
         	}
			System.out.println();
		}		
	}
}
