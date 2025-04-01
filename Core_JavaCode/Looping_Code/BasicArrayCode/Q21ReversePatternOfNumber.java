
/*21. Reverse Pattern of Numbers
Description: Write a program to print numbers in reverse order.
Input: n = 5


Output:
 5 4 3 2 1
*/



package BasicArrayCode;
import java.util.*;
public class Q21ReversePatternOfNumber {

	public static void main(String[] args) {
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no=xyz.nextInt();
		while(no>0)
		{
			System.out.print(" "+no);
			no=no-1;
		}
				
	

	}

}
