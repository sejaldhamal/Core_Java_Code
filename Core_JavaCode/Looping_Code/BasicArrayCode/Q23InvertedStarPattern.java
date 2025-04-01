
/*23. Print Inverted Star Pattern
Description: Write a program to print an inverted star pattern.
Input: n = 4


Output:
****
***
**
*
*/

package BasicArrayCode;

public class Q23InvertedStarPattern {

	public static void main(String[] args) {
		for(int i=1 ; i<=4 ; i++)
		{
			for(int j=4 ; j>=1 ; j--)
			{
				if(j>=i)
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
