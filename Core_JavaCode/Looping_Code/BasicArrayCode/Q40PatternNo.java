/*40. Number Pyramid Pattern
Description: Write a program to print a number pyramid pattern.
Input: n = 4
Output:

    1
   121
  12321
 1234321
*/



package BasicArrayCode;
import java.util.*;
public class Q40PatternNo {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		/*System.out.println("Enter the row numbers:");
		int row=xyz.nextInt();
		System.out.println("Enter the column numbers:");
		int column=xyz.nextInt();*/
		for(int i=1 ; i<=4 ; i++)
		{  int c=1;
			for(int j=1; j<=7 ; j++)
			{
				      if(j>=5-i && j<=i+3)
				      {
					      if(j<4)
					      {
					        System.out.printf("%d",c++);
					       }
				           else {
					        System.out.printf("%d",c--);
				                }
				       }
					else {
						System.out.print(" ");
					   }
	        }
			System.out.println();

		}
	}
}
