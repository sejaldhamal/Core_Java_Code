
/*35. Print Right-Angled Triangle Pattern of Numbers
Description: Write a program to print a right-angled triangle of numbers.
Input: n = 4
Output:
1
12
123
1234
*/


package BasicArrayCode;

public class Q35PatternRightAngle {

	public static void main(String[] args) {
		for(int i=1 ; i<=4 ; i++)
		{
			for(int j=1 ; j<=4 ; j++)
			{
				if(j<=i)
				{
					System.out.print(j);
				}
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
