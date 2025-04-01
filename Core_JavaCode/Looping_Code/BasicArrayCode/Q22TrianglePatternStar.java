
/*22. Print Triangle of Stars
Description: Write a program to print a triangle of stars.
Input: n = 4
Output:
	
	
*
**
***
****
*/

package BasicArrayCode;
import java.util.*;
public class Q22TrianglePatternStar {

	public static void main(String[] args) {
		for(int i=1 ; i<=4 ; i++)
		{
			for(int j=1 ; j<=4 ; j++)
			{
				if(j<=i)
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
