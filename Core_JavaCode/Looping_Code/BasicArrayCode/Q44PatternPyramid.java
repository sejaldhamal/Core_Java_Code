
/*44. Print Star Pyramid
Description: Write a program to print a pyramid using stars.
Input: n = 5
Output:

    *
   ***
  *****
 *******
*********

*/

package BasicArrayCode;

public class Q44PatternPyramid {

	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++)
		{
			for(int j=1 ; j<=9 ; j++)
			{
				if(j>=6-i && j<5+i)
				{
					System.out.print("*");
				}
				else{
					
					System.out.print(" ");
				   }
				
					
					
				}
			System.out.println();
			 }
		}

	}


