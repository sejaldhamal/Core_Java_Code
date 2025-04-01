/*3. Fibonacci Series
Description: Write a program to print the first n Fibonacci numbers.
Input: n = 5


Output: 0 1 1 2 3
*/


package BasicArrayCode;
import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
		
				Scanner xyz=new Scanner(System.in);
				System.out.println("Enter the limit: ");
				int n=xyz.nextInt();
				int first=0;
				int second=1;
						for(int i=1 ; i<=n ; i++)
						{    System.out.print(" "+first);
							int third=first+second;
							
							first=second;
							second=third;
		               }


	}

}
