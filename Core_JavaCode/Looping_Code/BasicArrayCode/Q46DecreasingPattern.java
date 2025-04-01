/*46. Print Decreasing Number Pattern
Description: Write a program to print a decreasing number pattern.
Input: n = 5
Output:
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
*/
package BasicArrayCode;

public class Q46DecreasingPattern {

	public static void main(String[] args) {
		for(int i=1 ; i<=5 ; i++)
		{   int c=6-i;
			for(int j=1; j<=5 ; j++)
			{
				if(j<=6-i)
				{
					System.out.printf("%d",c);
					c--;
				}
				else {
					System.out.printf(" ");
					
				}
			}
			
			System.out.println("\n");
			
		}
			
			
			
	}
}
